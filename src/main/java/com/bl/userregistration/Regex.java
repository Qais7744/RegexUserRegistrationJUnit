package com.bl.userregistration;

public enum Regex {
    EMAIL_PATTERN("^[A-Za-z._]+[@][a-zA-Z]+[.a-z]{4}([.a-zA-Z]{3})*$"),
    FIRST_NAME_PATTERN("^[A-Z]{1}[a-zA-Z]{3,15}$"),
    LAST_NAME_PATTERN("^[A-Z]{1}[a-zA-Z]{3,15}$"),
    MOBILE_NO_PATTERN("^[0-9]{2}[ ][0-9]{10}$"),
    PASSWORD_PATTERN("([!@#$%^&*()]?[A-Za-z0-9]+){8,}$");
    String pattern;

    Regex(String value) {
        this.pattern = value;
    }
}

