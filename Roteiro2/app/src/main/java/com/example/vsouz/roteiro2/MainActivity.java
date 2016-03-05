package com.example.vsouz.roteiro2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button nButton;
    private Button nButton2;
    private Button nButton3;
    private EditText nCor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nButton = (Button)findViewById(R.id.button);
        nButton2 = (Button)findViewById(R.id.button2);
        nButton3 = (Button)findViewById(R.id.button3);
        nCor = (EditText)findViewById(R.id.cor);

        nButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cor = nCor.getText().toString();
                if (cor.equalsIgnoreCase("Azul")||cor.equalsIgnoreCase("Amarelo")||cor.equalsIgnoreCase("Vermelho")){
                    Bundle bundle = new Bundle();
                    bundle.putString("Texto", cor);
                    Intent intent = new Intent("Traduzir");
                    intent.putExtras(bundle);
                    startActivity(intent);
                }else{
                    View focus = null;
                    nCor.setError("Cor inválida");
                    focus = nCor;
                    focus.requestFocus();
                }
            }
        });

        nButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cor = nCor.getText().toString();
                if (cor.equalsIgnoreCase("Azul")||cor.equalsIgnoreCase("Amarelo")||cor.equalsIgnoreCase("Vermelho")){
                    Bundle bundle = new Bundle();
                    bundle.putString("Texto", cor);
                    Intent intent = new Intent("Traduzir").addCategory("TraduzirIngles");
                    intent.putExtras(bundle);
                    startActivity(intent);
                }else{
                    View focus = null;
                    nCor.setError("Cor inválida");
                    focus = nCor;
                    focus.requestFocus();
                }
            }
        });

        nButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cor = nCor.getText().toString();
                if (cor.equalsIgnoreCase("Azul")||cor.equalsIgnoreCase("Amarelo")||cor.equalsIgnoreCase("Vermelho")){
                    Bundle bundle = new Bundle();
                    bundle.putString("Texto", cor);
                    Intent intent = new Intent("Traduzir").addCategory("TraduzirFrances");
                    intent.putExtras(bundle);
                    startActivity(intent);
                }else{
                    View focus = null;
                    nCor.setError("Cor inválida");
                    focus = nCor;
                    focus.requestFocus();
                }
            }
        });

    }
}
