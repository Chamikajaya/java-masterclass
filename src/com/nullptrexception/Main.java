package com.nullptrexception;

import java.util.Optional;

public class Main {


    public static void main(String[] args) {
        String myStr = null;
        Optional<String> myOptional = Optional.ofNullable(myStr);  // Optional.ofNullable() method is used to create an Optional object with a given value, which can be null.

        /*
        if (myOptional.isPresent()) {

            System.out.println(myOptional.get().length());

        } else {
            System.out.println("String is null");
        }
        */

        // * Using a lambda expression 😊
        myOptional.ifPresentOrElse(value -> System.out.println(value.length()), () -> System.out.println("String is null"));

    }


}
