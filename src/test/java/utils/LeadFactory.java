package utils;

import com.github.javafaker.Faker;
import enums.*;
import models.Lead;

public class LeadFactory {
    private static final Faker faker = new Faker();

    public static Lead getLeadWithAllItems() {
        return Lead.builder().lastName(faker.name().lastName())
                .company(faker.company().name())
                .leadStatus(LeadStatus.CONTACTED)
                .salutation(Salutation.MR)
                .firstName(faker.name().firstName())
                .phone(faker.phoneNumber().phoneNumber())
                .email(faker.internet().emailAddress())
                .title(faker.name().title())
                .rating(Rating.HOT)
                .website(faker.internet().url())
                .street(faker.name().username())
                .state(faker.name().username())
                .city(faker.name().username())
                .zip(faker.address().zipCode())
                .country(faker.name().username())
                .noOfEmployees("8")
                .annualRevenue("10")
                .leadSource(LeadSource.ADVERTISEMENT)
                .industry(Industry.INSURANCE)
                .description("hjfhsfjh")
                .build();
    }

    public static Lead getLeadWithAddress() {
        return Lead.builder().lastName(faker.name().lastName())
                .company(faker.company().name())
                .leadStatus(LeadStatus.CONTACTED)
                .salutation(Salutation.MR)
                .firstName(faker.name().firstName())
                .street(faker.name().username())
                .state(faker.name().username())
                .city(faker.name().username())
                .zip(faker.address().zipCode())
                .country(faker.name().username())
                .leadSource(LeadSource.ADVERTISEMENT)
                .build();
    }

    public static Lead getLeadWithoutAddress() {
        return Lead.builder().lastName(faker.name().lastName())
                .company(faker.company().name())
                .leadStatus(LeadStatus.CONTACTED)
                .salutation(Salutation.MR)
                .firstName(faker.name().firstName())
                .leadSource(LeadSource.ADVERTISEMENT)
                .build();
    }


}
