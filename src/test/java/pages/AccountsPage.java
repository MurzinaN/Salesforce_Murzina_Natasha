package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsPage extends BasePage {
    private final static By NEW_ACCOUNT_BUTTON = By.cssSelector("div.active a[title=New]");
    private final static By ICON_ACCOUNTS_LOCATOR = By.xpath("//records-highlights-icon");

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


}
