package com.crisdavidpz.training.method.references.basics;

import java.io.PrintStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class MethodReferencesBasics {
    public static void main(String[] args) {
        System.out.println();

        // Bounded instance method reference
        Consumer<String> fnGreeterBoundInstance = System.out::println;
        fnGreeterBoundInstance.accept("Hello from a bound method reference!");

        // Unbound instance method reference
        BiConsumer<PrintStream, String> fnGreeterUnboundInstance = PrintStream::println;
        fnGreeterUnboundInstance.accept(System.out, "Hello from an unbound instance method reference!");

        // Static method reference
        Supplier<Thread> fnCurrentThreadStaticMethod = Thread::currentThread;
        System.out.println("The current thread is " + fnCurrentThreadStaticMethod.get());

        // Contructor method reference
        Supplier<Calendar> fnCalendarConstructorMethodReference = GregorianCalendar::new;
        Calendar newCalendar = fnCalendarConstructorMethodReference.get();
        System.out.println("The new calendar is " + newCalendar.getTime());
    }
}
