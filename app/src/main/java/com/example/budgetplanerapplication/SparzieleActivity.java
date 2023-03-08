package com.example.budgetplanerapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SparzieleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sparziele_layout);

        Button ausgabenButton = findViewById(R.id.button5);
        ausgabenButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(SparzieleActivity.this, StartseiteActivity.class));
                    }
                }
        );
    }




}
