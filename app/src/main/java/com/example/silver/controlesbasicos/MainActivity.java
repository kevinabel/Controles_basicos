package com.example.silver.controlesbasicos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtusu,txtpas;
    Button btnIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtusu =(EditText) findViewById(R.id.txtusu);
        txtpas =(EditText) findViewById(R.id.txtpas);
        btnIngresar=(Button) findViewById(R.id.btnIngresar);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usu=txtusu.getText().toString();
                String pas=txtpas.getText().toString();
                
                if(usu.equalsIgnoreCase("kevin")&& pas.equalsIgnoreCase("kevin")){
                    Intent i=new Intent(getApplicationContext(),MainActivity2.class);
                    startActivity(i);
                }else{
                    Toast.makeText(getApplicationContext(),"Usuario o contraseña incorrectas",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
