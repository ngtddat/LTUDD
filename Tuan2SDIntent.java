package com.example.myapplication.tuan2;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.content.Intent;


import android.os.Bundle;

import com.example.myapplication.R;

public class Tuan2SDActivity extends AppCompatActivity {
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan2_sdactivity);

        tv1=findViewById(R.id.tuan2tv2);
        Intent i1=getIntent();
        String str1=i1.getExtras().getString("so1");
        String str2=i1.getExtras().getString("so2");
        float so1=Float.parseFloat(str1);
        float so2=Float.parseFloat(str2);
        float tong=so1+so2;
        tv1.setText(String.valueOf(tong));
    }
}
