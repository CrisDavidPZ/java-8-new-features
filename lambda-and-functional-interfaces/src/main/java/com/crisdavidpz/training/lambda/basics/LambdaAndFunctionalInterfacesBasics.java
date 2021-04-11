package com.crisdavidpz.training.lambda.basics;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaAndFunctionalInterfacesBasics {
    public static void main(String[] args) {
        Consumer<String> fnFavoriteMotorcycle =
                motorcycle -> System.out.println("My favorite motorcycle is " + motorcycle);
        fnFavoriteMotorcycle.accept("Honda XR 250");

        Supplier<Integer> fnknowAge = () -> 34;
        System.out.println("My age is " + fnknowAge.get() + " years.");

        Function<Integer, String> fnAgeToDrive =
                age -> age >= 18 ? "You can drive in Colombia!" : "Go in a bus!";
        System.out.println(fnAgeToDrive.apply(14));
        System.out.println(fnAgeToDrive.apply(34));
    }
}
