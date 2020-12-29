package com.example.new_remoteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class in_schooling_detail extends AppCompatActivity {

    LinearLayout preSchool;
    ImageButton cls1,cls2,cls3,cls4,cls5,cls6,cls7,cls8,cls9,cls10,cls11,cls12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_schooling_detail);

        preSchool=findViewById(R.id.ll_pre_schooling);
        cls1=findViewById(R.id.ib_cls1);
        cls2=findViewById(R.id.ib_cls2);
        cls3=findViewById(R.id.ib_cls3);
        cls4=findViewById(R.id.ib_cls4);
        cls5=findViewById(R.id.ib_cls5);
        cls6=findViewById(R.id.ib_cls6);
        cls7=findViewById(R.id.ib_cls7);
        cls8=findViewById(R.id.ib_cls8);
        cls9=findViewById(R.id.ib_cls9);
        cls10=findViewById(R.id.ib_cls10);
        cls11=findViewById(R.id.ib_cls11);
        cls12=findViewById(R.id.ib_cls12);


        cls1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(in_schooling_detail.this,in_class_first.class));
            }
        });

        cls2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(in_schooling_detail.this,in_class_second.class));

            }
        });

        cls3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(in_schooling_detail.this,in_class_third.class));
            }
        });

        cls4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(in_schooling_detail.this,in_class_fourth.class));

            }
        });

        cls5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(in_schooling_detail.this,in_class_fifth.class));

            }
        });

        cls6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(in_schooling_detail.this,in_class_sixth.class));
            }
        });

        cls7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(in_schooling_detail.this,in_class_seventh.class));

            }
        });

        cls8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(in_schooling_detail.this,in_class_eight.class));
            }
        });

        cls9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(in_schooling_detail.this,in_class_ninth.class));

            }
        });

        cls10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(in_schooling_detail.this,in_class_tenth.class));

            }
        });

        cls11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(in_schooling_detail.this,in_class_eleventh.class));

            }
        });

        cls12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(in_schooling_detail.this,in_class_twelfth.class));

            }
        });

        preSchool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(in_schooling_detail.this,in_preSchool.class));
            }
        });
    }
}