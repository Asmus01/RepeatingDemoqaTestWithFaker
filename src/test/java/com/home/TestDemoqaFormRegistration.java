package com.home;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.CalendarComponent;
import pages.TestPageDemoqa;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

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


        testPageDemoqa.openPage()
                .setFirstName(firstname)
                .setLastName(lastname)
                .setEmail(email)
                .setGender(gender)
                .setMobile(mobile)
                .setBirthDay("20", "March", "2014")
                .setSubject(subjects)
                .setHobby(hobby)
                .setUploadPicture(uploadPicture)
                .setAddress(currentAddress)
                .setState(choiseState)
                .setCity(choiseCity)
                .setClick();

        testPageDemoqa.verifyModalWindow()
                .verifyModalResults("Student Name", firstname +" "+ lastname)
                .verifyModalResults("Student Email", email)
                .verifyModalResults("Gender", gender)
                .verifyModalResults("Mobile", mobile)
                .verifyModalResults("Date of Birth", "20 March,2014")
                .verifyModalResults("Subjects", subjects)
                .verifyModalResults("Hobbies", hobby)
//                .verifyModalResults("Picture", uploadPicture )
                .verifyModalResults("Address", currentAddress)
                .verifyModalResults("State and City", choiseState +" "+choiseCity);







    }
}