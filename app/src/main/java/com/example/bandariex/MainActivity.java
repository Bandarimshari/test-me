package com.example.bandariex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText name = (EditText) findViewById(R.id.Name);
        final EditText email = (EditText) findViewById(R.id.Email);
        final EditText number = (EditText) findViewById(R.id.Number);

        final TextView nametv = (TextView) findViewById(R.id.Name);
        final TextView emailtv = (TextView) findViewById(R.id.Email);
        final TextView numbertv = (TextView) findViewById(R.id.Number);
        final TextView position1 = (TextView) findViewById(R.id.Position);
        final Spinner pos = (Spinner) findViewById(R.id.spinner);
        Button flip=(Button) findViewById(R.id.button);
        flip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intent);
            }
        });

    }
}