package com.bl.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
    public static final String SPECIAL_CHARACTER_PATTERN = "^([~!@#$%^&*()+{}]?[A-Za-z0-9]){8,}$";

    public boolean specialCharacter(String character) {
        boolean MatchesCode = Pattern.matches(SPECIAL_CHARACTER_PATTERN, character);
        return MatchesCode;
    }
}
