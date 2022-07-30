package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LeadDetailsPage;
import pages.LeadsPage;
import pages.NewLeadPage;


public class LeadsTest extends BaseTest {
    protected final static String FIRST_NAME = "Tom";
    protected final static String LAST_NAME = "Ford";
    protected final static String COMPANY = "BeautyShop";
    protected final static String PHONE = "+375291234567";
    protected final static String EMAIL = "tom_ford@gmail.com";
    protected final static String TITLE = "manager";
    protected final static String STREET = "OneStreet";
    protected final static String CITY = "Minsk";
    protected final static String ZIP = "12345";
    protected final static String PROVINCE = "Abc";
    protected final static String COUNTRY = "Belarus";
    protected final static String WEBSITE = "beautyshop.com";
    protected final static String NUMBER_OF_EMPLOYEES = "20";
    protected final static String ANNUAL_REVENUE = "500000";
    protected final static String EXPECTED_NAME = "Mr. " + FIRST_NAME + " " + LAST_NAME;
    private LeadsPage LeadsPage;
    private NewLeadPage NewLeadPage;
    private LeadDetailsPage LeadDetailsPage;
    @BeforeClass
    public void initialise() {
        LeadsPage = new LeadsPage(driver);
        NewLeadPage = new NewLeadPage(driver);
        LeadDetailsPage = new LeadDetailsPage(driver);
    }

    @Test(groups = {"regression"})
    public void createLeadTest() throws InterruptedException {
        LoginPage.login(USER_NAME, PASSWORD);
        HomePage.waitForPageLoaded();
        HomePage.openLeadsTab();
        LeadsPage.waitForPageLoaded();
        LeadsPage.clickNewLeadButton();
        NewLeadPage.waitForPageLoaded();
        NewLeadPage.clickLeadStatus();
        NewLeadPage.clickLeadStatusWorking();
        NewLeadPage.clickSalutation();
        NewLeadPage.clickSalutationMr();
        NewLeadPage.setFirstName(FIRST_NAME);
        NewLeadPage.setLastName(LAST_NAME);
        NewLeadPage.setCompany(COMPANY);
        NewLeadPage.setPhone(PHONE);
        NewLeadPage.setEmail(EMAIL);
        NewLeadPage.clickRating();
        NewLeadPage.clickRatingHot();
        NewLeadPage.setTitle(TITLE);
        NewLeadPage.setStreet(STREET);
        NewLeadPage.setCity(CITY);
        NewLeadPage.setZip(ZIP);
        NewLeadPage.setProvince(PROVINCE);
        NewLeadPage.setCountry(COUNTRY);
        NewLeadPage.setWebsite(WEBSITE);
        NewLeadPage.setNumberOfEmployees(NUMBER_OF_EMPLOYEES);
        NewLeadPage.setAnnualRevenue(ANNUAL_REVENUE);
        NewLeadPage.clickIndustry();
        NewLeadPage.clickIndustryApparel();
        NewLeadPage.clickSaveButton();
        LeadDetailsPage.waitForPageLoaded();
        LeadDetailsPage.getActualName();
        Assert.assertEquals(LeadDetailsPage.getActualName(), EXPECTED_NAME, "Name verification");
        Assert.assertEquals(LeadDetailsPage.getActualTitle(), TITLE, "Title verification");
        Assert.assertEquals(LeadDetailsPage.getActualPhone(), PHONE, "Phone verification");
        Assert.assertEquals(LeadDetailsPage.getActualEmail(), EMAIL, "Email verification");
    }
}
