package com.example.vsouz.roteiro2;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;

public class TraduzirInglesActivity extends AppCompatActivity {

    private TextView nCor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traduzir_ingles);

        nCor = (TextView) findViewById(R.id.cor);
        Bundle bundle = getIntent().getExtras();
        String cor = bundle.getString("texto");

        if (cor.equalsIgnoreCase("azul")) {
            nCor.setText("A tradução desta cor " + cor + " em inglês é: Blue");
        } else if (cor.equalsIgnoreCase("amarelo")) {
            nCor.setText("A tradução desta cor " + cor + " em inglês é: Yellow");
        } else {
            nCor.setText("A tradução desta cor " + cor + " em inglês é: Red");
        }
        ((Button) findViewById(R.id.button4)).setOnClickListener(new onClick());

    }

    private class onClick implements View.OnClickListener {
        public void onClick(View v) {
            finish();
        }
    }
}
