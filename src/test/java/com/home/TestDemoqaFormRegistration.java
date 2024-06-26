package com.home;


import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;
import pages.TestPageDemoqa;


public class TestDemoqaFormRegistration extends TestBase {

    TestPageDemoqa testPageDemoqa = new TestPageDemoqa();

//    String firstname = "abc";
//    String lastname = "def";
//    String email = "abc@mail.com";
//    String gender = "Female";
//    String mobile = "9046443121";
//    String dateOfBirth = "20 March,1970";
//    String subjects = "Arts";
//    String hobby = "Sports";
//    String currentAddress = "4055 Sicorsciy Street";


//    @BeforeAll
//    static void setUp() {
//
//        Configuration.browser = "firefox";
//        Configuration.browserSize = "1100x1080";
//    }

    @Test
    void demoqaRegistrationForm() {

        SelenideLogger.addListener("allure", new AllureSelenide());

        testPageDemoqa.openPage()
                .setFirstName(firstname)
                .setLastName(lastname)
                .setEmail(email)
                .setGender(gender)
                .setMobile(mobile)
                .setBirthDay(day, month, year)
                .setSubject(subjects)
                .setHobby(hobby)
                .setUploadPicture(uploadPicture)
                .setAddress(currentAddress)
                .setState(state)
                .setCity(city)
                .setClick();
        System.out.println();

        testPageDemoqa.verifyModalWindow()
                .verifyModalResults("Student Name", firstname + " " + lastname)
                .verifyModalResults("Student Email", email)
                .verifyModalResults("Gender", gender)
                .verifyModalResults("Mobile", mobile)
                .verifyModalResults("Date of Birth", day + " " + month + "," + year)
                .verifyModalResults("Subjects", subjects)
                .verifyModalResults("Hobbies", hobby)
                .verifyModalResults("Picture", "MistakeText.jpg")
                .verifyModalResults("Address", currentAddress)
                .verifyModalResults("State and City", state + " " + city);


    }
}
