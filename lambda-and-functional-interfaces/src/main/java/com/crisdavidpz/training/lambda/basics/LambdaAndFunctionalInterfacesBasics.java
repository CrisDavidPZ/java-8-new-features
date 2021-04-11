package com.crisdavidpz.training.lambda.basics;

public class LambdaAndFunctionalInterfacesBasics {
    public static void main(String[] args) {
        StringRunnable fnLambdaPrintString = name -> {
            System.out.println("Welcome to lambda, " + name + "!");
        };
        fnLambdaPrintString.run("Cris");
    }

    @FunctionalInterface
    public interface StringRunnable {
        public abstract void run(String s);
    }
}
