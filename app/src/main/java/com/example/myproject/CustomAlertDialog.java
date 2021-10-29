package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.developer.kalert.KAlertDialog;


public class CustomAlertDialog extends AppCompatActivity {
    Button click;
    final Context context=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_alert_dialog);
        click=findViewById(R.id.click);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
               /* Toast.makeText(getApplicationContext(),"click is done",Toast.LENGTH_SHORT).show();
                final Dialog dialog=new Dialog(context);
                dialog.setContentView(R.layout.cutom_dialog);
                Button dialogButton=dialog.findViewById(R.id.btnok);
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                      //  dialog.dismiss();
                        Toast.makeText(getApplicationContext(), "dismiss is done", Toast.LENGTH_SHORT).show();
                    }
                });
dialog.show();*/
            }

        });
    }
    public void showDialog(){
        KAlertDialog pDialog = new KAlertDialog(this, KAlertDialog.PROGRESS_TYPE);
        pDialog.getProgressHelper().setBarColor(Color.parseColor("#A5DC86"));
        pDialog.setTitleText("Loading");
        pDialog.setCancelable(false);
        pDialog.show();
//pDialog.hide();
//pDialog.dismiss();
    }
}