package pages.modal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public abstract class BaseModal extends BasePage {
    protected final static By SAVE_BUTTON = By.xpath("//*[@title='Save']");

    public BaseModal(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
        waitForElementDisplayed(SAVE_BUTTON);
        waitForElementClickable(SAVE_BUTTON);
    }

    public void clickSaveButton() {
        driver.findElement(SAVE_BUTTON).click();
    }
}
