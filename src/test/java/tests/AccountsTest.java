package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AccountDetailsPage;
import pages.AccountsPage;
import pages.NewAccountPage;


public class AccountsTest extends BaseTest {
    protected final static String ACCOUNT_NAME = "FirstAccount";
    protected final static String PHONE_ACCOUNT = "+375332548657";
    protected final static String FAX_ACCOUNT = "+375332548658";
    protected final static String WEBSITE_ACCOUNT = "new_account@gmail.com";
    protected final static String EMPLOYEES_ACCOUNT = "50";
    protected final static String ANNUAL_REVENUE_ACCOUNT = "700000";
    protected final static String BILLING_STREET_ACCOUNT = "AccountStreet";
    protected final static String BILLING_CITY_ACCOUNT = "AccountCity";
    protected final static String BILLING_STATE_ACCOUNT = "AccountState";
    protected final static String BILLING_ZIP_ACCOUNT = "21354";
    protected final static String BILLING_COUNTRY_ACCOUNT = "Belarus";
    protected final static String EXPECTED_TYPE_ACCOUNT = "Analyst";
    private AccountsPage AccountsPage;
    private NewAccountPage NewAccountPage;
    private AccountDetailsPage AccountDetailsPage;

    @BeforeClass
    public void initialise() {
        AccountsPage = new AccountsPage(driver);
        NewAccountPage = new NewAccountPage(driver);
        AccountDetailsPage = new AccountDetailsPage(driver);
    }

    @Test(groups = {"regression"})
    public void createAccountTest() throws InterruptedException {
        LoginPage.login(USER_NAME, PASSWORD);
        HomePage.waitForPageLoaded();
        HomePage.openAccountsTab();
        AccountsPage.waitForPageLoaded();
        AccountsPage.clickNewAccountButton();
        NewAccountPage.waitForPageLoaded();
        NewAccountPage.setAccountName(ACCOUNT_NAME);
        NewAccountPage.setPhone(PHONE_ACCOUNT);
        NewAccountPage.setFax(FAX_ACCOUNT);
        NewAccountPage.setWebsiteAccount(WEBSITE_ACCOUNT);
        NewAccountPage.setEmployeesAccount(EMPLOYEES_ACCOUNT);
        NewAccountPage.setAnnualRevenueAccount(ANNUAL_REVENUE_ACCOUNT);
        NewAccountPage.clickTypeAccount();
        NewAccountPage.clickTypeAnalystAccount();
        NewAccountPage.clickIndustryAccount();
        NewAccountPage.clickIndustryBankingAccount();
        NewAccountPage.setBillingStreetAccount(BILLING_STREET_ACCOUNT);
        NewAccountPage.setBillingCityAccount(BILLING_CITY_ACCOUNT);
        NewAccountPage.setBillingStateAccount(BILLING_STATE_ACCOUNT);
        NewAccountPage.setBillingZipAccount(BILLING_ZIP_ACCOUNT);
        NewAccountPage.setBillingCountryAccount(BILLING_COUNTRY_ACCOUNT);
        NewAccountPage.clickCopyCheckbox();
        NewAccountPage.clickSaveAccountButton();
        AccountDetailsPage.waitForPageLoaded();
        Assert.assertEquals(AccountDetailsPage.getActualAccountName(), ACCOUNT_NAME, "Account name verification");
        Assert.assertEquals(AccountDetailsPage.getActualAccountType(), EXPECTED_TYPE_ACCOUNT, "Account type verification");
        Assert.assertEquals(AccountDetailsPage.getActualAccountPhone(), PHONE_ACCOUNT, "Account phone verification");
        Assert.assertEquals(AccountDetailsPage.getActualAccountWebsite(), WEBSITE_ACCOUNT, "Account website verification");

    }
}
