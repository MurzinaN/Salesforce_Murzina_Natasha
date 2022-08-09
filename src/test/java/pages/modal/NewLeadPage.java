package pages.modal;

import elements.LightningCombobox;
import elements.LightningInput;
import elements.Textarea;
import models.Lead;
import org.openqa.selenium.WebDriver;

public class NewLeadPage extends BaseModal {

    public NewLeadPage(WebDriver driver) {
        super(driver);
    }

    public void fillForm(Lead inputLead) {
        if (inputLead.getFirstName() != null) {
            new LightningInput(driver, "First Name").setValue(inputLead.getFirstName());
        }
        if (inputLead.getLastName() != null) {
            new LightningInput(driver, "Last Name").setValue(inputLead.getLastName());
        }
        if (inputLead.getSalutation().getName() != null) {
            //if(Objects.nonNull(inputLead.getSalutation())){
            new LightningCombobox(driver, "Salutation").selectByVisibleText(inputLead.getSalutation().getName());
        }
        if (inputLead.getLeadStatus() != null) {
            new LightningCombobox(driver, "Lead Status").selectByVisibleText(inputLead.getLeadStatus().getName());
        }
        if (inputLead.getCompany() != null) {
            new LightningInput(driver, "Company").setValue(inputLead.getCompany());
        }
        if (inputLead.getPhone() != null) {
            new LightningInput(driver, "Phone").setValue(inputLead.getPhone());
        }
        if (inputLead.getEmail() != null) {
            new LightningInput(driver, "Email").setValue(inputLead.getEmail());
        }
        if (inputLead.getRating() != null) {
            new LightningCombobox(driver, "Rating").selectByVisibleText(inputLead.getRating().getName());
        }
        if (inputLead.getTitle() != null) {
            new LightningInput(driver, "Title").setValue(inputLead.getTitle());
        }
        if (inputLead.getStreet() != null) {
            new Textarea(driver, "Street").setValueText(inputLead.getStreet());
        }
        if (inputLead.getCity() != null) {
            new LightningInput(driver, "City").setValue(inputLead.getCity());
        }
        if (inputLead.getZip() != null) {
            new LightningInput(driver, "Zip/Postal Code").setValue(inputLead.getZip());
        }
        if (inputLead.getState() != null) {
            new LightningInput(driver, "State/Province").setValue(inputLead.getState());
        }
        if (inputLead.getCountry() != null) {
            new LightningInput(driver, "Country").setValue(inputLead.getCountry());
        }
        if (inputLead.getWebsite() != null) {
            new LightningInput(driver, "Website").setValue(inputLead.getWebsite());
        }
        if (inputLead.getNoOfEmployees() != null) {
            new LightningInput(driver, "No. of Employees").setValue(inputLead.getNoOfEmployees());
        }
        if (inputLead.getAnnualRevenue() != null) {
            new LightningInput(driver, "Annual Revenue").setValue(inputLead.getAnnualRevenue());
        }
        if (inputLead.getLeadSource() != null) {
            new LightningCombobox(driver, "Lead Source").selectByVisibleText(inputLead.getLeadSource().getName());
        }
        if (inputLead.getIndustry() != null) {
            new LightningCombobox(driver, "Industry").selectByVisibleText(inputLead.getIndustry().getName());
        }
        if (inputLead.getDescription() != null) {
            new Textarea(driver, "Description").setValueText(inputLead.getDescription());
        }
    }

}
