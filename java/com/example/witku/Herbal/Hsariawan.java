package com.example.witku.Herbal;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.witku.Benefits.Badas;
import com.example.witku.HkayuManis;
import com.example.witku.R;

public class Hsariawan extends AppCompatActivity {

    ImageView kayumanis;
    ImageView adas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hsariawan);

        kayumanis=findViewById(R.id.KayuMan);
        adas=findViewById(R.id.Adas);

        kayumanis.setOnClickListener(view -> {startActivity(new Intent(Hsariawan.this , HkayuManis.class));});

        adas.setOnClickListener(view -> {startActivity(new Intent(Hsariawan.this , Badas.class));});
    }
}