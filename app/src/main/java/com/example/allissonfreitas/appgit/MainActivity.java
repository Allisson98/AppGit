package com.example.allissonfreitas.appgit;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final String login01 = "empresario", senha01 = "12345";

    Button btEntrar;
    EditText login, senha;
    AlertDialog alerta;

    String teste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btEntrar =(Button) findViewById(R.id.btEntrar);
        login = (EditText) findViewById(R.id.ptLogin);
        senha = (EditText) findViewById(R.id.pSenha);

        btEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String StLogin, StSenha;
                    StLogin = String.valueOf(login.getText());
                    StSenha = String.valueOf(senha.getText());
                    if ((StLogin.equals(login01)) && (StSenha.equals(senha01))) {
                        Intent i = new Intent(MainActivity.this, ActivitySelecionar.class);
                        startActivity(i);
                        finish();
                    } else {
                        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                        builder.setTitle("Erro");
                        builder.setMessage("Login e/ou senha incorretos verifique os dados");
                        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                login.setText("");
                                senha.setText("");
                            }
                        });
                        alerta = builder.create();
                        alerta.show();
                    }
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Verifique todas as informaçoes", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
