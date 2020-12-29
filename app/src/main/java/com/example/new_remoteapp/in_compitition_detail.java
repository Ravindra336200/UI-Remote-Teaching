package com.example.new_remoteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class in_compitition_detail extends AppCompatActivity {

    LinearLayout ll_law,ll_language,ll_gk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_compitition_detail);

        ll_law=findViewById(R.id.in_compitition_law);
        ll_gk=findViewById(R.id.in_compitition_gk);
        ll_language=findViewById(R.id.in_compitition_language);

        ll_law.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(in_compitition_detail.this,in_compitition_detail_law.class));
            }
        });

        ll_language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(in_compitition_detail.this,in_compitition_detail_language.class));
            }
        });

        ll_gk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(in_compitition_detail.this,in_compitition_detail_gk.class));
            }
        });

    }
}