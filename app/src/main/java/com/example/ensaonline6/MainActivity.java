package com.example.ensaonline6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button prepabtn;
    private Button ingbtn;

    public void openClassPrepa() {
        Intent intent = new Intent(this, CyclePrepa.class);
        startActivity(intent);
    }

    public void openCyclIng() {
        Intent intent = new Intent(this, CycleIng.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prepabtn = (Button) findViewById(R.id.prepabtn);
        prepabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClassPrepa();
            }
        });

        ingbtn = (Button) findViewById(R.id.ingbtn);
        ingbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCyclIng();
            }
        });


    }
//activity_cycle_ing
}
