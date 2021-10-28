package com.bl.userregistration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class UserRegistrationTest {
    private UserRegistration registration;
    private String emailPattern;
    private static boolean expectedResult;

    public UserRegistrationTest(String emailPattern, boolean expectedResult) {
        this.emailPattern = emailPattern;
        this.expectedResult = expectedResult;
    }

    @Before
    public void initialize() {
        registration = new UserRegistration();
    }

    @Parameterized.Parameters
    public static Collection emails() {
        return Arrays.asList(new Object[][]{
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@gmail.com", true},
                {"abc-100@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@gmail.com.com", true},
                {"abc@1.com", true},
                {"abc+100@gmail.com", true},
                {"abc", false},
                {".abc+100@gmail.com", false},
                {"abc+100@gmail.com", false},
                {"abc+100@gmail.a", false},
                {"abc+100@.gmail.com", false},
                {"abc+100*()@gmail.com", false},
                {"abc@abc.com", false}
            }
        );
    }

    @Test
    public void givenEmailAsVariable_ShouldReturnAsPerTheParameterizedResult() {
        UserRegistration userRegistration = new UserRegistration();
        boolean userTest = userRegistration.emailTest(emailPattern, expectedResult);
        System.out.println("sum of numbers = : " + userTest);
        Assert.assertEquals(expectedResult,userTest);
    }
}
