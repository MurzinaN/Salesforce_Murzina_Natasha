package models;

import enums.Industry;
import enums.Type;

import java.util.Objects;

public class Account {
    private final String accountName;
    private final String parentAccount;
    private final String phone;
    private final String fax;
    private final String website;
    private final String employees;
    private final String annualRevenue;
    private final Type type;
    private final Industry industry;
    private final String description;
    private final String billingStreet;
    private final String billingCity;
    private final String billingState;
    private final String billingZip;
    private final String billingCountry;
    private final String shippingStreet;
    private final String billingAddress;
    private final String shippingCity;
    private final String shippingState;
    private final String shippingZip;
    private final String shippingCountry;
    private final String shippingAddress;

    public Account(AccountBuilder accountBuilder) {
        this.accountName = accountBuilder.accountName;
        this.parentAccount = accountBuilder.parentAccount;
        this.phone = accountBuilder.phone;
        this.fax = accountBuilder.fax;
        this.website = accountBuilder.website;
        this.employees = accountBuilder.employees;
        this.annualRevenue = accountBuilder.annualRevenue;
        this.type = accountBuilder.type;
        this.industry = accountBuilder.industry;
        this.description = accountBuilder.description;
        this.billingStreet = accountBuilder.billingStreet;
        this.billingCity = accountBuilder.billingCity;
        this.billingState = accountBuilder.billingState;
        this.billingZip = accountBuilder.billingZip;
        this.billingCountry = accountBuilder.billingCountry;
        this.shippingStreet = accountBuilder.shippingStreet;
        this.billingAddress = accountBuilder.billingAddress;
        this.shippingCity = accountBuilder.shippingCity;
        this.shippingState = accountBuilder.shippingState;
        this.shippingZip = accountBuilder.shippingZip;
        this.shippingCountry = accountBuilder.shippingCountry;
        this.shippingAddress = accountBuilder.shippingAddress;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getParentAccount() {
        return parentAccount;
    }

    public String getPhone() {
        return phone;
    }

    public String getFax() {
        return fax;
    }

    public String getWebsite() {
        return website;
    }

    public String getEmployees() {
        return employees;
    }

    public String getAnnualRevenue() {
        return annualRevenue;
    }

    public Type getType() {
        return type;
    }

    public Industry getIndustry() {
        return industry;
    }

    public String getDescription() {
        return description;
    }

    public String getBillingStreet() {
        return billingStreet;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public String getBillingState() {
        return billingState;
    }

    public String getBillingZip() {
        return billingZip;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public String getShippingStreet() {
        return shippingStreet;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public String getShippingState() {
        return shippingState;
    }

    public String getShippingZip() {
        return shippingZip;
    }

    public String getShippingCountry() {
        return shippingCountry;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountName, account.accountName) && Objects.equals(parentAccount, account.parentAccount) && Objects.equals(phone, account.phone) && Objects.equals(fax, account.fax) && Objects.equals(website, account.website) && Objects.equals(employees, account.employees) && Objects.equals(annualRevenue, account.annualRevenue) && type == account.type && industry == account.industry && Objects.equals(description, account.description) && Objects.equals(billingStreet, account.billingStreet) && Objects.equals(billingCity, account.billingCity) && Objects.equals(billingState, account.billingState) && Objects.equals(billingZip, account.billingZip) && Objects.equals(billingCountry, account.billingCountry) && Objects.equals(shippingStreet, account.shippingStreet) && Objects.equals(billingAddress, account.billingAddress) && Objects.equals(shippingCity, account.shippingCity) && Objects.equals(shippingState, account.shippingState) && Objects.equals(shippingZip, account.shippingZip) && Objects.equals(shippingCountry, account.shippingCountry) && Objects.equals(shippingAddress, account.shippingAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountName, parentAccount, phone, fax, website, employees, annualRevenue, type, industry, description, billingStreet, billingCity, billingState, billingZip, billingCountry, shippingStreet, billingAddress, shippingCity, shippingState, shippingZip, shippingCountry, shippingAddress);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountName='" + accountName + '\'' +
                ", parentAccount='" + parentAccount + '\'' +
                ", phone='" + phone + '\'' +
                ", fax='" + fax + '\'' +
                ", website='" + website + '\'' +
                ", employees='" + employees + '\'' +
                ", annualRevenue='" + annualRevenue + '\'' +
                ", type=" + type +
                ", industry=" + industry +
                ", description='" + description + '\'' +
                ", billingStreet='" + billingStreet + '\'' +
                ", billingCity='" + billingCity + '\'' +
                ", billingState='" + billingState + '\'' +
                ", billingZip='" + billingZip + '\'' +
                ", billingCountry='" + billingCountry + '\'' +
                ", shippingStreet='" + shippingStreet + '\'' +
                ", billingAddress='" + billingAddress + '\'' +
                ", shippingCity='" + shippingCity + '\'' +
                ", shippingState='" + shippingState + '\'' +
                ", shippingZip='" + shippingZip + '\'' +
                ", shippingCountry='" + shippingCountry + '\'' +
                ", shippingAddress='" + shippingAddress + '\'' +
                '}';
    }

    public static class AccountBuilder {
        private final String accountName;
        private String parentAccount;
        private String phone;
        private String fax;
        private String website;
        private String employees;
        private String annualRevenue;
        private Type type;
        private Industry industry;
        private String description;
        private String billingStreet;
        private String billingCity;
        private String billingState;
        private String billingZip;
        private String billingCountry;
        private String shippingStreet;
        private String billingAddress;
        private String shippingCity;
        private String shippingState;
        private String shippingZip;
        private String shippingCountry;
        private String shippingAddress;

        public AccountBuilder(String accountName) {
            this.accountName = accountName;
        }

        public Account build() {
            return new Account(this);
        }

        public AccountBuilder parentAccount(String parentAccount) {
            this.parentAccount = parentAccount;
            return this;
        }

        public AccountBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public AccountBuilder fax(String fax) {
            this.fax = fax;
            return this;
        }

        public AccountBuilder website(String website) {
            this.website = website;
            return this;
        }

        public AccountBuilder employees(String employees) {
            this.employees = employees;
            return this;
        }

        public AccountBuilder annualRevenue(String annualRevenue) {
            this.annualRevenue = annualRevenue;
            return this;
        }

        public AccountBuilder type(Type type) {
            this.type = type;
            return this;
        }

        public AccountBuilder industry(Industry industry) {
            this.industry = industry;
            return this;
        }

        public AccountBuilder description(String description) {
            this.description = description;
            return this;
        }

        public AccountBuilder billingStreet(String billingStreet) {
            this.billingStreet = billingStreet;
            return this;
        }

        public AccountBuilder billingCity(String billingCity) {
            this.billingCity = billingCity;
            return this;
        }

        public AccountBuilder billingState(String billingState) {
            this.billingState = billingState;
            return this;
        }

        public AccountBuilder billingZip(String billingZip) {
            this.billingZip = billingZip;
            return this;
        }

        public AccountBuilder billingCountry(String billingCountry) {
            this.billingCountry = billingCountry;
            return this;
        }

        public AccountBuilder shippingStreet(String shippingStreet) {
            this.shippingStreet = shippingStreet;
            return this;
        }

        public AccountBuilder billingAddress(String billingAddress) {
            this.billingAddress = billingAddress;
            return this;
        }

        public AccountBuilder shippingCity(String shippingCity) {
            this.shippingCity = shippingCity;
            return this;
        }

        public AccountBuilder shippingState(String shippingState) {
            this.shippingState = shippingState;
            return this;
        }

        public AccountBuilder shippingZip(String shippingZip) {
            this.shippingZip = shippingZip;
            return this;
        }

        public AccountBuilder shippingCountry(String shippingCountry) {
            this.shippingCountry = shippingCountry;
            return this;
        }

        public AccountBuilder shippingAddress(String shippingAddress) {
            this.shippingAddress = shippingAddress;
            return this;
        }
    }
}
