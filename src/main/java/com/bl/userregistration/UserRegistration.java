package com.bl.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
    public static final String PHONE_NUMBER_PATTERN = "^[0-9]{2}[ ][789][0-9]{9}$";

    public boolean phoneNumber(String contactNumber) {
        boolean matchesString = Pattern.matches(PHONE_NUMBER_PATTERN, contactNumber);
        return matchesString;
    }
}
