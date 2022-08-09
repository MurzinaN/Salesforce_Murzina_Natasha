package tests;

import enums.Industry;
import enums.Type;
import models.Account;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AccountDetailsPage;
import pages.AccountsPage;
import pages.modal.NewAccountPage;
import utils.Message;


public class AccountsTest extends BaseTest {
    private AccountsPage AccountsPage;
    private NewAccountPage NewAccountPage;
    private AccountDetailsPage AccountDetailsPage;
    private utils.Message Message;

    @BeforeClass
    public void initialise() {
        AccountsPage = new AccountsPage(driver);
        NewAccountPage = new NewAccountPage(driver);
        AccountDetailsPage = new AccountDetailsPage(driver);
        Message = new Message();
    }

    @Test(groups = {"regression"}, dataProvider = "AccountTestData")
    public void createAccountTest(Account newAccount) throws InterruptedException {
        LoginPage.login(USER_NAME, PASSWORD);
        HomePage.waitForPageLoaded();
        HomePage.openAccountsTab();
        AccountsPage.waitForPageLoaded();
        AccountsPage.clickNewButton();
        NewAccountPage.waitForPageLoaded();
        Account testAccount = newAccount;
        NewAccountPage.fillForm(testAccount);
        NewAccountPage.clickSaveButton();
        AccountDetailsPage.waitForPageLoaded();
        HomePage.getMessageText();
        Assert.assertEquals(HomePage.getMessageText(), Message.expectedAccountMessageText(testAccount.getAccountName()));
        AccountDetailsPage.getAccountInfo();
        Assert.assertEquals(AccountDetailsPage.getAccountInfo(), testAccount);
        HomePage.clickLogout();
    }

    @DataProvider
    public Object[][] AccountTestData() {
        return new Object[][]{
                {new Account.AccountBuilder(faker.name().username())
                        .parentAccount("myAccount")
                        .phone(faker.phoneNumber().phoneNumber())
                        .fax(faker.phoneNumber().phoneNumber())
                        .website(faker.internet().url())
                        .employees("10")
                        .annualRevenue("587")
                        .type(Type.ANALYST)
                        .industry(Industry.INSURANCE)
                        .description(faker.name().username())
                        .billingStreet(faker.name().username())
                        .billingCity(faker.name().username())
                        .billingState(faker.name().username())
                        .billingZip(faker.address().zipCode())
                        .billingCountry(faker.name().username())
                        .shippingStreet(faker.name().username())
                        .shippingCity(faker.name().username())
                        .shippingState(faker.name().username())
                        .shippingZip(faker.address().zipCode())
                        .shippingCountry(faker.name().username())
                        .build()},
                {new Account.AccountBuilder(faker.name().username())
                        .billingStreet(faker.name().username())
                        .billingCity(faker.name().username())
                        .billingState(faker.name().username())
                        .billingZip(faker.address().zipCode())
                        .billingCountry(faker.name().username())
                        .shippingStreet(faker.name().username())
                        .shippingCity(faker.name().username())
                        .shippingState(faker.name().username())
                        .shippingZip(faker.address().zipCode())
                        .shippingCountry(faker.name().username())
                        .build()},
                {new Account.AccountBuilder(faker.name().username()).build()}
        };
    }
}
