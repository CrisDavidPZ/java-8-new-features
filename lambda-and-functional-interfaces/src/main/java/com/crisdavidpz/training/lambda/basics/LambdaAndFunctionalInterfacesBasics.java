package com.crisdavidpz.training.lambda.basics;

import java.util.function.Consumer;

public class LambdaAndFunctionalInterfacesBasics {
    public static void main(String[] args) {
        Consumer<String> fnGreeting = System.out::println;
        fnGreeting.accept("Hello Cris from a method reference.");
    }
}
