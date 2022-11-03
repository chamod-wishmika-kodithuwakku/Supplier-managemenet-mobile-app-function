package com.example.todoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SupplierManagerLogin extends AppCompatActivity {

    Button btnsignin2;
    EditText smUserName ,smPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supplier_manager_login);

        btnsignin2 = findViewById(R.id.btnsignin2);
        smUserName =findViewById(R.id.smUserName);
        smPassword =findViewById(R.id.smPassword);


        btnsignin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String user = smUserName.getText().toString();
                String pass = smPassword.getText().toString();
                String u="admin@1234";
                String p= "1234";

                if(user.equals(u) && pass.equals(p)){

                    Toast.makeText(getApplicationContext(), "Site Manager Sign in successfull", Toast.LENGTH_SHORT).show();
                    Intent intent  = new Intent(getApplicationContext(), com.example.todoapp.SupplierManagementDashboard.class);
                    startActivity(intent);

                }
                else{
                    Toast.makeText(getApplicationContext(), "Invalid Credentials", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}