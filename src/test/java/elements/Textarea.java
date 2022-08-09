package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Objects;

public class Textarea extends BaseElement {
    private final static String TEXTAREA_LOCATOR = "//label[text()='%s']/ancestor::lightning-textarea/descendant::textarea";

    public Textarea(WebDriver driver, String label) {
        super(driver, label);
    }

    public void setValueText(String value) {
        if (Objects.nonNull(value)) {
            WebElement inputElementText = driver.findElement(By.xpath(String.format(TEXTAREA_LOCATOR, label)));
            System.out.println(String.format("Setting %s Textarea  value = %s", label, value));
            scrollIntoView(inputElementText);
            inputElementText.sendKeys(value);
        }
    }
}
