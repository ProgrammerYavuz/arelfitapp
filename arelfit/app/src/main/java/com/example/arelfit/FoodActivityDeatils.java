package com.example.arelfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FoodActivityDeatils extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_deatils);

        textView = findViewById(R.id.txt);
        String dstory = getIntent().getStringExtra("story");
        textView.setText(dstory);

    }

    public void gooback(View view) {
        Intent intent = new Intent(FoodActivityDeatils.this,FoodActivity.class);
        startActivity(intent);
        finish();
    }


}