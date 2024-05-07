package com.example.collections;


import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;

public class Dictionary {
    private Map<Character, Set<String>> dictMap;

    public Dictionary() {
        dictMap = new HashMap<>();
    }

    public void store(String word) {
        char firstChar = Character.toUpperCase(word.toCharArray()[0]);
        if (dictMap.keySet().contains(firstChar)) {
            dictMap.get(firstChar).add(word);
        } else {
            Set<String> set = new HashSet<>();
            set.add(word);
            dictMap.put(firstChar, set);
        }
    }

    public void printAll() {
        for (Character character : dictMap.keySet()) {
            System.out.println("Letter: " + character);
            System.out.println(dictMap.get(character));
            System.out.println("*************************");
        }
    }
}
