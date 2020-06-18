package com.bridgelabz;
public class UserValidator {
    public static final String namePattern = "^[A-Z]{1}[a-z]{2,}";
    public static final String emailPattern = "^[A-Za-z]{3,}([.|+|_|-]?[A-Za-z0-9]+)?[@][A-Za-z0-9]+[.][A-Za-z]{2,4}([.][A-Za-z]{2,4}+)?$";
    public static boolean userDataValidation(String dataFromTest,String pattern){
        return dataFromTest.matches(pattern);
    }
}
