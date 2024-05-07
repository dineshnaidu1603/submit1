package com.example.submit1;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class faculty extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<DataClass> dataList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.faculty);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize data
        initData();

        // Initialize adapter
        adapter = new MyAdapter(dataList);
        recyclerView.setAdapter(adapter);
    }

    private void initData() {
        dataList = new ArrayList<>();
        dataList.add(new DataClass(R.drawable.vg));
        dataList.add(new DataClass(R.drawable.vg));
        dataList.add(new DataClass(R.drawable.third));

        // Add more data items if needed
    }
}
