package com.example.cetiprof;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import org.json.JSONArray;
import org.json.JSONException;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import cz.msebera.android.httpclient.Header;


public class actprincipal extends AppCompatActivity {

//---------------------------------------------Objetos----------------------------------------------
    //Objetos

    //Objetos de componentes graficos
    private TextView txtListaProfesores;

//--------------------------------------------On Create---------------------------------------------
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actprincipal);

        //Asociar los objetos con sus contrapartes visuales
        txtListaProfesores = (TextView) findViewById(R.id.txtListaProfesores);

        //>>>>>>Ejecutar funciones<<<<<<
        ListaProfesores();
    }

//--------------------------------------------Funciones---------------------------------------------
    public void ListaProfesores()
    {
        //Objeto para obtener los datos del servidor
        AsyncHttpClient client = new AsyncHttpClient();
        //Se esta
        client.get("http://192.168.1.70/guiacastor/ListaProfesores.php",
                new AsyncHttpResponseHandler() {
                    @Override
                    public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                        //El código 200 indica que hubo resultados
                        if(statusCode == 200)
                        {
                            try
                            {
                                String x = new String(responseBody);
                                if( !x.equals("0"))
                                {
                                    int i=0;
                                    JSONArray contacto = new JSONArray(new String(responseBody));
                                    while (i < contacto.length())
                                    {
                                        txtListaProfesores.setText(txtListaProfesores.getText() + "\nRegistro: ");
                                        txtListaProfesores.setText(txtListaProfesores.getText() + contacto.getJSONObject(i).getString("REGISTRO"));
                                        txtListaProfesores.setText(txtListaProfesores.getText() + "\nNombre: ");
                                        txtListaProfesores.setText(txtListaProfesores.getText() + contacto.getJSONObject(i).getString("NOMBRE"));
                                        txtListaProfesores.setText(txtListaProfesores.getText() + "\nSeccion: ");
                                        txtListaProfesores.setText(txtListaProfesores.getText() + contacto.getJSONObject(i).getString("SECCION"));
                                        txtListaProfesores.setText(txtListaProfesores.getText() + "\nArea: ");
                                        txtListaProfesores.setText(txtListaProfesores.getText() + contacto.getJSONObject(i).getString("AREA") + "\n");
                                        i++;
                                    }
                                } else
                                    Toast.makeText(actprincipal.this, "Contacto no encontrado.", Toast.LENGTH_LONG).show();
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }//if
                        else {
                            Toast.makeText(actprincipal.this, "Sin resultado.", Toast.LENGTH_LONG).show();
                        }
                    }//onSuccess

                    @Override
                    public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

                    }//onFailure
                });
    }//Lista de Profesores - Fin
    }

