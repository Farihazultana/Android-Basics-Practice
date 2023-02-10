package com.example.androidbasic_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.View;
import com.example.androidbasic_recyclerview.databinding.ActivityMainBinding;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding_main;
    ArrayList<String> CityNames = new ArrayList<>(Arrays.asList("Dhaka", "Chittagong", "Barishal","Noakhali","Sirajganj","Norail","Jesore","Hobiganj","Comilla", "Rajshahi", "Mymensingh", "Khulna", "Rangpur", "Sylhet"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding_main = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding_main.getRoot();
        setContentView(view);

        RecyclerView RV = binding_main.recyclerView;
        RV.setLayoutManager(new LinearLayoutManager(this));

        CustomAdapter adapter = new CustomAdapter(this, CityNames);
        RV.setAdapter(adapter);

    }
}