package com.example.cetiprof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class actsign extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actsign);
    }

    public void Botonvolver (View view)
    {
        //Objeto para conectar a otra activity
        Intent intent = new Intent(  this, actlog.class);
        //Envio de Objeto Producto serializable
        //intent.putExtra(  "infoSesion", sesion);
        //iniciar la activity
        startActivity(intent);
    }
}
