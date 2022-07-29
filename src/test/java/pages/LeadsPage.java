package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LeadsPage extends BasePage {

    private final static By NEW_LEAD_BUTTON = By.cssSelector("div.active a[title=New]");
    private final static By ICON_LEADS_LOCATOR = By.xpath("//records-highlights-icon");
    By actualNameLocator = By.xpath("//h1/slot/lightning-formatted-name");
    By actualTitleLocator = By.xpath("//p[contains(text(),'Title')]/parent::div/descendant::lightning-formatted-text");
    By actualPhoneLocator = By.xpath("//p[contains(text(),'Phone (2) ')]/ancestor::button/following-sibling::slot/descendant::a");
    By actualEmailLocator = By.xpath("//p[contains(text(),'Email')]/parent::div/descendant::a");

    public LeadsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
        waitForElementDisplayed(ICON_LEADS_LOCATOR);
    }

    public void clickNewLeadButton() {
        driver.findElement(NEW_LEAD_BUTTON).click();
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
