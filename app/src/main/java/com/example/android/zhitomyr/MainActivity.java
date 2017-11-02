package com.example.android.zhitomyr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView sights = (TextView) findViewById(R.id.sights);
        sights.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sightsIntent = new Intent(MainActivity.this, Sights.class);
                startActivity(sightsIntent);
            }
        });

        TextView foodAndDrinks = (TextView) findViewById(R.id.food_and_drinks);
        foodAndDrinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent foodAndDrinksIntent = new Intent(MainActivity.this, FoodAndDrinks.class);
                startActivity(foodAndDrinksIntent);
            }
        });

        TextView accommodation = (TextView) findViewById(R.id.accommodation);
        accommodation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent accommodationIntent = new Intent(MainActivity.this, Accommodation.class);
                startActivity(accommodationIntent);
            }
        });


    }
}