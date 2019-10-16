package com.example.practicatema2pmdm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner lista;
    String [] datos = {"Estado civil","Casado", "Viudo", "Soltero"};
    public Button generarTexto;
    private Button buttonBorrar;
    private EditText NombreO;
    private EditText ApellidoO;
    private EditText edad;
    private RadioButton radioButton;
    private RadioButton radioButton2;
    private Spinner lista1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = (Spinner) findViewById(R.id.lista1);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, datos);
        lista.setAdapter(adaptador);

        generarTexto = (Button) findViewById(R.id.generarTexto);
        NombreO = (EditText) findViewById(R.id.NombreO);
        ApellidoO = (EditText) findViewById(R.id.apellidoO);
        buttonBorrar = (Button) findViewById(R.id.buttonBorrar);
        edad = (EditText) findViewById(R.id.edad);
        radioButton = (RadioButton) findViewById(R.id.radioButton);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        lista1 = (Spinner) findViewById(R.id.lista1);

        generarTexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Toast toast;
                    toast = Toast.makeText(getApplicationContext(), "Pérez Hidalgo, José Antonio, mayor de edad, hombre casado y sin hijos.", Toast.LENGTH_SHORT);
                    toast.show();
            }
        });
       buttonBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NombreO.setText("");
                ApellidoO.setText("");
                edad.setText("");
                radioButton.setChecked(false);
                radioButton2.setChecked(false);
                lista1.setSelection(0);
            }
        });

    }
}
