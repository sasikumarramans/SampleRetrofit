package com.example.myproject;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.RetrofitClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity3 extends AppCompatActivity {
private Button btnadd,btnview,btninsert;
Databasehelper dbHelper;
EditText id,name,phone,email;
ListView listView;
ArrayList <UserModel> arrayList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Databasehelper mydb = new Databasehelper(this);
       id=findViewById(R.id.user_id);
       name=findViewById(R.id.name);
       phone=findViewById(R.id.phone);
       email=findViewById(R.id.email);
        btnadd=findViewById(R.id.insert);
        btnview=findViewById(R.id.view);
        listView=findViewById(R.id.listView);
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mydb.insertContact(name.getText().toString(),phone.getText().toString(),email.getText().toString());



            }
        });
        btnview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               arrayList= mydb.getAllUser();
               if(arrayList!=null&&arrayList.size()>0){
                   listView.setVisibility(View.VISIBLE);
                   UserAdapter customAdapter = new UserAdapter(MainActivity3.this, arrayList);

                   listView.setAdapter(customAdapter);
               }
            }
        });
    }
    private void getSuperHeroes() {
        Call<List<MarvelObj>> call = RetrofitClient.getInstance().getMyApi().getsuperHeroes();
        call.enqueue(new Callback<List<MarvelObj>>() {
            @Override
            public void onResponse(Call<List<MarvelObj>> call, Response<List<MarvelObj>> response) {
                List<MarvelObj> myheroList = response.body();
                Log.d("asas", "");

               // superListView.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, oneHeroes));
            }

            @Override
            public void onFailure(Call<List<MarvelObj>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "An error has occured", Toast.LENGTH_LONG).show();
            }

        });
    }
}