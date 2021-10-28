package com.bl.userregistration;

public class MoodAnalyser {
    public String analyseMoodHappyOrSad(String message) {
         if (message.contains("Sad"))
             return "SAD";
         else
             return "HAPPY";
    }
}
