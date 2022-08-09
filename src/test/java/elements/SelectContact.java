package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Objects;

public class SelectContact extends BaseElement {
    private final static String SELECT_LOCATOR = "//label[text()= '%s']/ancestor::lightning-grouped-combobox//input";
    private final static String SELECT_OPTION_LOCATOR = "//lightning-grouped-combobox//span[text()='myAccount']";

    public SelectContact(WebDriver driver, String label) {
        super(driver, label);
    }

    public void selectOption(String option) {
        if (Objects.nonNull(option)) {
            WebElement button = driver.findElement(By.xpath(String.format(SELECT_LOCATOR, label)));
            scrollIntoView(button);
            button.click();
            System.out.println(String.format("Setting %s SelectContact value = %s", label, option));
            WebElement optionContact = driver.findElement(By.xpath(String.format(SELECT_OPTION_LOCATOR, option)));
            scrollIntoView(optionContact);
            optionContact.click();
        }
    }
}
