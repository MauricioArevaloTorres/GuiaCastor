package com.example.cetiprof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class actlista extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actlista);
    }

    public void BotonBusqueda (View view)
    {
        //Objeto para conectar a otra activity
        Intent intent = new Intent(  this, actlista.class);
        //Envio de Objeto Producto serializable
        //intent.putExtra(  "infoSesion", sesion);
        //iniciar la activity
        startActivity(intent);
    }

    public void Volver (View view)
    {
        //Objeto para conectar a otra activity
        Intent intent = new Intent(  this, actlog.class);
        //Envio de Objeto Producto serializable
        //intent.putExtra(  "infoSesion", sesion);
        //iniciar la activity
        startActivity(intent);
    }

    public void Profesor (View view)
    {
        //Objeto para conectar a otra activity
        Intent intent = new Intent(  this, actlista.class);
        //Envio de Objeto Producto serializable
        //intent.putExtra(  "infoSesion", sesion);
        //iniciar la activity
        startActivity(intent);
    }
}
