package com.crisdavidpz.training.lambda.basics;

public class LambdaAndFunctionalInterfacesBasics {
    public static void main(String[] args) {
        Runnable fn1 = () -> { System.out.println("Hello, !");
        Executor fn2 = () ->  System.out.println("Hello, !");
        };
    }

    @FunctionalInterface
    public interface Executor {
        public abstract void execute();
    }
}
