package com.bl.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
    public static final String PASSWORD_ONE_UPPER_CASE_PATTERN = "^[A-Za-z]{8}$";

    public boolean passwordTest(String password) {
        boolean MatchesCode = Pattern.matches(PASSWORD_ONE_UPPER_CASE_PATTERN, password);
        return MatchesCode;
    }
}
