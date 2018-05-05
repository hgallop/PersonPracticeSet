package com.example.android.personpracticeset;

/**
 * Created to demonstrate the difference between static and non static fields (variables)
 * */

public class Person {

    //static counter variable
    public static int instanceCount;
    //non statice counter variable
    public int localCount;

    //constructor for a person object
    public Person(){
        instanceCount++;
        localCount++;
    }
}
