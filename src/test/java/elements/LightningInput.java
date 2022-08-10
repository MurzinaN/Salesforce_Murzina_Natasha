package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Objects;

public class LightningInput extends BaseElement {
    private final static String INPUT_LOCATOR = "//label[@lightning-input_input and text()='%s']/ancestor::lightning-input//input";

    public LightningInput(WebDriver driver, String label) {
        super(driver, label);
    }

    public void setValue(String value) {
        if (Objects.nonNull(value)) {
            WebElement inputElement = driver.findElement(By.xpath(String.format(INPUT_LOCATOR, label)));
            System.out.println(String.format("Setting %s LightningInput value = %s", label, value));
            scrollIntoView(inputElement);
            inputElement.sendKeys(value);
        }
    }
}
