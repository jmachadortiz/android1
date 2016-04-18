package com.example.jmachadortiz.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView nombre;
    private TextView email;
    private Button closebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nombre = (TextView) findViewById(R.id.nombre);
        email = (TextView) findViewById(R.id.correo);
        closebtn = (Button) findViewById(R.id.close);
        closebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);

            }
        });

        String newString;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null || extras.getString("nombre") == "") {
                nombre.setText("no tienes nombre?");
            } else {
                nombre.setText(extras.getString("nombre"));
                email.setText(extras.getString("email"));
            }
        } else {
            newString= (String) savedInstanceState.getSerializable("STRING_I_NEED");
        }
    }

    public void onClick(View v){

    }
}
