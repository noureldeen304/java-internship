package com.example.Java8task;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise3 {
    public static void main(String[] args) {
        List<Product> products = DataGenerator.addDummyData();

        List<Product> discountedToys = products.stream()
                .filter(product -> "Toys".equals(product.getCategory()))
                .map(product -> new Product(product.getProductId(), product.getProductName(), product.getCategory(), product.getPrice() * 0.9)).toList();

        discountedToys.forEach(System.out::println);
    }
}