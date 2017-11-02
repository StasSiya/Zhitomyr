package com.example.android.zhitomyr;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Sights extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sights);


        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("Sergiy Korolyov Astronautics Museum", "Музей Космонавтики iм.С.П.Корольова", R.drawable.sights, R.raw.one));
        items.add(new Item("Saviour Transfiguration Cathedral", "Спасо-Преображенский собор", R.drawable.sights, R.raw.fall));
        items.add(new Item("Zamkova Gora Park", "Замковая гора", R.drawable.sights, R.raw.one));
        items.add(new Item("Sergiy Korolyov Astronautics Museum", "Музей Космонавтики iм.С.П.Корольова", R.drawable.sights, R.raw.one));
        items.add(new Item("Saviour Transfiguration Cathedral", "Спасо-Преображенский собор", R.drawable.sights, R.raw.one));
        items.add(new Item("Zamkova Gora Park", "Замковая гора", R.drawable.sights, R.raw.one));
        //  items.add(new Item("Sergiy Korolyov Astronautics Museum", "Музей Космонавтики iм.С.П.Корольова", R.drawable.sights));
        //  items.add(new Item("Saviour Transfiguration Cathedral", "Спасо-Преображенский собор", R.drawable.sights));
        // items.add(new Item("Zamkova Gora Park", "Замковая гора", R.drawable.sights));


        ItemAdapter sightsAdapter = new ItemAdapter(Sights.this, items, R.color.sights_color);

        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(sightsAdapter);

    }



}