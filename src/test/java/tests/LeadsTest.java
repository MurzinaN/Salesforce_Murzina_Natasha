package tests;

import enums.*;
import models.Lead;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LeadDetailsPage;
import pages.LeadsPage;
import pages.modal.NewLeadPage;
import utils.Message;


public class LeadsTest extends BaseTest {
    private LeadsPage LeadsPage;
    private NewLeadPage NewLeadPage;
    private LeadDetailsPage LeadDetailsPage;
    private Message Message;

    @BeforeClass
    public void initialise() {
        LeadsPage = new LeadsPage(driver);
        NewLeadPage = new NewLeadPage(driver);
        LeadDetailsPage = new LeadDetailsPage(driver);
        Message = new Message();
    }

    @Test(groups = {"regression"}, dataProvider = "leadTestData")
    public void createLeadTest(Lead newLead) throws InterruptedException {
        LoginPage.login(USER_NAME, PASSWORD);
        HomePage.waitForPageLoaded();
        HomePage.openLeadsTab();
        LeadsPage.waitForPageLoaded();
        LeadsPage.clickNewButton();
        NewLeadPage.waitForPageLoaded();
        Lead testLead = newLead;
        NewLeadPage.fillForm(testLead);
        NewLeadPage.clickSaveButton();
        LeadDetailsPage.waitForPageLoaded();
        HomePage.getMessageText();
        Assert.assertEquals(HomePage.getMessageText(), Message.expectedLeadMessageText(testLead.getSalutation().getName(), testLead.getFirstName(), testLead.getLastName()));
        LeadDetailsPage.getLeadInfo();
        Assert.assertEquals(LeadDetailsPage.getLeadInfo(), testLead);
        HomePage.clickLogout();
    }

    @DataProvider
    public Object[][] leadTestData() {
        return new Object[][]{
                {new Lead.LeadBuilder(faker.name().lastName(), faker.company().name(), LeadStatus.CONTACTED)
                        .salutation(Salutation.MR)
                        .firstName(faker.name().firstName())
                        .phone(faker.phoneNumber().phoneNumber())
                        .email(faker.internet().emailAddress())
                        .title(faker.name().title())
                        .rating(Rating.HOT)
                        .website(faker.internet().url())
                        .street(faker.name().username())
                        .state(faker.name().username())
                        .city(faker.name().username())
                        .zip(faker.address().zipCode())
                        .country(faker.name().username())
                        .noOfEmployees("8")
                        .annualRevenue("10")
                        .leadSource(LeadSource.ADVERTISEMENT)
                        .industry(Industry.INSURANCE)
                        .description("hjfhsfjh")
                        .build()},
                {new Lead.LeadBuilder(faker.name().lastName(), faker.company().name(), LeadStatus.CONTACTED)
                        .salutation(Salutation.MR)
                        .firstName(faker.name().firstName())
                        .street(faker.name().username())
                        .state(faker.name().username())
                        .city(faker.name().username())
                        .zip(faker.address().zipCode())
                        .country(faker.name().username())
                        .leadSource(LeadSource.ADVERTISEMENT)
                        .build()},
                {new Lead.LeadBuilder(faker.name().lastName(), faker.company().name(), LeadStatus.CONTACTED)
                        .salutation(Salutation.MR)
                        .firstName(faker.name().firstName())
                        .leadSource(LeadSource.ADVERTISEMENT)
                        .build()}
        };
    }
}



