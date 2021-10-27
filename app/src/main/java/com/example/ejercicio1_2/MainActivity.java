package com.example.ejercicio1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Datos funcion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText nombre =(EditText)findViewById(R.id.nombre);
        EditText apellido =(EditText)findViewById(R.id.apellido);
        EditText edad = (EditText)findViewById(R.id.edad);
        EditText correo =(EditText)findViewById(R.id.mail);
        Button btn = (Button)findViewById(R.id.boton);

        Intent pantalla =new Intent(getApplicationContext(),MainActivity2.class);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(nombre.getText().toString().trim().length()==0||
                        apellido.getText().toString().trim().length()==0 ||
                        edad.getText().toString().trim().length()==0 ||
                        correo.getText().toString().trim().length()==0){
                    Toast.makeText(getApplicationContext(),"ERROR!,Campos Vacios",Toast.LENGTH_LONG).show();
                }else
                {
                    String m_n =nombre.getText().toString();
                    String m_a =apellido.getText().toString();
                    Integer  m_e = Integer.parseInt(edad.getText().toString());
                    String m_c = correo.getText().toString();

                    funcion  = new Datos(m_n,m_a,m_e,m_c);

                    pantalla.putExtra("nombre",m_n+" ");
                    pantalla.putExtra("apellido",m_a +" ");
                    pantalla.putExtra("edad", m_e +" ");
                    pantalla.putExtra("correo",m_c+" ");

                    startActivity(pantalla);
                }
            }
        });
    }
}
