package com.example.witku.Herbal;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.witku.Benefits.Balang;
import com.example.witku.Benefits.Bsirih;
import com.example.witku.Hanting;
import com.example.witku.Hpegagan;
import com.example.witku.R;

public class Hmimisan extends AppCompatActivity {

    ImageView sirih;
    ImageView pegagan;
    ImageView alang;
    ImageView anting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hmimisan);

        sirih=findViewById(R.id.Sirih);
        pegagan=findViewById(R.id.Pegagan);
        alang=findViewById(R.id.Alang);
        anting=findViewById(R.id.Anting);

        sirih.setOnClickListener(view -> {startActivity(new Intent(Hmimisan.this , Bsirih.class));});

        pegagan.setOnClickListener(view -> {startActivity(new Intent(Hmimisan.this , Hpegagan.class));});

        alang.setOnClickListener(view -> {startActivity(new Intent(Hmimisan.this , Balang.class));});

        anting.setOnClickListener(view -> {startActivity(new Intent(Hmimisan.this , Hanting.class));});
    }
}