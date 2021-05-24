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
        colors.add(new Word("One", "Uno"));
        colors.add(new Word("Two", "Dos"));
        colors.add(new Word("Three", "Tres"));
        colors.add(new Word("Four", "Cuatro"));
        colors.add(new Word("Five", "Cinco"));
        colors.add(new Word("Six", "Siese"));
        colors.add(new Word("Seven", "Siete"));
        colors.add(new Word("Eight", "Ocho"));
        colors.add(new Word("Nine", "Nuveve"));
        colors.add(new Word("Ten","Dias"));

        /*
         * Using the array adapter and list view to show our list of items
         */

        WordAdapter itemsAdapter = new WordAdapter(this, colors);

        ListView listView = (ListView) findViewById(R.id.listView);

        listView.setAdapter(itemsAdapter);



    }
}