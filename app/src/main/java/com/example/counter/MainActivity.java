package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button count;
    private TextView counter;
    static int num = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        count = findViewById(R.id.count);
        counter = findViewById(R.id.counter);
        counter.setText(String.valueOf(num));

        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num++;

                counter.setText(String.valueOf(num));
            }
        });
    }
}