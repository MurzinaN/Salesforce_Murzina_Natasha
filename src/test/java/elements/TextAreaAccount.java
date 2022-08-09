package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Objects;

public class TextAreaAccount extends BaseElement {
    private final static String TEXTAREA_ACCOUNT_LOCATOR = "//span[text()='%s']/ancestor::div[contains(@class, 'uiInput')]/textarea";

    public TextAreaAccount(WebDriver driver, String label) {
        super(driver, label);
    }

    public void setValueTextAccount(String valueAccount) {
        if (Objects.nonNull(valueAccount)) {
            WebElement inputElementTextAccount = driver.findElement(By.xpath(String.format(TEXTAREA_ACCOUNT_LOCATOR, label)));
            System.out.println(String.format("Setting %s TextareaAccount  value = %s", label, valueAccount));
            scrollIntoView(inputElementTextAccount);
            inputElementTextAccount.sendKeys(valueAccount);
        }
    }
}
