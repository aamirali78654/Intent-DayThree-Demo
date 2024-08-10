package com.example.practice_daythree_demo.Two;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.practice_daythree_demo.R;

public class LayoutInflater_Practice extends AppCompatActivity {
    Button button;
    EditText editText,editPassword;
    TextView textViewtwo;
    public static final String MSG="HelloPark";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_layout_inflater_practice);

        //===================Intent declair Second Activity================>>

        Intent intent = new Intent(this,MainActivityTwo.class);

        //_________________declaired id for button and EditText______________>>

        button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.editTextText);
        editPassword = (EditText) findViewById(R.id.editTextTextPassword);

        //-----------------OnClick Listener------------>>

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textViewtwo = findViewById(R.id.textViewtwo);
                String str = "Name: "+editText.getText().toString()
                        +"\n"+"Password: "+editPassword.getText().toString();
                intent.putExtra(MSG,str);
                startActivity(intent);
            }
        });


    }
}