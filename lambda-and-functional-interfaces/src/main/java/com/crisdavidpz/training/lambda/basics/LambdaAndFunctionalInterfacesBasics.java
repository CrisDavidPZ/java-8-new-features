package com.crisdavidpz.training.lambda.basics;

public class LambdaAndFunctionalInterfacesBasics {
    public static void main(String[] args) {
        String name = "Cris";
        Runnable fnLambdaPrintString = () -> {
            String lastName = " Parra";
            System.out.println("Welcome to lambda, " + name + lastName + "!");
        };
        fnLambdaPrintString.run();
    }
}
