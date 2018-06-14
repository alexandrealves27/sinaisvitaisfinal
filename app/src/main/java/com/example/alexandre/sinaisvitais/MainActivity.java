package com.example.alexandre.sinaisvitais;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // declaracao de variaveis

    private EditText edt_paciente;
    private  EditText edt_leito;
    private EditText edt_pressao;
    private EditText edt_batimentos;
    private EditText edt_temperatura;
    private Button botaoEnviar;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // puxando os ids da activity

        edt_paciente = findViewById(R.id.edt_paciente);
        edt_leito = findViewById(R.id.edt_leito);
        edt_pressao = findViewById(R.id.edt_pressao);
        edt_batimentos = findViewById(R.id.edt_batimentos);
        edt_temperatura = findViewById(R.id.edt_temperatura);
        botaoEnviar = findViewById(R.id.botaoEnviar);


        botaoEnviar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, Main2Activity.class);

                // usando o bundle e intent para conseguir mandar os dados para outra activity

                Bundle bundle = new Bundle();

                bundle.putString("paciente", edt_paciente.getText().toString());
                bundle.putInt("leito", Integer.parseInt(edt_leito.getText().toString()));
                bundle.putInt("pressao", Integer.parseInt(edt_pressao.getText().toString()));
                bundle.putInt("batimentos", Integer.parseInt(edt_batimentos.getText().toString()));
                bundle.putInt("temperatura", Integer.parseInt(edt_temperatura.getText().toString()));

                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
}