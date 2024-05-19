package com.streamsapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Q1) Given a list of integers, filter out the even numbers and collect the remaining numbers into a list.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNum = numbers.stream().filter(num -> num % 2 == 0).toList();
        System.out.println(evenNum);

        // Q2) Given a list of strings, convert them to uppercase and then concatenate them into a single string, separated by commas.
        List<String> words = Arrays.asList("hello", "world", "java", "streams");
        String output = words.stream().map(e -> e.toUpperCase()).collect(Collectors.joining(", "));
        System.out.println(output);

        // Q3)  Given a list of integers, sort them in descending order and get the top 3 highest numbers.
        List<Integer> myNumbers = Arrays.asList(5, 3, 8, 2, 7, 1, 4, 6);
        List<Integer> greatestThree = myNumbers.stream().sorted((a, b) -> b - a).limit(3).toList();
        System.out.println(greatestThree);

        // Q4) Given a list of integers, calculate the sum
        int total = numbers.stream().reduce(0, (acc, ele) -> acc + ele);
        System.out.println(total);

        // Q5) Given a list of names and ages, create a list of Person objects, then filter the list to only include people who are older than 20 years.
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        List<Integer> ages = Arrays.asList(22, 18, 25, 15);

        List<Person> personList = names.stream().
                map(name -> new Person(name, ages.get(names.indexOf(name)))).
                filter(person -> person.getAge() > 20).
                toList();

        System.out.println(personList);

    }


}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return STR."Person{name='\{name}\{'\''}, age=\{age}\{'}'}";
    }

    public int getAge() {
        return age;
    }
}
