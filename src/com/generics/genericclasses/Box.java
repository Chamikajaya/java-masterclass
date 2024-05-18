package com.generics.genericclasses;


// * Box<T> is a generic class. T is a type parameter that will be replaced by a concrete type when an object of type Box is created.
public class Box<T> {  // T is the type parameter

    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

}
