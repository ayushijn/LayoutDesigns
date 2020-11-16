package com.example.layoutdesigns;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.layoutdesigns.Activities.DesignOneActivity;
import com.example.layoutdesigns.Activities.DesignTwoActivity;
import com.example.layoutdesigns.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    public void setListener() {
        binding.one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(MainActivity.this, DesignOneActivity.class);
                startActivity(i1);
            }
        });
       binding.two.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent i2=new Intent(MainActivity.this, DesignTwoActivity.class);
               startActivity(i2);
           }
       });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setListener();

    }
}