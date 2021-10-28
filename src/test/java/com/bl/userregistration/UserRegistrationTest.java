package com.bl.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstNameWhenShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean userTest = userRegistration.firstName("Qais");
        Assert.assertTrue(userTest);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean userTest = userRegistration.lastName("Bagwan");
        Assert.assertTrue(userTest);
    }

    @Test
    public void givenPassword_WhenSpecialCharacter_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean userTest = userRegistration.passwordSpecialCharacter("Altamash@77");
        Assert.assertTrue(userTest);
    }

    @Test
    public void givenAnyEmail_WhenValidOrNonValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean userTest = userRegistration.emailTest("altamash23@gmail.com");
        Assert.assertTrue(userTest);
    }

    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyser mood =  new MoodAnalyser();
        String moodTest = mood.analyseMoodHappyOrSad("This is Sad message");
        Assert.assertEquals("SAD",moodTest);
    }

    @Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy() {
        MoodAnalyser mood =  new MoodAnalyser();
        String moodTest = mood.analyseMoodHappyOrSad("This is Happy message");
        Assert.assertEquals("HAPPY",moodTest);
    }
}
