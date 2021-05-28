package com.example.languageapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Creating the arraylist of Word type  for storing the words
        ArrayList<Word> colors = new ArrayList<>();

        //adding the words into the arrayList
        colors.add(new Word("One", "Uno", R.drawable.color_black));
        colors.add(new Word("Two", "Dos",R.drawable.color_brown));
        colors.add(new Word("Three", "Tres", R.drawable.color_dusty_yellow));
        colors.add(new Word("Four", "Cuatro", R.drawable.color_gray));
        colors.add(new Word("Five", "Cinco",R.drawable.color_green));
        colors.add(new Word("Six", "Siese", R.drawable.color_mustard_yellow));
        colors.add(new Word("Seven", "Siete", R.drawable.color_red));
        colors.add(new Word("Eight", "Ocho", R.drawable.color_white));
        colors.add(new Word("Nine", "Nuveve", R.drawable.color_black));
        colors.add(new Word("Ten","Dias", R.drawable.color_red));

        /*
         * Using the array adapter and list view to show our list of items
         */

        WordAdapter itemsAdapter = new WordAdapter(this, colors, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.listView);

        listView.setAdapter(itemsAdapter);



    }
}