package com.crisdavidpz.training.lambda.basics;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
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

        Predicate<Person> isInFrontOfCourseList =
                person -> person.name.substring(0,1).toUpperCase().equals("A");
        System.out.println("Is Ann in Front of the Course list? " +
                isInFrontOfCourseList.test(new Person("Ann", 25)));
        System.out.println("Is Carl in Front of the Course list? " +
                isInFrontOfCourseList.test(new Person("Carl", 70)));

        Predicate<Person> isInRetirementAge = person -> person.age >= 69;
        System.out.println("Is Carl in age of Retirement? " + isInRetirementAge.test(new Person(70)));
        System.out.println("Is Carl in age of Retirement? " + isInRetirementAge.test(new Person(25)));

    }

    static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Person(int age) {
            this.age = age;
        }
    }


}
