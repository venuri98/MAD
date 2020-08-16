package com.example.bloodcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Admin_homepg extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_homepg);

        btn = (Button) findViewById(R.id.btn_manage_hospitals);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAdd_h_details();
            }
        });
    }

     public  void openAdd_h_details(){

        Intent intent = new Intent(this, Add_h_details.class);
        startActivity(intent);
     }

}