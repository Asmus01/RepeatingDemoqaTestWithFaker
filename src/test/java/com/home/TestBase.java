package com.home;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {


    public String firstname = "abc";
    public String lastname = "def";
    public String email = "abc@mail.com";
    public String gender = "Female";
    public String mobile = "9046443121";
//    public String dateOfBirth = "20 March,1970";
    public String subjects = "Arts";
    public String hobby = "Sports";
    public String currentAddress = "4055 Sicorsciy Street";
    public String uploadPicture = "images/MistakeText.jpg";
    public String choiseState = "NCR";
    public String choiseCity = "Delhi";


    @BeforeAll
    static void setUp() {

        Configuration.browser = "firefox";
        Configuration.browserSize = "1100x1080";
    }
}
