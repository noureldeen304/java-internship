package com.example.collections;

public class LetterNotFoundException extends RuntimeException {
    public LetterNotFoundException(Character character) {
        super("Letter {" + character + "} is not found in the dictionary");
    }
}
