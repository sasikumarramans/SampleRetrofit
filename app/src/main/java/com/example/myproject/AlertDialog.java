package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AlertDialog extends AppCompatActivity {
    Button button;
    androidx.appcompat.app.AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);
        button=findViewById(R.id.login);
        builder=new androidx.appcompat.app.AlertDialog.Builder(this);
        builder.setView( getLayoutInflater().inflate( R.layout.cutom_dialog, null));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builder.setMessage("Do you want login")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                finish();
                                Toast.makeText(getApplicationContext(),"you choose yes action for alertbox",
                                        Toast.LENGTH_SHORT).show();
                            }
                        });
                builder.setNegativeButton("no",new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }

                    public  void OnClick(DialogInterface dialog, int id){
                        finish();
                        Toast.makeText(getApplicationContext(),"you choose N0 action for alertbox",Toast.LENGTH_SHORT).show();
                    }
                });

                //Creating dialog box
                androidx.appcompat.app.AlertDialog alert = builder.create();
                //Setting the title manually
                alert.setTitle("AlertDialogExample");
                alert.show();
            }
        });




    }
}