package com.example.android.personpracticeset;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        // Print the values of both counters to the Log console
        Log.v("Person Objects:", "(" + person4.localCount + "," + Person.instanceCount + ")");
    }
}
