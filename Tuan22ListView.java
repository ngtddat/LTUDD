package com.example.myapplication.tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.myapplication.R;

public class Tuan22MainActivity extends AppCompatActivity {
    ListView lv;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan22_main);
        lv=findViewById(R.id.tuan22lv);
        String[] arr=new String[]{"A43080","NTD","List1","List2","List 3","List4","666"};
        ArrayAdapter<String>
                adapter=new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1,arr);
        lv.setAdapter(adapter);
    }
}
