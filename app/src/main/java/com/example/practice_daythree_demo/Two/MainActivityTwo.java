package com.example.practice_daythree_demo.Two;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.practice_daythree_demo.R;

public class MainActivityTwo extends AppCompatActivity {
    TextView textViewtwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_two);
        textViewtwo = findViewById(R.id.textViewtwo);
        Intent intent = getIntent();
        String message = intent.getStringExtra(LayoutInflater_Practice.MSG);
        textViewtwo.setText(message);


    }
}