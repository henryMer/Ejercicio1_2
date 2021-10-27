package com.example.ejercicio1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView t_n = (TextView)findViewById(R.id.name);
        TextView t_a =(TextView)findViewById(R.id.lastname);
        TextView t_e = (TextView)findViewById(R.id.age);
        TextView t_c = (TextView)findViewById(R.id.correo);
        Intent pantalla =getIntent();
        String n = pantalla.getStringExtra("nombre");
        String a = pantalla.getStringExtra("apellido");
        String e = pantalla.getStringExtra("edad");
        String c = pantalla.getStringExtra("correo");
        t_n.setText(n);
        t_a.setText(a);
        t_e.setText(e);
        t_c.setText(c);

    }
}