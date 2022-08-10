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
        new LightningInput(driver, "First Name").setValue(inputLead.getFirstName());
        new LightningInput(driver, "Last Name").setValue(inputLead.getLastName());
        new LightningCombobox(driver, "Salutation").selectByVisibleText(inputLead.getSalutation().getName());
        new LightningCombobox(driver, "Lead Status").selectByVisibleText(inputLead.getLeadStatus().getName());
        new LightningInput(driver, "Company").setValue(inputLead.getCompany());
        new LightningInput(driver, "Phone").setValue(inputLead.getPhone());
        new LightningInput(driver, "Email").setValue(inputLead.getEmail());
        new LightningCombobox(driver, "Rating").selectByVisibleText(inputLead.getRating().getName());
        new LightningInput(driver, "Title").setValue(inputLead.getTitle());
        new Textarea(driver, "Street").setValueText(inputLead.getStreet());
        new LightningInput(driver, "City").setValue(inputLead.getCity());
        new LightningInput(driver, "Zip/Postal Code").setValue(inputLead.getZip());
        new LightningInput(driver, "State/Province").setValue(inputLead.getState());
        new LightningInput(driver, "Country").setValue(inputLead.getCountry());
        new LightningInput(driver, "Website").setValue(inputLead.getWebsite());
        new LightningInput(driver, "No. of Employees").setValue(inputLead.getNoOfEmployees());
        new LightningInput(driver, "Annual Revenue").setValue(inputLead.getAnnualRevenue());
        new LightningCombobox(driver, "Lead Source").selectByVisibleText(inputLead.getLeadSource().getName());
        new LightningCombobox(driver, "Industry").selectByVisibleText(inputLead.getIndustry().getName());
        new Textarea(driver, "Description").setValueText(inputLead.getDescription());

    }

}
