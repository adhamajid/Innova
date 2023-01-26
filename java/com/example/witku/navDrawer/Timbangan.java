package com.example.witku.navDrawer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.witku.R;

public class Timbangan extends AppCompatActivity {

    public EditText g;
    public Button hit;
    public TextView has;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timbangan);

        g = (EditText) findViewById(R.id.input);
        hit = (Button) findViewById(R.id.button);
        has = (TextView) findViewById(R.id.hasil);


        hit.setOnClickListener((v) -> {
            if (g.length()==0){
                Toast.makeText(getApplicationContext(), "belum diisi", Toast.LENGTH_SHORT).show();
            } else{
                String isijari = g.getText().toString();
                double g = Double.parseDouble(isijari);
                double hs = Sambiloto(g);
                String output = String.valueOf(hs);
                has.setText(output.toString());
            }
        });
    }
    public double Sambiloto(double g){return g*125;}
}