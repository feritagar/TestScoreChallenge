package com.agarferit;

public class InvalidTestScores extends Exception {

    public InvalidTestScores() {
        super("Test score(s) can not be less than 0 or greater than 100");
    }
}
