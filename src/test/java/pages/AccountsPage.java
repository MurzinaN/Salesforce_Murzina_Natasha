package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsPage extends BasePage {
    private final static By NEW_ACCOUNT_BUTTON = By.cssSelector("div.active a[title=New]");
    private final static By ICON_ACCOUNTS_LOCATOR = By.xpath("//records-highlights-icon");
    By actualAccountNameLocator = By.xpath("//h1/div[contains(text(),'Account')]/parent::h1/descendant::lightning-formatted-text");
    By actualAccountTypeLocator = By.xpath("//p[contains(text(),'Type')]/parent::div/descendant::lightning-formatted-text");
    By actualAccountPhoneLocator = By.xpath("//p[contains(text(),'Phone')]/parent::div/descendant::lightning-formatted-phone/a");
    By actualAccountWebsiteLocator = By.xpath("//p[contains(text(),'Website')]/parent::div/descendant::a");

    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
        waitForElementDisplayed(ICON_ACCOUNTS_LOCATOR);
    }

    public void clickNewAccountButton() {
        driver.findElement(NEW_ACCOUNT_BUTTON).click();
    }

    public String getActualAccountName() {
        String actualAccountName = driver.findElement(actualAccountNameLocator).getText();
        return actualAccountName;
    }

    public String getActualAccountType() {
        String actualAccountType = driver.findElement(actualAccountTypeLocator).getText();
        return actualAccountType;
    }

    public String getActualAccountPhone() {
        String actualAccountPhone = driver.findElement(actualAccountPhoneLocator).getText();
        return actualAccountPhone;
    }

    public String getActualAccountWebsite() {
        String actualAccountWebsite = driver.findElement(actualAccountWebsiteLocator).getText();
        return actualAccountWebsite;
    }
}
