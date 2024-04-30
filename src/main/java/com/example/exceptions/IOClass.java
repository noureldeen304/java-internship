package com.example.exceptions;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOClass {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\HP\\Desktop\\java-internship\\src\\main\\java\\com\\example\\exceptions\\Lincoln.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line;
        int wordsCount = 0;

        while ((line = bufferedReader.readLine()) != null) {
            String[] words = line.split("\\s+");
            wordsCount += words.length;
        }

        System.out.println(wordsCount);

    }
}
