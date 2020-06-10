package com.example.cetiprof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Objeto para conectar a otra activity:
        final Intent intent = new Intent(  this, actprincipal.class);
        //--------------------------Envio de Objetos------------------------------------------------
        //intent.putExtra(  "infoSesion", sesion);
        //-----------------Configurar duracion de la splash screen----------------------------------
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                startActivity(intent);    //iniciar el objeto que ejecuta la siguiente activity
            }
        }, 5000);                   //duracion del Splash screen actual
    }
}


