package com.example.practicatema2pmdm;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
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
    private Switch switch1;
    private TextView etiqueta;
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
        switch1 = (Switch) findViewById(R.id.switch1);
        etiqueta = (TextView) findViewById(R.id.etiqueta);


        generarTexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String textoFinal = String.valueOf(NombreO.getText())+","+String.valueOf(ApellidoO.getText())+","+String.valueOf(edad.getText())+","+String.valueOf(lista1.getSelectedItem())+","+"Tiene Hijos:"+String.valueOf(switch1.isChecked())+","+"Hombre:"+String.valueOf(radioButton.isChecked());
                    Toast toast;
                    toast = Toast.makeText(getApplicationContext(),textoFinal, Toast.LENGTH_LONG);
                    toast.show();
                    if(ApellidoO.getText().toString().equals("")){
                        etiqueta.setTextColor(Color.RED);
                        etiqueta.setText("Falta el campo apellido por rellenar");
                    }
                if(NombreO.getText().toString().equals("")){
                    etiqueta.setTextColor(Color.RED);
                    etiqueta.setText("Falta el campo nombre por rellenar");
                }
                if(edad.getText().toString().equals("")){
                    etiqueta.setTextColor(Color.RED);
                    etiqueta.setText("Falta el campo edad por rellenar");
                }

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
                switch1.setChecked(false);
            }
        });

    }
}
