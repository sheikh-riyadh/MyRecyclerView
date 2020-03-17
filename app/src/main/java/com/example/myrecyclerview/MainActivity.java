package com.example.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    int [] images = {
            R.drawable.bentley,R.drawable.ford,R.drawable.hyundai,
            R.drawable.marcedese,R.drawable.nissan,R.drawable.toyota
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewID);

        String [] cars_names,cars_description;
        cars_names = getResources().getStringArray(R.array.cars_names);
        cars_description = getResources().getStringArray(R.array.cars_description);

       MyAdapter myAdapter = new MyAdapter(this,cars_names,cars_description,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}
