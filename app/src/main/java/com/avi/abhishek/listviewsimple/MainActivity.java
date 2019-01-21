package com.avi.abhishek.listviewsimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {


    //The App is used to display the arraylist of superheroes in a listview which is
    // scrollable in itself
    ArrayList<String> superHeroes=new ArrayList<>(Arrays.asList("Batman","Superman","Flash",
            "Supergirl","Arrow","Thor","Hulk"
            ,"Ironman","Captain America","Black Widow","Clint","WonderWoman","Krrish"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=findViewById(R.id.listView);

        //To connect listview to data we need an adapter and as above data is in (simple) form of an array we can create
        //an arrayAdapter... For complex data custom adapters are used

        ArrayAdapter<String> superHeroAdapter=new ArrayAdapter<>(this,
                R.layout.list_item_superhero,
                R.id.superHeroName,
                superHeroes);
        listView.setAdapter(superHeroAdapter);

    }
}
