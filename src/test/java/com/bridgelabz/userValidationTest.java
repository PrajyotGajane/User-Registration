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
}
