package com.example.cesur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    Button previous;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    Bundle extras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        previous=(Button)findViewById(R.id.button2);
        textView2=(TextView)findViewById(R.id.vNombre);
        textView3=(TextView)findViewById(R.id.vCentro);
       textView4=(TextView)findViewById(R.id.vCiclo);
        textView5=(TextView)findViewById(R.id.vCurso);

        extras= getIntent().getExtras();
        String d1=extras.getString("Info");
        textView2.setText(d1);
        String d2=extras.getString("Info2");
        textView3.setText(d2);
        String d3=extras.getString("Info3");
        textView4.setText(d3);
        String d4=extras.getString("Info4");
        textView5.setText(d4);

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent previous = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(previous);
            }
        });



    }


}
