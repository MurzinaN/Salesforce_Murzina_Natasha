package pages.modal;

import elements.DropdownAccount;
import elements.Input;
import elements.SelectAccount;
import elements.TextAreaAccount;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewAccountPage extends BaseModal {
    By copyCheckbox = By.xpath("//*[contains(text(),'Copy Billing Address to Shipping Address')]/ancestor::div[1]/input[@type='checkbox']");

    public NewAccountPage(WebDriver driver) {
        super(driver);
    }

    public void fillForm(Account inputAccount) {
        new Input(driver, "Account Name").setValueAccount(inputAccount.getAccountName());
        new SelectAccount(driver, "Parent Account").selectOption(inputAccount.getParentAccount());
        new Input(driver, "Phone").setValueAccount(inputAccount.getPhone());
        new Input(driver, "Fax").setValueAccount(inputAccount.getFax());
        new Input(driver, "Website").setValueAccount(inputAccount.getWebsite());
        new Input(driver, "Employees").setValueAccount(inputAccount.getEmployees());
        new Input(driver, "Annual Revenue").setValueAccount(inputAccount.getAnnualRevenue());
        new DropdownAccount(driver, "Type").selectByVisibleAccountText(inputAccount.getType().getName());
        new DropdownAccount(driver, "Industry").selectByVisibleAccountText(inputAccount.getIndustry().getName());
        new TextAreaAccount(driver, "Description").setValueTextAccount(inputAccount.getDescription());
        new TextAreaAccount(driver, "Billing Street").setValueTextAccount(inputAccount.getBillingStreet());
        new Input(driver, "Billing City").setValueAccount(inputAccount.getBillingCity());
        new Input(driver, "Billing State/Province").setValueAccount(inputAccount.getBillingState());
        new Input(driver, "Billing Zip/Postal Code").setValueAccount(inputAccount.getBillingZip());
        new Input(driver, "Billing Country").setValueAccount(inputAccount.getBillingCountry());
        new TextAreaAccount(driver, "Shipping Street").setValueTextAccount(inputAccount.getShippingStreet());
        new Input(driver, "Shipping City").setValueAccount(inputAccount.getShippingCity());
        new Input(driver, "Shipping State/Province").setValueAccount(inputAccount.getShippingState());
        new Input(driver, "Shipping Zip/Postal Code").setValueAccount(inputAccount.getShippingZip());
        new Input(driver, "Shipping Country").setValueAccount(inputAccount.getShippingCountry());
    }

    public void clickCopyCheckbox() {
        driver.findElement(copyCheckbox).click();
    }

}
