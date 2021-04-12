package com.crisdavidpz.training.method.references.basics;

import java.io.PrintStream;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class MethodReferencesBasics {
    public static void main(String[] args) {
        System.out.println();

        // Bounded instance method reference
        Consumer<String> fnGreeter = System.out::println;
        fnGreeter.accept("Hello from a bound method reference!");

        // Unbound instance method reference
        BiConsumer<PrintStream, String> fn2Greeter = PrintStream::println;
        fn2Greeter.accept(System.out, "Hello from an unbound instance method reference!");

        // Static method reference
        Supplier<Thread> currentThread = Thread::currentThread;
        System.out.println("The current thread is " + currentThread.get());
    }
}
