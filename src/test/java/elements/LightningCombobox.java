package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Objects;


public class LightningCombobox extends BaseElement {
    private final static String BUTTON_LOCATOR = "//label[contains(text(),'%s')]/following-sibling::div";
    private final static String OPTIONS_LOCATOR = "//div/lightning-base-combobox-item/descendant::span[@title='%s']";

    public LightningCombobox(WebDriver driver, String label) {
        super(driver, label);
    }

    public void selectByVisibleText(String visibleText) {
        if (Objects.nonNull(visibleText)) {
            WebElement button = driver.findElement(By.xpath(String.format(BUTTON_LOCATOR, label)));
            scrollIntoView(button);
            button.click();
            System.out.println(String.format("Setting %s LightningCombobox value = %s", label, visibleText));
            WebElement option = driver.findElement(By.xpath(String.format(OPTIONS_LOCATOR, visibleText)));
            scrollIntoView(option);
            option.click();
        }
    }
}
