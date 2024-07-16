package com.example.Java8task;

import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        List<Product> products = DataGenerator.addDummyData();

        List<Product> books = products.stream()
                .filter(product -> "Books".equals(product.getCategory())).toList();

        books.forEach(System.out::println);
    }
}

