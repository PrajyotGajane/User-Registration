package com.bridgelabz;
public class UserValidator {
    public static final String namePattern = "^[A-Z]{1}[a-z]{2,}";
    public static boolean userDataValidation(String dataFromTest,String pattern){
        return dataFromTest.matches(pattern);
    }
}
