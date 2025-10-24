package com.example.androiduitesting;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView cityNameView = findViewById(R.id.city_name);
        Button backButton = findViewById(R.id.button_back);

        String cityName = getIntent().getStringExtra("city_name");
        if (cityName != null) {
            cityNameView.setText(cityName);
        }

        backButton.setOnClickListener(v -> finish());
    }
}

