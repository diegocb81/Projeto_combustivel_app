package com.cursoandroid.projeto_combustivel_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText editPrecoAlcool, editPrecoGasolina;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPrecoAlcool   = findViewById(R.id.editPrecoAlcool);
        editPrecoGasolina = findViewById(R.id.editPrecoGasolina);
        textResultado     = findViewById(R.id.textResultado);
    }

    public void calcularPreco(View view){

        //Recuperar valores digitados
        String precoAlcool = editPrecoAlcool.getText().toString();
        String precoGasolina = editPrecoGasolina.getText().toString();

        //Validar os campos digitados
        Boolean camposValidados = validarCampos(precoAlcool, precoGasolina);
        if (camposValidados){

            //Convertendo string para números
            Double valorAlcool = Double.parseDouble(precoAlcool);
            Double valorGasolina = Double.parseDouble(precoGasolina);

        }else {
            textResultado.setText("Preencha os preços primeiro!");
        }

    }

    public Boolean validarCampos(String pAlcool, String pGasolina){

        Boolean camposValidados = true;

        if (pAlcool == null || pAlcool.equals("")){
            camposValidados = false;
        }else if (pGasolina == null || pGasolina.equals(""))
            camposValidados = false;

        return camposValidados;

    }

}