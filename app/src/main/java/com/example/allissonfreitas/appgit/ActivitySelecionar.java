package com.example.allissonfreitas.appgit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivitySelecionar extends AppCompatActivity {

    Button compromisso, visualizarcomp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecionar);
        compromisso = (Button) findViewById(R.id.btCompromisso);
        visualizarcomp = (Button) findViewById(R.id.btVer);

        compromisso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ActivitySelecionar.this, Compromisso.class);
                startActivity(i);
            }
        });

        visualizarcomp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ActivitySelecionar.this, VerCompromisso.class);
                startActivity(i);
            }
        });

    }
}
