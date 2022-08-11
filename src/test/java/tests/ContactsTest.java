package tests;

import models.Contact;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.ContactDetailsPage;
import pages.ContactsPage;
import pages.modal.NewContactPage;
import utils.ContactFactory;
import utils.Message;

public class ContactsTest extends BaseTest {
    private ContactsPage ContactsPage;
    private NewContactPage NewContactPage;
    private ContactDetailsPage ContactDetailsPage;
    private ContactFactory ContactFactory;

    @BeforeClass
    public void initialise() {
        ContactsPage = new ContactsPage(driver);
        NewContactPage = new NewContactPage(driver);
        ContactDetailsPage = new ContactDetailsPage(driver);
        ContactFactory = new ContactFactory();
    }

    @Test(groups = {"regression"}, dataProvider = "ContactTestData")
    public void createContactTest(Contact newContact) throws InterruptedException {
        LoginPage.waitForPageLoaded();
        LoginPage.login(USER_NAME, PASSWORD);
        HomePage.waitForPageLoaded();
        HomePage.openContactsTab();
        ContactsPage.waitForPageLoaded();
        ContactsPage.clickNewButton();
        NewContactPage.waitForPageLoaded();
        NewContactPage.fillForm(newContact);
        NewContactPage.clickSaveButton();
        ContactDetailsPage.waitForPageLoaded();
        Assert.assertEquals(HomePage.getMessageText(), Message.expectedContactMessageText(newContact.getSalutation().getName(), newContact.getFirstName(), newContact.getLastName()));
        ContactDetailsPage.getContactInfo();
        Assert.assertEquals(ContactDetailsPage.getContactInfo(), newContact);
        HomePage.waitLForLogoutClickable();
        HomePage.clickLogout();
    }

    @DataProvider
    public Object[][] ContactTestData() {
        return new Object[][]{
                {ContactFactory.getContactWithAllItems()},
                {ContactFactory.getContactWithAddress()},
                {ContactFactory.getContactWithoutAddress()}
        };
    }
}
