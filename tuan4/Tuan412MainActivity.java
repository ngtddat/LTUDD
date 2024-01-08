package com.example.myapplication.tuan4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.R;

public class Tuan412MainActivity extends AppCompatActivity {
    Button btnGetData;
    TextView tvKQ;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan412_main);
        Tuan41VolleyFn VolleyFn = new Tuan41VolleyFn();
        tvKQ =findViewById(R.id.tuan412TvKQ);
        btnGetData =findViewById(R.id.tuan412btn);
        btnGetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VolleyFn.getJasonArrayObject(context,tvKQ);
            }
        });
    }
}