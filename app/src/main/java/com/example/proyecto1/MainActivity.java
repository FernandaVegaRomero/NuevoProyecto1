package com.example.proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Metodo boton uno

    public void Uno(View view) {
        Intent uno = new Intent(this, segundaPagina.class);
        startActivity(uno);

    }

    //Metodo boton dos
    public void Dos(View view){
        Intent dos = new Intent(this, terceraPagina.class);
        startActivity(dos);
    }

    //Metodo boton tres
    public void Tres(View view){
        Intent tres = new Intent(this, cuartaPagina.class);
        startActivity(tres);
    }

    //Metodo boton cuatro
    public void Cuatro(View view){
        Intent cuatro = new Intent(this,quintaPagina.class);
        startActivity(cuatro);
    }

    //Metodo boton cinco
    public void Cinco (View view){
        Intent cinco = new Intent(this,sextaPagina.class);
        startActivity(cinco);
    }

    //Metodo boton seis
    public void Seis (View view){
        Intent seis = new Intent(this,septimaPagina.class);
        startActivity(seis);
    }

    //Metodo boton siete
    public void Siete (View view){
        Intent siete = new Intent(this,octavaPagina.class);
        startActivity(siete);
    }

    //Metodo boton ocho
    public void Ocho (View view){
        Intent ocho = new Intent(this,novenaPagina.class);
        startActivity(ocho);
    }

    //Metodo boton nueve
    public void Nueve (View view){
        Intent nueve = new Intent(this,decimapagina.class);
        startActivity(nueve);
    }

    //Metodo boton diez

    public void Diez (View view){
        Intent diez = new Intent(this,oceavapagina.class);
        startActivity(diez);
    }
}



