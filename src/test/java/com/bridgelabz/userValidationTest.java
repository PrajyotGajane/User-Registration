package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class userValidationTest {
    @Test
    public void givenFirstNameWhenProperShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = UserValidator.userDataValidation("Prajyot",UserValidator.namePattern);
        Assert.assertTrue(result);
    }

}
