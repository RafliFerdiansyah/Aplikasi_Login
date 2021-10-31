package com.rafliferdiansyah.simpansisteminformasipegawaiandalan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_main);
        ImageButton btnprofil = findViewById(R.id.buttonprofil);
        btnprofil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainProfile();
            }
        });
    }

    public void openMainProfile() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}