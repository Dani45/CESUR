package com.example.cesur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button next;
    //Entrada de datos
    EditText editText;
    EditText editText2;
    EditText editText3;
    EditText editText4;
    String x ="datos";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        next=(Button)findViewById(R.id.button);
        editText = (EditText)findViewById(R.id.nombre1);
        editText2 = (EditText)findViewById(R.id.centro1);
        editText3 = (EditText)findViewById(R.id.ciclo1);
        editText4 = (EditText)findViewById(R.id.curso1);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(MainActivity.this,Main2Activity.class);
                next.putExtra("Info",editText.getText().toString());
                next.putExtra("Info2",editText2.getText().toString());
                next.putExtra("Info3",editText3.getText().toString());
                next.putExtra("Info4",editText4.getText().toString());

                startActivity(next);
            }
        });

    }
}
