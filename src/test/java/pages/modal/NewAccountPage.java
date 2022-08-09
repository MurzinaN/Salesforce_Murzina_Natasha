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
        if (inputAccount.getAccountName() != null) {
            new Input(driver, "Account Name").setValueAccount(inputAccount.getAccountName());
        }
        if (inputAccount.getParentAccount() != null) {
            new SelectAccount(driver, "Parent Account").selectOption(inputAccount.getParentAccount());
        }
        if (inputAccount.getPhone() != null) {
            new Input(driver, "Phone").setValueAccount(inputAccount.getPhone());
        }
        if (inputAccount.getFax() != null) {
            new Input(driver, "Fax").setValueAccount(inputAccount.getFax());
        }
        if (inputAccount.getWebsite() != null) {
            new Input(driver, "Website").setValueAccount(inputAccount.getWebsite());
        }
        if (inputAccount.getEmployees() != null) {
            new Input(driver, "Employees").setValueAccount(inputAccount.getEmployees());
        }
        if (inputAccount.getAnnualRevenue() != null) {
            new Input(driver, "Annual Revenue").setValueAccount(inputAccount.getAnnualRevenue());
        }
        if (inputAccount.getType() != null) {
            new DropdownAccount(driver, "Type").selectByVisibleAccountText(inputAccount.getType().getName());
        }
        if (inputAccount.getIndustry() != null) {
            new DropdownAccount(driver, "Industry").selectByVisibleAccountText(inputAccount.getIndustry().getName());
        }
        if (inputAccount.getDescription() != null) {
            new TextAreaAccount(driver, "Description").setValueTextAccount(inputAccount.getDescription());
        }
        if (inputAccount.getBillingStreet() != null) {
            new TextAreaAccount(driver, "Billing Street").setValueTextAccount(inputAccount.getBillingStreet());
        }
        if (inputAccount.getBillingCity() != null) {
            new Input(driver, "Billing City").setValueAccount(inputAccount.getBillingCity());
        }
        if (inputAccount.getBillingState() != null) {
            new Input(driver, "Billing State/Province").setValueAccount(inputAccount.getBillingState());
        }
        if (inputAccount.getBillingZip() != null) {
            new Input(driver, "Billing Zip/Postal Code").setValueAccount(inputAccount.getBillingZip());
        }
        if (inputAccount.getBillingCountry() != null) {
            new Input(driver, "Billing Country").setValueAccount(inputAccount.getBillingCountry());
        }
        if (inputAccount.getShippingStreet() != null) {
            new TextAreaAccount(driver, "Shipping Street").setValueTextAccount(inputAccount.getShippingStreet());
        }
        if (inputAccount.getShippingCity() != null) {
            new Input(driver, "Shipping City").setValueAccount(inputAccount.getShippingCity());
        }
        if (inputAccount.getShippingState() != null) {
            new Input(driver, "Shipping State/Province").setValueAccount(inputAccount.getShippingState());
        }
        if (inputAccount.getShippingZip() != null) {
            new Input(driver, "Shipping Zip/Postal Code").setValueAccount(inputAccount.getShippingZip());
        }
        if (inputAccount.getShippingCountry() != null) {
            new Input(driver, "Shipping Country").setValueAccount(inputAccount.getShippingCountry());
        }
    }

    public void clickCopyCheckbox() {
        driver.findElement(copyCheckbox).click();
    }

}
