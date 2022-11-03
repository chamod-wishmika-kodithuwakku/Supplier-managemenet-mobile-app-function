package com.example.todoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Addnotes  extends AppCompatActivity implements OnDialogCloseListner {

    private FloatingActionButton fab;
    Button back_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addnotes);

        fab = findViewById(R.id.fab);
        back_button = findViewById(R.id.back_button);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              AddNewTask.newInstance().show(getSupportFragmentManager() , AddNewTask.TAG);

                Context context = getApplicationContext();
                CharSequence text = "Add your Delivery Note Here ";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Addnotes.this , Spdashboard.class));
                finish();

                Context context = getApplicationContext();
                CharSequence text = "Redirecting to the Dash board ";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
    }

    @Override
    public void onDialogClose(DialogInterface dialogInterface) {

    }
}