package pages.modal;

import elements.LightningCombobox;
import elements.LightningInput;
import elements.SelectContact;
import elements.Textarea;
import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewContactPage extends BaseModal {
    private static final By BIRTHDATE = By.xpath("//input[@name='Birthdate']");

    public NewContactPage(WebDriver driver) {
        super(driver);
    }

    public void fillForm(Contact inputContact) {
        if (inputContact.getFirstName() != null) {
            new LightningInput(driver, "First Name").setValue(inputContact.getFirstName());
        }
        if (inputContact.getLastName() != null) {
            new LightningInput(driver, "Last Name").setValue(inputContact.getLastName());
        }
        if (inputContact.getSalutation() != null) {
            new LightningCombobox(driver, "Salutation").selectByVisibleText(inputContact.getSalutation().getName());
        }
        if (inputContact.getPhone() != null) {
            new LightningInput(driver, "Phone").setValue(inputContact.getPhone());
        }
        if (inputContact.getMobile() != null) {
            new LightningInput(driver, "Mobile").setValue(inputContact.getMobile());
        }
        if (inputContact.getEmail() != null) {
            new LightningInput(driver, "Email").setValue(inputContact.getEmail());
        }
        if (inputContact.getTitle() != null) {
            new LightningInput(driver, "Title").setValue(inputContact.getTitle());
        }
        if (inputContact.getAccountName() != null) {
            new SelectContact(driver, "Account Name").selectOption(inputContact.getAccountName());
        }
        if (inputContact.getReportsTo() != null) {
            new SelectContact(driver, "Reports To").selectOption(inputContact.getReportsTo());
        }
        if (inputContact.getMailingStreet() != null) {
            new Textarea(driver, "Mailing Street").setValueText(inputContact.getMailingStreet());
        }
        if (inputContact.getMailingCity() != null) {
            new LightningInput(driver, "Mailing City").setValue(inputContact.getMailingCity());
        }
        if (inputContact.getMailingZip() != null) {
            new LightningInput(driver, "Mailing Zip/Postal Code").setValue(inputContact.getMailingZip());
        }
        if (inputContact.getMailingState() != null) {
            new LightningInput(driver, "Mailing State/Province").setValue(inputContact.getMailingState());
        }
        if (inputContact.getMailingCountry() != null) {
            new LightningInput(driver, "Mailing Country").setValue(inputContact.getMailingCountry());
        }
        if (inputContact.getOtherStreet() != null) {
            new Textarea(driver, "Other Street").setValueText(inputContact.getOtherStreet());
        }
        if (inputContact.getOtherCity() != null) {
            new LightningInput(driver, "Other City").setValue(inputContact.getOtherCity());
        }
        if (inputContact.getOtherZip() != null) {
            new LightningInput(driver, "Other Zip/Postal Code").setValue(inputContact.getOtherZip());
        }
        if (inputContact.getOtherState() != null) {
            new LightningInput(driver, "Other State/Province").setValue(inputContact.getOtherState());
        }
        if (inputContact.getOtherCountry() != null) {
            new LightningInput(driver, "Other Country").setValue(inputContact.getOtherCountry());
        }
        if (inputContact.getFax() != null) {
            new LightningInput(driver, "Fax").setValue(inputContact.getFax());
        }
        if (inputContact.getHomePhone() != null) {
            new LightningInput(driver, "Home Phone").setValue(inputContact.getHomePhone());
        }
        if (inputContact.getOtherPhone() != null) {
            new LightningInput(driver, "Other Phone").setValue(inputContact.getOtherPhone());
        }
        if (inputContact.getAsstPhone() != null) {
            new LightningInput(driver, "Asst. Phone").setValue(inputContact.getAsstPhone());
        }
        if (inputContact.getAssistant() != null) {
            new LightningInput(driver, "Assistant").setValue(inputContact.getAssistant());
        }
        if (inputContact.getDepartment() != null) {
            new LightningInput(driver, "Department").setValue(inputContact.getDepartment());
        }
        if (inputContact.getLeadSource() != null) {
            new LightningCombobox(driver, "Lead Source").selectByVisibleText(inputContact.getLeadSource().getName());
        }
        if (inputContact.getBirthdate() != null) {
            driver.findElement(BIRTHDATE).sendKeys(inputContact.getBirthdate());
        }
        if (inputContact.getDescription() != null) {
            new Textarea(driver, "Description").setValueText(inputContact.getDescription());
        }


    }
}
