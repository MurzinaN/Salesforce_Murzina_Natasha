package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Objects;

public class DropdownAccount extends BaseElement {
    private final static String BUTTON_ACCOUNT_LOCATOR = "//span[contains(text(),'%s')]/ancestor::div[contains(@class, 'uiInput')]/div";
    private final static String OPTIONS_ACCOUNT_LOCATOR = "//div[@class='select-options']/descendant::a[(text()='%s')]";

    public DropdownAccount(WebDriver driver, String label) {
        super(driver, label);
    }

    public void selectByVisibleAccountText(String visibleAccountText) {
        if (Objects.nonNull(visibleAccountText)) {
            WebElement buttonAccount = driver.findElement(By.xpath(String.format(BUTTON_ACCOUNT_LOCATOR, label)));
            scrollIntoView(buttonAccount);
            buttonAccount.click();
            System.out.println(String.format("Setting %s DropdownAccount value = %s", label, visibleAccountText));
            WebElement optionAccount = driver.findElement(By.xpath(String.format(OPTIONS_ACCOUNT_LOCATOR, visibleAccountText)));
            scrollIntoView(optionAccount);
            optionAccount.click();
        }
    }
}
