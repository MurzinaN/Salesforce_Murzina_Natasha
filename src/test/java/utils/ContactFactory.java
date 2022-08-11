package utils;

import com.github.javafaker.Faker;
import enums.LeadSource;
import enums.Salutation;
import models.Contact;

public class ContactFactory {
    Faker faker = new Faker();

    public Contact getContactWithAllItems() {
        return Contact.builder().lastName(faker.name().lastName()).accountName("joseph.bayer")
                .firstName(faker.name().firstName())
                .salutation(Salutation.MR)
                .phone(faker.phoneNumber().phoneNumber())
                .mobile(faker.phoneNumber().phoneNumber())
                .email(faker.internet().emailAddress())
                .title(faker.name().title())
                .mailingStreet(faker.name().username())
                .mailingCity(faker.name().username())
                .mailingState(faker.name().username())
                .mailingZip(faker.address().zipCode())
                .mailingCountry(faker.name().username())
                .otherStreet(faker.name().username())
                .otherCity(faker.name().username())
                .otherState(faker.name().username())
                .otherZip(faker.address().zipCode())
                .otherCountry(faker.name().username())
                .fax(faker.phoneNumber().phoneNumber())
                .homePhone(faker.phoneNumber().phoneNumber())
                .otherPhone(faker.phoneNumber().phoneNumber())
                .asstPhone(faker.phoneNumber().phoneNumber())
                .assistant(faker.name().username())
                .department(faker.name().username())
                .leadSource(LeadSource.EMPLOYEE_REFERRAL)
                .birthdate("12/25/2001")
                .description(faker.name().username())
                .build();
    }

    public Contact getContactWithAddress() {
        return Contact.builder().lastName(faker.name().lastName()).accountName("joseph.bayer")
                .firstName(faker.name().firstName())
                .salutation(Salutation.MR)
                .mailingStreet(faker.name().username())
                .mailingCity(faker.name().username())
                .mailingState(faker.name().username())
                .mailingZip(faker.address().zipCode())
                .mailingCountry(faker.name().username())
                .otherStreet(faker.name().username())
                .otherCity(faker.name().username())
                .otherState(faker.name().username())
                .otherZip(faker.address().zipCode())
                .otherCountry(faker.name().username())
                .fax(faker.phoneNumber().phoneNumber())
                .leadSource(LeadSource.EMPLOYEE_REFERRAL)
                .build();
    }

    public Contact getContactWithoutAddress() {
        return Contact.builder().lastName(faker.name().lastName()).accountName("joseph.bayer")
                .firstName(faker.name().firstName())
                .salutation(Salutation.MR)
                .leadSource(LeadSource.EMPLOYEE_REFERRAL)
                .build();
    }

}
