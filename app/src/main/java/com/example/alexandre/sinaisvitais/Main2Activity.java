package com.example.alexandre.sinaisvitais;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;



public class Main2Activity extends AppCompatActivity {

    private EditText showPaciente;
    private EditText showLeito;
    private EditText showPressao;
    private EditText showBatimentos;
    private EditText showTemperatura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        showPaciente = findViewById(R.id.receberPaciente);
        showLeito = findViewById(R.id.receberLeito);
        showPressao = findViewById(R.id.receberPressao);
        showBatimentos = findViewById(R.id.receberBatimentos);
        showTemperatura = findViewById(R.id.receberTemperatura);

        Intent intent = getIntent();

        Bundle chamar = intent.getExtras();

        String paciente = chamar.getString("paciente");
        showPaciente.setText(paciente);

        int leito = chamar.getInt("leito");
        showLeito.setText(String.valueOf(leito));

        int pressao = chamar.getInt("pressao");
        showPressao.setText(String.valueOf(pressao));

        int batimentos = chamar.getInt("batimentos");
        showBatimentos.setText(String.valueOf(batimentos));

        int temperatura = chamar.getInt("temperatura");
        showTemperatura.setText(String.valueOf(temperatura));

        Button back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent (Main2Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
