package com.example.aula7.programacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aula7.programacion.Json.JsonUser;
import com.example.aula7.programacion.Models.Person;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView txtListUsers;
    EditText ed_firstname;
    EditText ed_lastname;
    List<Person> listPerson = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtListUsers = (TextView) findViewById(R.id.tv_1);
        ed_firstname = (EditText) findViewById(R.id.et_firstname);
        ed_lastname = (EditText) findViewById(R.id.et_lastname);
        //String[] arrayUsers = JsonUser.listUsersDos();

        //for (String user: arrayUsers){
        //    txtListUsers.append(user+"\n\n\n");
        //}



    }

    public void createPerson(View view){
        Person user = new Person();
        user.setFirts_name(ed_firstname.getText().toString());
        user.setLast_name(ed_lastname.getText().toString());
        listPerson.add(user);
    }

    public void listUsers (View view){

        for(int x=0;x<listPerson.size();x++) {
            txtListUsers.append(listPerson.get(x).getFirts_name());
            txtListUsers.append(listPerson.get(x).getLast_name()+"\n");
        }

    }
}
