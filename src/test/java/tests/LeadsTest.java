package tests;

import models.Lead;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LeadDetailsPage;
import pages.LeadsPage;
import pages.modal.NewLeadPage;
import utils.LeadFactory;
import utils.Message;


public class LeadsTest extends BaseTest {
    private LeadsPage LeadsPage;
    private NewLeadPage NewLeadPage;
    private LeadDetailsPage LeadDetailsPage;

    @BeforeClass
    public void initialise() {
        LeadsPage = new LeadsPage(driver);
        NewLeadPage = new NewLeadPage(driver);
        LeadDetailsPage = new LeadDetailsPage(driver);
    }

    @Test(groups = {"regression"}, dataProvider = "leadTestData")
    public void createLeadTest(Lead newLead) throws InterruptedException {
        LoginPage.waitForPageLoaded();
        LoginPage.login(USER_NAME, PASSWORD);
        HomePage.waitForPageLoaded();
        HomePage.openLeadsTab();
        LeadsPage.waitForPageLoaded();
        LeadsPage.clickNewButton();
        NewLeadPage.waitForPageLoaded();
        NewLeadPage.fillForm(newLead);
        NewLeadPage.clickSaveButton();
        LeadDetailsPage.waitForPageLoaded();
        Assert.assertEquals(HomePage.getMessageText(), Message.expectedLeadMessageText(newLead.getSalutation().getName(), newLead.getFirstName(), newLead.getLastName()));
        LeadDetailsPage.getLeadInfo();
        Assert.assertEquals(LeadDetailsPage.getLeadInfo(), newLead);
        HomePage.waitLForLogoutClickable();
        HomePage.clickLogout();
    }

    @DataProvider
    public Object[][] leadTestData() {
        return new Object[][]{
                {LeadFactory.getLeadWithAllItems()},
                {LeadFactory.getLeadWithAddress()},
                {LeadFactory.getLeadWithoutAddress()}
        };
    }
}



