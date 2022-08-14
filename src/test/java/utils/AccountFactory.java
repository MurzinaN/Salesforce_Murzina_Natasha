package utils;

import com.github.javafaker.Faker;
import enums.Industry;
import enums.Type;
import models.Account;

public class AccountFactory {
    private static final Faker faker = new Faker();

    public static Account getAccountWithAllItems() {
        return Account.builder().accountName(faker.name().username())
                .parentAccount("myAccount")
                .phone(faker.phoneNumber().phoneNumber())
                .fax(faker.phoneNumber().phoneNumber())
                .website(faker.internet().url())
                .employees("10")
                .annualRevenue("587")
                .type(Type.ANALYST)
                .industry(Industry.INSURANCE)
                .description(faker.name().username())
                .billingStreet(faker.name().username())
                .billingCity(faker.name().username())
                .billingState(faker.name().username())
                .billingZip(faker.address().zipCode())
                .billingCountry(faker.name().username())
                .shippingStreet(faker.name().username())
                .shippingCity(faker.name().username())
                .shippingState(faker.name().username())
                .shippingZip(faker.address().zipCode())
                .shippingCountry(faker.name().username())
                .build();
    }

    public static Account getAccountWithAddress() {
        return Account.builder().accountName(faker.name().username())
                .billingStreet(faker.name().username())
                .billingCity(faker.name().username())
                .billingState(faker.name().username())
                .billingZip(faker.address().zipCode())
                .billingCountry(faker.name().username())
                .shippingStreet(faker.name().username())
                .shippingCity(faker.name().username())
                .shippingState(faker.name().username())
                .shippingZip(faker.address().zipCode())
                .shippingCountry(faker.name().username())
                .build();
    }

    public static Account getAccountWithoutAddress() {
        return Account.builder().accountName(faker.name().username())
                .build();
    }
}
