package com.example.Java8task;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {
    public static void main(String[] args) {
        List<Product> products = DataGenerator.addDummyData();

        List<Product> expensiveBooks = products.stream()
                .filter(product -> "Books".equals(product.getCategory()) && product.getPrice() > 100).toList();

        expensiveBooks.forEach(System.out::println);
    }
}
