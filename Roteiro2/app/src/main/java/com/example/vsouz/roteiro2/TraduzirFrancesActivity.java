package com.example.vsouz.roteiro2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class TraduzirFrancesActivity extends AppCompatActivity {

    private TextView nCor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traduzir_frances);

        nCor = (TextView)findViewById(R.id.cor);
        Bundle bundle = getIntent().getExtras();
        String cor = bundle.getString("texto");

        if (cor.equalsIgnoreCase("azul")) {
            nCor.setText("A tradução desta cor " + cor + " em Francês é: Bleu");
        } else if (cor.equalsIgnoreCase("amarelo")) {
            nCor.setText("A tradução desta cor " + cor + " em Francês é: Jaune");
        } else {
            nCor.setText("A tradução desta cor " + cor + " em Francês é: Rouge");
        }
        ((Button) findViewById(R.id.button5)).setOnClickListener(new onClick());

    }

    private class onClick implements View.OnClickListener {
        public void onClick(View v) {
            finish();
        }
    }
    }

