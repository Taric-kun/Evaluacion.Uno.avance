package com.example.evaluacin_uno;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.inputmethod.EditorInfoCompat;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nombre_Usuario, contraseña;
    private TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre_Usuario = (EditText)findViewById(R.id.ptNombre);
        contraseña = (EditText)findViewById(R.id.etContraseña);
    }
    public void Iniciar(View v)
    {
        if(nombre_Usuario.getText().toString().equals("Android") && contraseña.getText().toString().equals("123"))
        {
            Toast.makeText(this,"Usuario Ingresado Correctamente",Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, Menu_act.class);
            startActivity(i);
        }
        else
        {
            Toast.makeText(this,"Usuario o Contraseña Incorrecta",Toast.LENGTH_SHORT).show();
        }
    }
}