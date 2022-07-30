package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeadDetailsPage extends BasePage{

    By actualNameLocator = By.xpath("//h1/slot/lightning-formatted-name");
    By actualTitleLocator = By.xpath("//p[contains(text(),'Title')]/parent::div/descendant::lightning-formatted-text");
    By actualPhoneLocator = By.xpath("//p[contains(text(),'Phone (2) ')]/ancestor::button/following-sibling::slot/descendant::a");
    By actualEmailLocator = By.xpath("//p[contains(text(),'Email')]/parent::div/descendant::a");
    private final static By ICON_LEAD_DETAILS_LOCATOR = By.xpath("//records-highlights-icon");

    public LeadDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
        waitForElementDisplayed(ICON_LEAD_DETAILS_LOCATOR);
    }
    public String getActualName() {
        String actualName = driver.findElement(actualNameLocator).getText();
        return actualName;
    }

    public String getActualTitle() {
        String actualTitle = driver.findElement(actualTitleLocator).getText();
        return actualTitle;
    }

    public String getActualPhone() {
        String actualPhone = driver.findElement(actualPhoneLocator).getText();
        return actualPhone;
    }

    public String getActualEmail() {
        String actualEmail = driver.findElement(actualEmailLocator).getText();
        return actualEmail;
    }
}
