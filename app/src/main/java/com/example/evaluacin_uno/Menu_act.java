package com.example.evaluacin_uno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu_act extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_act);
    }


    public void Info(View v)
    {
        Intent i = new Intent(this, Info_act.class);
        startActivity(i);
    }

}