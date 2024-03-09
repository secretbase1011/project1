package com.example.android1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Net202131123002074Activity extends AppCompatActivity {

    static {
        System.loadLibrary("android1");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Use the layout from resources
        setContentView(R.layout.activity_main);

        // Find the TextView by ID
        TextView tv = findViewById(R.id.sample_text);

        // Set the TextView's text
        tv.setText("Hello World");
    }
}
