package models;

import enums.LeadSource;
import enums.Salutation;

import java.util.Objects;

public class Contact {
    private final String firstName;
    private final String lastName;
    private final Salutation salutation;
    private final String accountName;
    private final String phone;
    private final String mobile;
    private final String email;
    private final String title;
    private final String reportsTo;
    private final String mailingStreet;
    private final String mailingCity;
    private final String mailingState;
    private final String mailingZip;
    private final String mailingCountry;
    private final String otherStreet;
    private final String otherCity;
    private final String otherState;
    private final String otherZip;
    private final String otherCountry;
    private final String fax;
    private final String homePhone;
    private final String otherPhone;
    private final String asstPhone;
    private final String assistant;
    private final String department;
    private final LeadSource leadSource;
    private final String birthdate;
    private final String description;

    public Contact(ContactBuilder contactBuilder) {
        this.firstName = contactBuilder.firstName;
        this.lastName = contactBuilder.lastName;
        this.salutation = contactBuilder.salutation;
        this.accountName = contactBuilder.accountName;
        this.phone = contactBuilder.phone;
        this.mobile = contactBuilder.mobile;
        this.email = contactBuilder.email;
        this.title = contactBuilder.title;
        this.reportsTo = contactBuilder.reportsTo;
        this.mailingStreet = contactBuilder.mailingStreet;
        this.mailingCity = contactBuilder.mailingCity;
        this.mailingState = contactBuilder.mailingState;
        this.mailingZip = contactBuilder.mailingZip;
        this.mailingCountry = contactBuilder.mailingCountry;
        this.otherStreet = contactBuilder.otherStreet;
        this.otherCity = contactBuilder.otherCity;
        this.otherState = contactBuilder.otherState;
        this.otherZip = contactBuilder.otherZip;
        this.otherCountry = contactBuilder.otherCountry;
        this.fax = contactBuilder.fax;
        this.homePhone = contactBuilder.homePhone;
        this.otherPhone = contactBuilder.otherPhone;
        this.asstPhone = contactBuilder.asstPhone;
        this.assistant = contactBuilder.assistant;
        this.department = contactBuilder.department;
        this.leadSource = contactBuilder.leadSource;
        this.birthdate = contactBuilder.birthdate;
        this.description = contactBuilder.description;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Salutation getSalutation() {
        return salutation;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getPhone() {
        return phone;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public String getTitle() {
        return title;
    }

    public String getReportsTo() {
        return reportsTo;
    }

    public String getMailingStreet() {
        return mailingStreet;
    }

    public String getMailingCity() {
        return mailingCity;
    }

    public String getMailingState() {
        return mailingState;
    }

    public String getMailingZip() {
        return mailingZip;
    }

    public String getMailingCountry() {
        return mailingCountry;
    }

    public String getOtherStreet() {
        return otherStreet;
    }

    public String getOtherCity() {
        return otherCity;
    }

    public String getOtherState() {
        return otherState;
    }

    public String getOtherZip() {
        return otherZip;
    }

    public String getOtherCountry() {
        return otherCountry;
    }

    public String getFax() {
        return fax;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public String getOtherPhone() {
        return otherPhone;
    }

    public String getAsstPhone() {
        return asstPhone;
    }

    public String getAssistant() {
        return assistant;
    }

    public String getDepartment() {
        return department;
    }

    public LeadSource getLeadSource() {
        return leadSource;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(firstName, contact.firstName) && Objects.equals(lastName, contact.lastName) && salutation == contact.salutation && Objects.equals(accountName, contact.accountName) && Objects.equals(phone, contact.phone) && Objects.equals(mobile, contact.mobile) && Objects.equals(email, contact.email) && Objects.equals(title, contact.title) && Objects.equals(reportsTo, contact.reportsTo) && Objects.equals(mailingStreet, contact.mailingStreet) && Objects.equals(mailingCity, contact.mailingCity) && Objects.equals(mailingState, contact.mailingState) && Objects.equals(mailingZip, contact.mailingZip) && Objects.equals(mailingCountry, contact.mailingCountry) && Objects.equals(otherStreet, contact.otherStreet) && Objects.equals(otherCity, contact.otherCity) && Objects.equals(otherState, contact.otherState) && Objects.equals(otherZip, contact.otherZip) && Objects.equals(otherCountry, contact.otherCountry) && Objects.equals(fax, contact.fax) && Objects.equals(homePhone, contact.homePhone) && Objects.equals(otherPhone, contact.otherPhone) && Objects.equals(asstPhone, contact.asstPhone) && Objects.equals(assistant, contact.assistant) && Objects.equals(department, contact.department) && leadSource == contact.leadSource && Objects.equals(birthdate, contact.birthdate) && Objects.equals(description, contact.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, salutation, accountName, phone, mobile, email, title, reportsTo, mailingStreet, mailingCity, mailingState, mailingZip, mailingCountry, otherStreet, otherCity, otherState, otherZip, otherCountry, fax, homePhone, otherPhone, asstPhone, assistant, department, leadSource, birthdate, description);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salutation=" + salutation +
                ", accountName='" + accountName + '\'' +
                ", phone='" + phone + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", title='" + title + '\'' +
                ", reportsTo='" + reportsTo + '\'' +
                ", mailingStreet='" + mailingStreet + '\'' +
                ", mailingCity='" + mailingCity + '\'' +
                ", mailingState='" + mailingState + '\'' +
                ", mailingZip='" + mailingZip + '\'' +
                ", mailingCountry='" + mailingCountry + '\'' +
                ", otherStreet='" + otherStreet + '\'' +
                ", otherCity='" + otherCity + '\'' +
                ", otherState='" + otherState + '\'' +
                ", otherZip='" + otherZip + '\'' +
                ", otherCountry='" + otherCountry + '\'' +
                ", fax='" + fax + '\'' +
                ", homePhone='" + homePhone + '\'' +
                ", otherPhone='" + otherPhone + '\'' +
                ", asstPhone='" + asstPhone + '\'' +
                ", assistant='" + assistant + '\'' +
                ", department='" + department + '\'' +
                ", leadSource=" + leadSource +
                ", birthdate='" + birthdate + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static class ContactBuilder {
        private final String lastName;
        private final String accountName;
        private String firstName;
        private Salutation salutation;
        private String phone;
        private String mobile;
        private String email;
        private String title;
        private String reportsTo;
        private String mailingStreet;
        private String mailingCity;
        private String mailingState;
        private String mailingZip;
        private String mailingCountry;
        private String otherStreet;
        private String otherCity;
        private String otherState;
        private String otherZip;
        private String otherCountry;
        private String fax;
        private String homePhone;
        private String otherPhone;
        private String asstPhone;
        private String assistant;
        private String department;
        private LeadSource leadSource;
        private String birthdate;
        private String description;

        public ContactBuilder(String lastName, String accountName) {
            this.lastName = lastName;
            this.accountName = accountName;
        }

        public Contact build() {
            return new Contact(this);
        }

        public ContactBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public ContactBuilder salutation(Salutation salutation) {
            this.salutation = salutation;
            return this;
        }

        public ContactBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public ContactBuilder mobile(String mobile) {
            this.mobile = mobile;
            return this;
        }

        public ContactBuilder email(String email) {
            this.email = email;
            return this;
        }

        public ContactBuilder title(String title) {
            this.title = title;
            return this;
        }

        public ContactBuilder reportsTo(String reportsTo) {
            this.reportsTo = reportsTo;
            return this;
        }

        public ContactBuilder mailingStreet(String mailingStreet) {
            this.mailingStreet = mailingStreet;
            return this;
        }

        public ContactBuilder mailingCity(String mailingCity) {
            this.mailingCity = mailingCity;
            return this;
        }

        public ContactBuilder mailingState(String mailingState) {
            this.mailingState = mailingState;
            return this;
        }

        public ContactBuilder mailingZip(String mailingZip) {
            this.mailingZip = mailingZip;
            return this;
        }

        public ContactBuilder mailingCountry(String mailingCountry) {
            this.mailingCountry = mailingCountry;
            return this;
        }

        public ContactBuilder otherStreet(String otherStreet) {
            this.otherStreet = otherStreet;
            return this;
        }

        public ContactBuilder otherCity(String otherCity) {
            this.otherCity = otherCity;
            return this;
        }

        public ContactBuilder otherState(String otherState) {
            this.otherState = otherState;
            return this;
        }

        public ContactBuilder otherZip(String otherZip) {
            this.otherZip = otherZip;
            return this;
        }

        public ContactBuilder otherCountry(String otherCountry) {
            this.otherCountry = otherCountry;
            return this;
        }

        public ContactBuilder fax(String fax) {
            this.fax = fax;
            return this;
        }

        public ContactBuilder homePhone(String homePhone) {
            this.homePhone = homePhone;
            return this;
        }

        public ContactBuilder otherPhone(String otherPhone) {
            this.otherPhone = otherPhone;
            return this;
        }

        public ContactBuilder asstPhone(String asstPhone) {
            this.asstPhone = asstPhone;
            return this;
        }

        public ContactBuilder assistant(String assistant) {
            this.assistant = assistant;
            return this;
        }

        public ContactBuilder department(String department) {
            this.department = department;
            return this;
        }

        public ContactBuilder leadSource(LeadSource leadSource) {
            this.leadSource = leadSource;
            return this;
        }

        public ContactBuilder birthdate(String birthdate) {
            this.birthdate = birthdate;
            return this;
        }

        public ContactBuilder description(String description) {
            this.description = description;
            return this;
        }
    }
}
