package com.crisdavidpz.training.method.references.basics;

import java.io.PrintStream;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MethodReferencesBasics {
    public static void main(String[] args) {
        System.out.println();
        Consumer<String> fnGreeter = System.out::println;
        fnGreeter.accept("Hello from a bound method reference!");

        BiConsumer<PrintStream, String> fn2Greeter = PrintStream::println;
        fn2Greeter.accept(System.out, "Hello from an unbound instance method reference!");
    }
}
