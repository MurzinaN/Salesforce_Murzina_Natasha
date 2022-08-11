package tests;

import models.Account;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AccountDetailsPage;
import pages.AccountsPage;
import pages.modal.NewAccountPage;
import utils.AccountFactory;
import utils.Message;


public class AccountsTest extends BaseTest {
    private AccountsPage AccountsPage;
    private NewAccountPage NewAccountPage;
    private AccountDetailsPage AccountDetailsPage;
    private utils.AccountFactory AccountFactory;

    @BeforeClass
    public void initialise() {
        AccountsPage = new AccountsPage(driver);
        NewAccountPage = new NewAccountPage(driver);
        AccountDetailsPage = new AccountDetailsPage(driver);
        AccountFactory = new AccountFactory();
    }

    @Test(groups = {"regression"}, dataProvider = "AccountTestData")
    public void createAccountTest(Account newAccount) throws InterruptedException {
        LoginPage.waitForPageLoaded();
        LoginPage.login(USER_NAME, PASSWORD);
        HomePage.waitForPageLoaded();
        HomePage.openAccountsTab();
        AccountsPage.waitForPageLoaded();
        AccountsPage.clickNewButton();
        NewAccountPage.waitForPageLoaded();
        NewAccountPage.fillForm(newAccount);
        NewAccountPage.clickSaveButton();
        AccountDetailsPage.waitForPageLoaded();
        Assert.assertEquals(HomePage.getMessageText(), Message.expectedAccountMessageText(newAccount.getAccountName()));
        AccountDetailsPage.getAccountInfo();
        Assert.assertEquals(AccountDetailsPage.getAccountInfo(), newAccount);
        HomePage.waitLForLogoutClickable();
        HomePage.clickLogout();
    }

    @DataProvider
    public Object[][] AccountTestData() {
        return new Object[][]{
                {AccountFactory.getAccountWithAllItems()},
                {AccountFactory.getAccountWithAddress()},
                {AccountFactory.getAccountWithoutAddress()}
        };
    }
}
