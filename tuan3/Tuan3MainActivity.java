package com.example.myapplication.tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.myapplication.R;

import java.util.ArrayList; // Import the ArrayList class

public class Tuan3MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<T3Contract> ls = new ArrayList<>(); // Initialize the ArrayList

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan3_main);

        // Initialize the ListView
        lv = findViewById(R.id.tuan3Lv);

        // Add items to the ArrayList
        ls.add(new T3Contract("Nguyen Tien Dat", "20", R.drawable.ic_launcher_background));
        ls.add(new T3Contract("Tran Van Tien", "19", R.drawable.ic_launcher_background));
        ls.add(new T3Contract("Nguyen Van Trong", "18", R.drawable.ic_launcher_background));
        ls.add(new T3Contract("Bui Van Anh", "20", R.drawable.ic_launcher_background));
        ls.add(new T3Contract("Nguyen Trong Dai", "20", R.drawable.ic_launcher_background));
        ls.add(new T3Contract("Nguyen Van An", "24", R.drawable.ic_launcher_background));

        // Create an adapter and set it to the ListView
        T3Adapter adapter = new T3Adapter(ls, this);
        lv.setAdapter(adapter);
    }
}
