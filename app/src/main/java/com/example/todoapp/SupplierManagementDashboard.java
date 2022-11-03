package com.example.todoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SupplierManagementDashboard extends AppCompatActivity {

    Button  supplier_management, btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supplier_management_dashboard);


        supplier_management = findViewById(R.id.supplier_management);
        btn1=findViewById(R.id.btn1);

        final Intent chooser;
        Intent i1=new Intent(Intent.ACTION_SEND);

        i1.setData(Uri.parse("mailto:"));

        i1.putExtra(Intent.EXTRA_EMAIL,new String[] {"it20613204@my.sliit.lk"});
        i1.putExtra(Intent.EXTRA_SUBJECT,"Enter your subject");
        i1.putExtra(Intent.EXTRA_TEXT,"Enter enquiries to Supplier");

        i1.setType("text/plain");

        chooser =Intent.createChooser(i1,"Choose a sutiable app to send an Email");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(chooser);
            }
        });

        supplier_management.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(getApplicationContext(), com.example.todoapp.MainActivity.class);
                startActivity(intent);
            }
        });
    }
}