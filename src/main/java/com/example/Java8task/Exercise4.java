package com.example.Java8task;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Exercise4 {
    public static void main(String[] args) {
        List<Product> products = DataGenerator.addDummyData();

        Optional<Product> cheapestBook = products.stream()
                .filter(product -> "Books".equals(product.getCategory()))
                .min(Comparator.comparingDouble(Product::getPrice));

        cheapestBook.ifPresent(System.out::println);
    }
}
