package com.example.todoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Spdashboard extends AppCompatActivity {

    Button add_delivery_note ,supplier_management;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spdashboard);

        add_delivery_note = findViewById(R.id.add_delivery_note);
        supplier_management = findViewById(R.id.supplier_management);



        add_delivery_note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Spdashboard.this , MainActivity2.class));
                finish();
            }
        });

        supplier_management.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Spdashboard.this , SupplierManagerLogin.class));
                finish();
            }
        });
    }
}