package com.testando.classeobjetosnapratica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Funcionario funcionario= new Funcionario();
        funcionario.nome="Yasmin";
        funcionario.salario=920;

        funcionario.recuperarSalario();

        //instaciando classe
        /*Casa minhaCasa = new Casa();
        minhaCasa.cor=" Azul";

        System.out.println(minhaCasa.cor);
        minhaCasa.abrirPorta();*/
    }
}
