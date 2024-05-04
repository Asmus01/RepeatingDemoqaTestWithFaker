package com.home;

import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;

import static randomData.randomDataForStateCity.generatorOfCity;

public class TestBase {
    Faker faker = new Faker();


    public String firstname = faker.name().firstName();
    public String lastname = faker.name().lastName();
    public String email = faker.internet().emailAddress();
    public String gender = faker.demographic().sex();
    public String mobile = faker.phoneNumber().subscriberNumber(10);
//    public String dateOfBirth = "20 March,1970";
    public String subjects = faker.options().option("Maths","Accounting", "Arts");
    public String hobby = faker.options().option("Sports", "Reading", "Music");
    public String currentAddress = faker.address().streetAddress();
    public String uploadPicture = "images/MistakeText.jpg";
    public String state = faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");
    public String city = generatorOfCity(state);


    @BeforeAll
    static void setUp() {

        Configuration.browser = "firefox";
        Configuration.browserSize = "1100x1080";
    }
}
