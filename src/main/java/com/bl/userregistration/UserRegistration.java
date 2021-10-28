package com.bl.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
    public static final String FIRST_NAME_PATTERN = "^[A-Z][a-zA-Z]{3,10}$";

    public boolean firstName(String name) {
        boolean matchesString = Pattern.matches(FIRST_NAME_PATTERN, name);
        return matchesString;
    }
}
