package com.example.dolrparareal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.Format;

public class MainActivity extends AppCompatActivity {

    private TextView editResultado;
    private EditText editValorDolar;
    private EditText editCotacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editResultado = findViewById(R.id.editResultado);
        editValorDolar = findViewById(R.id.editValorDolar);
        editCotacao = findViewById(R.id.editCotacao);
    }

    public void converterDolar(View view){

        DecimalFormat deci = new DecimalFormat("0.00");

        double valorDolar = Double.parseDouble(editValorDolar.getText().toString());
        double valorCotacao = Double.parseDouble(editCotacao.getText().toString());
        Double Converção = valorDolar * valorCotacao;

        editResultado.setText("R$ " + deci.format(Converção));
    }
}