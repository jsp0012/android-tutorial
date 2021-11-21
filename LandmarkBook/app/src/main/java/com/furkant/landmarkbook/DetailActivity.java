package com.furkant.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ImageView imageView = findViewById(R.id.imageView);
        TextView landMarkText = findViewById(R.id.LandMarkNameText);
        TextView countryNameText = findViewById(R.id.CountyNameText);

        Intent intent = getIntent();
        landMarkText.setText( intent.getStringExtra("name"));
        countryNameText.setText( intent.getStringExtra("country"));
        Singleton singleton = Singleton.getInstance();
        imageView.setImageBitmap(singleton.getChosenImage());
    }
}