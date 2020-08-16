package com.example.baithigiuaki;

import android.widget.EditText;

public class Person {
    private EditText name , age ;

    public Person(){}

    public Person(EditText name , EditText age){
        super();
        this.name = name;
        this.age = age;
    }

    public EditText getName(){
        return name;
    }
    public EditText getAge(){
        return age;
    }
}
