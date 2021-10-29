package com.example.myproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnone;
    Button btntwo;
    Button btnthree;
    Button btnfour;
    Button btnfive;
    Button btnsix;
    Button btnsevan;
    Button btneight;
    Button btnnine;
    Button btnzero;
    Button btnstar;
    Button btnhash;
    Button btndelete;
    Button btndial;
    EditText text;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.input);
        btnone=findViewById(R.id.one);
        btntwo=findViewById(R.id.two);
        btnthree=findViewById(R.id.three);
        btnfour=findViewById(R.id.four);
        btnfive=findViewById(R.id.five);
        btnsix=findViewById(R.id.six);
        btnsevan=findViewById(R.id.sevan);
        btneight=findViewById(R.id.eight);
        btnnine=findViewById(R.id.nine);
        btnzero=findViewById(R.id.zero);
        btnstar=findViewById(R.id.star);
        btnhash=findViewById(R.id.hash);
        btndial=findViewById(R.id.dial);
        //  btndelete=findViewById(R.id.bksp);
    }
    public void one(View v) {
        onButtonClick(btnone,text, "1");

    }
    public void two(View v){
        onButtonClick(btntwo,text, "2");


    }
    public void three(View v) {
        onButtonClick(btnthree,text, "3");


    }
    public void four(View v) {
        onButtonClick(btnfour,text, "4");


    }
    public void five(View v) {
        onButtonClick(btnfive,text, "5");


    }
    public void six(View v) {
        onButtonClick(btnsix,text, "6");


    }
    public void sevan(View v) {
        onButtonClick(btnsevan,text, "7");


    }
    public void eight(View v) {
        onButtonClick(btneight,text, "8");


    }
    public void nine(View v) {
        onButtonClick(btnnine,text, "9");


    }
    public void zero(View v) {
        onButtonClick(btnzero,text, "0");


    }
    public void star(View v) {
        onButtonClick(btnstar,text, "*");


    }
    public void hash(View v) {
        onButtonClick(btnhash,text, "#");


    }
    public void onDelete(View v) {
        text.setText("");

    }

    public void onDial(View v) {
        if(text.getText().length()<=3)
            Toast.makeText(this, "enter valid number", Toast.LENGTH_SHORT).show();
    }




    public void onButtonClick(Button button, EditText inputnumber,String number){
        String cache= inputnumber.getText().toString();
        inputnumber.setText(cache+number);
    }


}
