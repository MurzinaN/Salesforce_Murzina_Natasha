package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Objects;

public class SelectAccount extends BaseElement {
    private final static String SELECT_LOCATOR = "//span[text()= '%s']/ancestor::div[contains(@class, 'uiInput')]//input";
    private final static String SELECT_OPTION_LOCATOR = "//a[@role='option']/descendant::div[contains(@class, 'primaryLabel')]";

    public SelectAccount(WebDriver driver, String label) {
        super(driver, label);
    }

    public void selectOption(String option) {
        if (Objects.nonNull(option)) {
            WebElement button = driver.findElement(By.xpath(String.format(SELECT_LOCATOR, label)));
            scrollIntoView(button);
            button.click();
            System.out.println(String.format("Setting %s SelectAccount value = %s", label, option));
            List<WebElement> options = driver.findElements(By.xpath(SELECT_OPTION_LOCATOR));
            options.stream().filter(webElement -> webElement.getText().equals(option))
                    .findFirst()
                    .get()
                    .click();
        }
    }

}

