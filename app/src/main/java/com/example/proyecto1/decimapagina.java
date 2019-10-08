package com.example.proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class decimapagina extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decimapagina);
    }

    //Metodo boton menu

    public void Menu(View view){
        Intent menu = new Intent(this,MainActivity.class);
        startActivity(menu);
    }
}
