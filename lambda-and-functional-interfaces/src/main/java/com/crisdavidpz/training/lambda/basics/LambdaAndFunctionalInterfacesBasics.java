package com.crisdavidpz.training.lambda.basics;

import java.util.function.Consumer;

public class LambdaAndFunctionalInterfacesBasics {
    public static void main(String[] args) {
        Consumer<String> favoriteMotorcycle =
                motorcycle -> System.out.println("My favorite motorcycle is " + motorcycle);
        favoriteMotorcycle.accept("Honda XR 250");
    }
}
