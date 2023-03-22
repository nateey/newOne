package com.example.grind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class mainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void login (View view){
        startActivity(new Intent(mainActivity2.this, login_activity.class));
    }
    public void registration (View view){
        startActivity(new Intent(mainActivity2.this, registration_activity.class));
    }
}

