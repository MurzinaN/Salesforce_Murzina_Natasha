package tests;

import enums.LeadSource;
import enums.Salutation;
import models.Contact;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.ContactDetailsPage;
import pages.ContactsPage;
import pages.modal.NewContactPage;
import utils.Message;

public class ContactsTest extends BaseTest {
    private ContactsPage ContactsPage;
    private NewContactPage NewContactPage;
    private ContactDetailsPage ContactDetailsPage;
    private utils.Message Message;

    @BeforeClass
    public void initialise() {
        ContactsPage = new ContactsPage(driver);
        NewContactPage = new NewContactPage(driver);
        ContactDetailsPage = new ContactDetailsPage(driver);
        Message = new Message();
    }

    @Test(groups = {"regression"}, dataProvider = "ContactTestData")
    public void createContactTest(Contact newContact) throws InterruptedException {
        LoginPage.login(USER_NAME, PASSWORD);
        HomePage.waitForPageLoaded();
        HomePage.openContactsTab();
        ContactsPage.waitForPageLoaded();
        ContactsPage.clickNewButton();
        NewContactPage.waitForPageLoaded();
        Contact testContact = newContact;
        NewContactPage.fillForm(testContact);
        NewContactPage.clickSaveButton();
        ContactDetailsPage.waitForPageLoaded();
        HomePage.getMessageText();
        Assert.assertEquals(HomePage.getMessageText(), Message.expectedContactMessageText(testContact.getSalutation().getName(), testContact.getFirstName(), testContact.getLastName()));
        ContactDetailsPage.getContactInfo();
        Assert.assertEquals(ContactDetailsPage.getContactInfo(), testContact);
        HomePage.clickLogout();
    }

    @DataProvider
    public Object[][] ContactTestData() {
        return new Object[][]{
                {new Contact.ContactBuilder(faker.name().lastName(), "myAccount")
                        .firstName(faker.name().firstName())
                        .salutation(Salutation.MR)
                        .phone(faker.phoneNumber().phoneNumber())
                        .mobile(faker.phoneNumber().phoneNumber())
                        .email(faker.internet().emailAddress())
                        .title(faker.name().title())
                        .mailingStreet(faker.name().username())
                        .mailingCity(faker.name().username())
                        .mailingState(faker.name().username())
                        .mailingZip(faker.address().zipCode())
                        .mailingCountry(faker.name().username())
                        .otherStreet(faker.name().username())
                        .otherCity(faker.name().username())
                        .otherState(faker.name().username())
                        .otherZip(faker.address().zipCode())
                        .otherCountry(faker.name().username())
                        .fax(faker.phoneNumber().phoneNumber())
                        .homePhone(faker.phoneNumber().phoneNumber())
                        .otherPhone(faker.phoneNumber().phoneNumber())
                        .asstPhone(faker.phoneNumber().phoneNumber())
                        .assistant(faker.name().username())
                        .department(faker.name().username())
                        .leadSource(LeadSource.EMPLOYEE_REFERRAL)
                        .birthdate("12/25/2001")
                        .description(faker.name().username())
                        .build()},
                {new Contact.ContactBuilder(faker.name().lastName(), "myAccount")
                        .firstName(faker.name().firstName())
                        .salutation(Salutation.MR)
                        .mailingStreet(faker.name().username())
                        .mailingCity(faker.name().username())
                        .mailingState(faker.name().username())
                        .mailingZip(faker.address().zipCode())
                        .mailingCountry(faker.name().username())
                        .otherStreet(faker.name().username())
                        .otherCity(faker.name().username())
                        .otherState(faker.name().username())
                        .otherZip(faker.address().zipCode())
                        .otherCountry(faker.name().username())
                        .fax(faker.phoneNumber().phoneNumber())
                        .leadSource(LeadSource.EMPLOYEE_REFERRAL)
                        .build()},
                {new Contact.ContactBuilder(faker.name().lastName(), "myAccount")
                        .firstName(faker.name().firstName())
                        .salutation(Salutation.MR)
                        .leadSource(LeadSource.EMPLOYEE_REFERRAL)
                        .build()}
        };
    }
}
