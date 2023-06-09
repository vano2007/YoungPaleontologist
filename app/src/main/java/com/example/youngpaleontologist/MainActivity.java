package com.example.youngpaleontologist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.location.GnssAntennaInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.animation.AnimatableView;

public class MainActivity extends AppCompatActivity {
    // поля
    private ImageButton imageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // присваивание id полям
        imageButton = findViewById(R.id.imageButton);

        // обработка нажатия кнопки
        imageButton.setOnClickListener(listener);
    }
    // создание слушателя
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            // переключение на новую активность
            Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
            startActivity(intent);

        }
    };
}