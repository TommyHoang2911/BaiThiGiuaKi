package com.example.baithigiuaki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    Button btnChoose;
    ArrayList<Person> personArrayList = new ArrayList<>();
    EditText editTextName1 , editTextName2 , editTextName3 , editTextName4 , editTextName5;
    EditText editTextAge1 , editTextAge2 , editTextAge3 , editTextAge4 , editTextAge5;
    private String age,name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName1 = (EditText) findViewById(R.id.nameNumber1);
        editTextName2 = (EditText) findViewById(R.id.nameNumber2);
        editTextName3 = (EditText) findViewById(R.id.nameNumber3);
        editTextName4 = (EditText) findViewById(R.id.nameNumber4);
        editTextName5 = (EditText) findViewById(R.id.nameNumber5);

        editTextAge1 = (EditText) findViewById(R.id.ageNumber1);
        editTextAge2 = (EditText) findViewById(R.id.ageNumber2);
        editTextAge3 = (EditText) findViewById(R.id.ageNumber3);
        editTextAge4 = (EditText) findViewById(R.id.ageNumber4);
        editTextAge5 = (EditText) findViewById(R.id.ageNumber5);

        Person person1 = new Person(editTextName1,editTextAge1);
        personArrayList.add(person1);
        Person person2 = new Person(editTextName2,editTextAge2);
        personArrayList.add(person2);
        Person person3 = new Person(editTextName3,editTextAge3);
        personArrayList.add(person3);
        Person person4 = new Person(editTextName4,editTextAge4);
        personArrayList.add(person4);
        Person person5 = new Person(editTextName5,editTextAge5);
        personArrayList.add(person5);

        btnChoose = (Button) findViewById(R.id.btnChoose);

        btnChoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Collections.shuffle(personArrayList);
                getAgePerson();
                getNamePerson();
                openOnclickChoose();
            }
        });
    }

    public String getNamePerson(){
        if (personArrayList.size() != 0) {
            EditText editName = personArrayList.get(0).getName();
            String name = editName.getText().toString();
            return this.name =name;
        }else{
            return null;
        }
    }
    public String getAgePerson(){
        if (personArrayList.size() != 0) {
            EditText editAge = personArrayList.get(0).getAge();
            String age = editAge.getText().toString();
            return this.age = age;
        }else{
            return null;
        }
    }

    public void openOnclickChoose(){
        Intent intent= new Intent(this, Result.class);
        intent.putExtra("name",name);
        intent.putExtra("age", age);
        startActivity(intent);
    }
}