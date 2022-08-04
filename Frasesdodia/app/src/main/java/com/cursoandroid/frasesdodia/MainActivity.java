package com.cursoandroid.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        String[] frases = {
                "O próprio Senhor irá à sua frente e estará com você; ele nunca o deixará, nunca o abandonará. Não tenha medo! Não se desanime! (Deuteronômio 31:8)",
                "Senhor a Ti clamo, escuta-me; inclina os Teus ouvidos à minha voz, quando a Ti clamar. (Salmo 141:1)",
                "Honra teu pai e tua mãe, a fim de que tenhas vida longa na terra que o Senhor teu Deus te dá. (Êxodo 20:12)\n" ,
                        "Fé não faz as coisas serem fáceis mas as tornam totalmente possíveis, creia. (Romanos 5:8)"
        };
        int numero = new Random().nextInt(4);//0 1 2 3

        TextView texto = findViewById(R.id.textResultado);
        texto.setText( frases[numero] );

    }

}
