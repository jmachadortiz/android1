package com.example.jmachadortiz.proyecto;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;

import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener{

    private static final int REQUEST_CODE = 10;
    private Button x;
    private EditText nombre;
    private EditText email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        x = (Button) findViewById(R.id.b1);
        x.setOnClickListener(this);
        nombre = (EditText) findViewById(R.id.name);
        email  = (EditText) findViewById(R.id.email);
    }

    @Override
    public void onClick(View v){

            Intent A2 = new Intent(this,MainActivity2.class);
            A2.putExtra("nombre",nombre.getText().toString());
            A2.putExtra("email", email.getText().toString());
            startActivity(A2);

    }




}
