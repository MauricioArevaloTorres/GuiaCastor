package com.example.cetiprof;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class actlog extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actlog);
    }



    public void BotonCrearCuenta (View view)
    {
        //Objeto para conectar a otra activity
        Intent intent = new Intent(  this, actsign.class);
        //Envio de Objeto Producto serializable
        //intent.putExtra(  "infoSesion", sesion);
        //iniciar la activity
        startActivity(intent);
    }
    public void BotonAceptar (View view)
    {
        //Objeto para conectar a otra activity
        Intent intent = new Intent(  this, actprincipal.class);
        //Envio de Objeto Producto serializable
        //intent.putExtra(  "infoSesion", sesion);
        //iniciar la activity
        startActivity(intent);
    }


}
