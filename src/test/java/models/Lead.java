package models;

import enums.*;

import java.util.Objects;

public class Lead {
    private final String firstName;
    private final String lastName;
    private final String company;
    private final Salutation salutation;
    private final LeadStatus leadStatus;
    private final String phone;
    private final String email;
    private final String title;
    private final Rating rating;
    private final String street;
    private final String city;
    private final String state;
    private final String zip;
    private final String country;
    private final String website;
    private final String noOfEmployees;
    private final String annualRevenue;
    private final LeadSource leadSource;
    private final Industry industry;
    private final String description;
    private final String fullName;
    private final String fullAddress;

    private Lead(LeadBuilder leadBuilder) {
        this.firstName = leadBuilder.firstName;
        this.lastName = leadBuilder.lastName;
        this.company = leadBuilder.company;
        this.salutation = leadBuilder.salutation;
        this.leadStatus = leadBuilder.leadStatus;
        this.phone = leadBuilder.phone;
        this.email = leadBuilder.email;
        this.title = leadBuilder.title;
        this.rating = leadBuilder.rating;
        this.street = leadBuilder.street;
        this.city = leadBuilder.city;
        this.state = leadBuilder.state;
        this.zip = leadBuilder.zip;
        this.country = leadBuilder.country;
        this.website = leadBuilder.website;
        this.noOfEmployees = leadBuilder.noOfEmployees;
        this.annualRevenue = leadBuilder.annualRevenue;
        this.leadSource = leadBuilder.leadSource;
        this.industry = leadBuilder.industry;
        this.description = leadBuilder.description;
        this.fullName = leadBuilder.fullName;
        this.fullAddress = leadBuilder.fullAddress;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }

    public Salutation getSalutation() {
        return salutation;
    }

    public LeadStatus getLeadStatus() {
        return leadStatus;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getTitle() {
        return title;
    }

    public Rating getRating() {
        return rating;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getCountry() {
        return country;
    }

    public String getWebsite() {
        return website;
    }

    public String getNoOfEmployees() {
        return noOfEmployees;
    }

    public String getAnnualRevenue() {
        return annualRevenue;
    }

    public LeadSource getLeadSource() {
        return leadSource;
    }

    public Industry getIndustry() {
        return industry;
    }

    public String getDescription() {
        return description;
    }

    public String getFullName() {
        return fullName;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lead lead = (Lead) o;
        return Objects.equals(firstName, lead.firstName) && Objects.equals(lastName, lead.lastName) && Objects.equals(company, lead.company) && salutation == lead.salutation && leadStatus == lead.leadStatus && Objects.equals(phone, lead.phone) && Objects.equals(email, lead.email) && Objects.equals(title, lead.title) && rating == lead.rating && Objects.equals(street, lead.street) && Objects.equals(city, lead.city) && Objects.equals(state, lead.state) && Objects.equals(zip, lead.zip) && Objects.equals(country, lead.country) && Objects.equals(website, lead.website) && Objects.equals(noOfEmployees, lead.noOfEmployees) && Objects.equals(annualRevenue, lead.annualRevenue) && leadSource == lead.leadSource && industry == lead.industry && Objects.equals(description, lead.description) && Objects.equals(fullName, lead.fullName) && Objects.equals(fullAddress, lead.fullAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, company, salutation, leadStatus, phone, email, title, rating, street, city, state, zip, country, website, noOfEmployees, annualRevenue, leadSource, industry, description, fullName, fullAddress);
    }

    @Override
    public String toString() {
        return "Lead{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", company='" + company + '\'' +
                ", salutation=" + salutation +
                ", leadStatus=" + leadStatus +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", title='" + title + '\'' +
                ", rating=" + rating +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", country='" + country + '\'' +
                ", website='" + website + '\'' +
                ", NoOfEmployees='" + noOfEmployees + '\'' +
                ", annualRevenue='" + annualRevenue + '\'' +
                ", leadSource=" + leadSource +
                ", industry=" + industry +
                ", description='" + description + '\'' +
                ", fullName='" + fullName + '\'' +
                ", fullAddress='" + fullAddress + '\'' +
                '}';
    }

    public static class LeadBuilder {
        private final String lastName;
        private final String company;
        private final LeadStatus leadStatus;
        private String firstName;
        private Salutation salutation;
        private String phone;
        private String email;
        private String title;
        private Rating rating;
        private String street;
        private String city;
        private String state;
        private String zip;
        private String country;
        private String website;
        private String noOfEmployees;
        private String annualRevenue;
        private LeadSource leadSource;
        private Industry industry;
        private String description;
        private String fullName;
        private String fullAddress;


        public LeadBuilder(String lastName, String company, LeadStatus leadStatus) {
            this.company = company;
            this.leadStatus = leadStatus;
            this.lastName = lastName;
        }

        public Lead build() {
            return new Lead(this);
        }

        public LeadBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public LeadBuilder salutation(Salutation salutation) {
            this.salutation = salutation;
            return this;
        }

        public LeadBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public LeadBuilder email(String email) {
            this.email = email;
            return this;
        }

        public LeadBuilder title(String title) {
            this.title = title;
            return this;
        }

        public LeadBuilder rating(Rating rating) {
            this.rating = rating;
            return this;
        }

        public LeadBuilder street(String street) {
            this.street = street;
            return this;
        }

        public LeadBuilder city(String city) {
            this.city = city;
            return this;
        }

        public LeadBuilder state(String state) {
            this.state = state;
            return this;
        }

        public LeadBuilder zip(String zip) {
            this.zip = zip;
            return this;
        }

        public LeadBuilder country(String country) {
            this.country = country;
            return this;
        }

        public LeadBuilder website(String website) {
            this.website = website;
            return this;
        }

        public LeadBuilder noOfEmployees(String noOfEmployees) {
            this.noOfEmployees = noOfEmployees;
            return this;
        }

        public LeadBuilder annualRevenue(String annualRevenue) {
            this.annualRevenue = annualRevenue;
            return this;
        }

        public LeadBuilder leadSource(LeadSource leadSource) {
            this.leadSource = leadSource;
            return this;
        }

        public LeadBuilder industry(Industry industry) {
            this.industry = industry;
            return this;
        }

        public LeadBuilder description(String description) {
            this.description = description;
            return this;
        }

        public LeadBuilder fullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public LeadBuilder fullAddress(String fullAddress) {
            this.fullAddress = fullAddress;
            return this;
        }
    }
}
