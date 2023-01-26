package com.example.witku.Herbal;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.witku.Benefits.Bsirih;
import com.example.witku.Hblimbing;
import com.example.witku.HjerukN;
import com.example.witku.Imun.Ikapulaga;
import com.example.witku.R;

public class Hbatuk extends AppCompatActivity {

    ImageView kapulaga;
    ImageView sirih;
    ImageView belimbing;
    ImageView jeruk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hbatuk);

        belimbing=findViewById(R.id.Belimbing);
        jeruk=findViewById(R.id.JerukN);
        kapulaga=findViewById(R.id.Kapulaga);
        sirih=findViewById(R.id.Sirih);

        belimbing.setOnClickListener(view -> {startActivity(new Intent(Hbatuk.this,Hblimbing.class));});
        jeruk.setOnClickListener(view -> {startActivity(new Intent(Hbatuk.this,HjerukN.class));});
        kapulaga.setOnClickListener(view -> {startActivity(new Intent(Hbatuk.this , Ikapulaga.class));});
        sirih.setOnClickListener(view -> startActivity(new Intent(Hbatuk.this, Bsirih.class)));
    }
}