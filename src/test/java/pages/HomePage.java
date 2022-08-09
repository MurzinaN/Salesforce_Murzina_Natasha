package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private final static By USER_ICON_LOCATOR = By.cssSelector(".slds-avatar_profile-image-small");
    private final static By LEADS_TAB_LOCATOR = By.xpath("//a[@title='Leads']");
    private final static By ACCOUNTS_TAB_LOCATOR = By.xpath("//a[@title='Accounts']");
    private final static By CONTACTS_TAB_LOCATOR = By.xpath("//a[@title='Contacts']");

    private final static By MESSAGE_LOCATOR = By.xpath("//div[@role='alertdialog']");
    private final static By USER_BUTTON = By.xpath("//button[contains(@class, 'branding-userProfile-button')]");
    private final static By LOGOUT_BUTTON = By.xpath("//a[contains(@class, 'logout')]");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
    }

    public void waitForUserIconDisplayed() {
        waitForElementDisplayed(USER_ICON_LOCATOR);
    }

    public boolean isUserIconDisplayed() {
        return driver.findElement(USER_ICON_LOCATOR).isDisplayed();
    }

    public void openLeadsTab() {
        jsClick(driver.findElement(LEADS_TAB_LOCATOR));
    }

    public void openAccountsTab() {
        jsClick(driver.findElement(ACCOUNTS_TAB_LOCATOR));
    }

    public void openContactsTab() {
        jsClick(driver.findElement(CONTACTS_TAB_LOCATOR));
    }


    public String getMessageText() {
        waitForElementDisplayed(MESSAGE_LOCATOR);
        String actualText = driver.findElement(MESSAGE_LOCATOR).getText();
        return actualText;
    }

    public void clickLogout() {
        driver.findElement(USER_BUTTON).click();
        driver.findElement(LOGOUT_BUTTON).click();
    }

}
