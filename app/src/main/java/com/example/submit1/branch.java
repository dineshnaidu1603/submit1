package com.example.submit1;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class branch extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<DataClass> dataList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.branch);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Get the button index from intent
        int buttonIndex = getIntent().getIntExtra("BUTTON_INDEX", 0);

        // Initialize data based on button index
        initData(buttonIndex);

        // Initialize adapter
        adapter = new MyAdapter(dataList);
        recyclerView.setAdapter(adapter);
    }

    private void initData(int buttonIndex) {
        dataList = new ArrayList<>();
        switch (buttonIndex) {
            case 1:
                // Data for first button
                dataList.add(new DataClass(R.drawable.aimlb));
                dataList.add(new DataClass(R.drawable.aimlb));
                // Add more data items if needed
                break;
            case 2:
                // Data for second button
                dataList.add(new DataClass(R.drawable.aimlb));
                dataList.add(new DataClass(R.drawable.aimlb));
                dataList.add(new DataClass(R.drawable.aimlb));
                // Add more data items if needed
                break;
            case 3:
                // Data for third button
                dataList.add(new DataClass(R.drawable.aimlb));
                dataList.add(new DataClass(R.drawable.aimlb));
                dataList.add(new DataClass(R.drawable.aimlb));
                dataList.add(new DataClass(R.drawable.aimlb));
                dataList.add(new DataClass(R.drawable.aimlb));
                // Add more data items if needed
                break;
            case 4:
                // Data for fourth button
                dataList.add(new DataClass(R.drawable.aimlb));
                dataList.add(new DataClass(R.drawable.aimlb));
                dataList.add(new DataClass(R.drawable.aimlb));
                dataList.add(new DataClass(R.drawable.aimlb));
                dataList.add(new DataClass(R.drawable.aimlb));
                dataList.add(new DataClass(R.drawable.aimlb));
                dataList.add(new DataClass(R.drawable.aimlb));

                // Add more data items if needed
                break;
            default:
                // Default data
                dataList.add(new DataClass(R.drawable.aimlb));
                break;
        }
    }
}
