package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class userValidationTest {
    //to check if valid first name is entered
    @Test
    public void givenFirstNameWhenProperShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = UserValidator.userDataValidation("Prajyot",UserValidator.namePattern);
        Assert.assertTrue(result);
    }
    @Test
    public void givenFirstNameWhenSmallShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("prajyot",UserValidator.namePattern);
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstNameWhenTwoCharacterPresentShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("pa",UserValidator.namePattern);
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstNameWhenAllUpperCaseShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("PRAJYOT",UserValidator.namePattern);
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstNameWhenDigitsEnteredShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("1234",UserValidator.namePattern);
        Assert.assertFalse(result);
    }
    //to check valid last name is entered
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean result = UserValidator.userDataValidation("Gajane",UserValidator.namePattern);
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenAllLowerCase_ShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("gajane",UserValidator.namePattern);
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenTwoCharacterPresent_ShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("ga",UserValidator.namePattern);
        Assert.assertFalse(result);
    }
    @Test
    public void givenLastName_whenAllUpperCase_ShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("GAJANE",UserValidator.namePattern);
        Assert.assertFalse(result);
    }
    @Test
    public void givenLastName_whenDigitsEntered_ShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("1234",UserValidator.namePattern);
        Assert.assertFalse(result);
    }
    //Test case for validating email address
    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        boolean result = UserValidator.userDataValidation("abc@gmail.com", UserValidator.emailPattern);
        Assert.assertTrue(result);
    }
    @Test
    public void givenEmailId_WhenNotProper_ShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("abc.@gmail.com", UserValidator.emailPattern);
        Assert.assertFalse(result);
    }
    //Test case for validating phone number
    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
        boolean result = UserValidator.userDataValidation("91 9022744550",UserValidator.phonePattern);
        Assert.assertTrue(result);
    }

    @Test
    public void givenPhoneNumber_WhenCountryCodeImproper_ShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("9131 9034554743",UserValidator.phonePattern);
        Assert.assertFalse(result);
    }

    @Test
    public void givenPhoneNumber_WhenCountryCodeNotPresent_ShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("9867011087",UserValidator.phonePattern);
        Assert.assertFalse(result);
    }

    @Test
    public void givenPhoneNumber_WhenPhoneNumberImproper_ShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("91 986754815",UserValidator.phonePattern);
        Assert.assertFalse(result);
    }

    @Test
    public void givenPhoneNumber_WhenFormatImproper_ShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("919874502631",UserValidator.phonePattern);
        Assert.assertFalse(result);
    }

    @Test
    public void givenPhoneNumber_WhenPhoneNumberNotPresent_ShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("912 ",UserValidator.phonePattern);
        Assert.assertFalse(result);
    }
    //Test case for validating password minimum 8 characters
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        boolean result = UserValidator.userDataValidation("HelloJUnit",UserValidator.passwordRule1);
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenShort_ShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("hello",UserValidator.passwordRule1);
        Assert.assertFalse(result);
    }
}
