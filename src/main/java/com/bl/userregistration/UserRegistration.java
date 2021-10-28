package com.bl.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
    public static final String FIRST_NAME_PATTERN = "^[A-Z][a-zA-Z]{3,10}$";
    public static final String LAST_NAME_PATTERN = "^[A-Z][a-zA-Z]{3,10}$";
    public static final String EMAIL_PATTERN = "^[a-zA-Z0-9+_.-]+[@][a-zA-Z0-9]+[.a-z]{4}([.a-zA-Z,]{3})*$";
    public static final String PHONE_NUMBER_PATTERN = "^[0-9]{2}[ ][789][0-9]{9}$";
    public static final String SPECIAL_CHARACTER_PATTERN = "^([~!@#$%^&*()+{}]?[A-Za-z0-9]){8,}$";

    public boolean firstName(String fname) {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(fname).matches();
    }

    public boolean lastName(String lname) {
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        return pattern.matcher(lname).matches();
    }

    public boolean emailTest(String gmail) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(gmail).matches();
    }

    public boolean phoneNumber(String contactNumber) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER_PATTERN);
        return pattern.matcher(contactNumber).matches();
    }

    public boolean passwordSpecialCharacter(String character) {
        Pattern pattern = Pattern.compile(SPECIAL_CHARACTER_PATTERN);
        return pattern.matcher(character).matches();
    }
}
