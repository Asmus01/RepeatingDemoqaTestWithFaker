package randomData;

import com.github.javafaker.Faker;

public class randomDataForBirthDay {

    Faker faker = new Faker();

    public String dayOfBirth(String day) {
        day = String.valueOf(faker.options().option("1", "2", "3"));
        return day;
    }
    public String monthOfBirth(String month) {
        month = String.valueOf(faker.options().option("1", "2", "3"));
        return month;
    }

    public String yearOfBirth(String year) {
        year = String.valueOf(faker.options().option("2000", "2001", "2002"));
        return year;
    }


}
