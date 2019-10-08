package com.example.proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class segundaPagina extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pagina);
    }

    //Metodo boton inicio

    public void Menu(View view){
        Intent menu = new Intent(this,MainActivity.class);
        startActivity(menu);
    }
}
