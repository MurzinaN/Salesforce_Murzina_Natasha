package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Objects;

public class Input extends BaseElement {
    private final static String INPUT_ACCOUNT_LOCATOR = "//span[text()= '%s']/ancestor::div[contains(@class, 'uiInput')]//input";

    public Input(WebDriver driver, String label) {
        super(driver, label);
    }

    public void setValueAccount(String value) {
        if (Objects.nonNull(value)) {
            WebElement inputAccountElement = driver.findElement(By.xpath(String.format(INPUT_ACCOUNT_LOCATOR, label)));
            System.out.println(String.format("Setting %s Input value = %s", label, value));
            scrollIntoView(inputAccountElement);
            inputAccountElement.sendKeys(value);
        }
    }
}
