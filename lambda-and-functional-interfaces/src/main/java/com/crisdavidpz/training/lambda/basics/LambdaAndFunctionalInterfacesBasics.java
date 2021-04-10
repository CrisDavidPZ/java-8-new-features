package com.crisdavidpz.training.lambda.basics;

public class LambdaAndFunctionalInterfacesBasics {
    public static void main(String[] args) {
        Runnable fnLambdaPrintString = () -> System.out.println("Hello lambda!");
        fnLambdaPrintString.run();
    }
}
