package com.example.androidbasic_recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.androidbasic_recyclerview.databinding.ActivityMainBinding;
import com.example.androidbasic_recyclerview.databinding.RowItemBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding_main = ActivityMainBinding.inflate(getLayoutInflater());

        View view = binding_main.getRoot();

        setContentView(view);


    }
}