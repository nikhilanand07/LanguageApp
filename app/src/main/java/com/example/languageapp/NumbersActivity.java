package com.example.languageapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //Creating the arraylist of Word type  for storing the words
        ArrayList<Word> words = new ArrayList<>();

        //adding the words into the arrayList
        words.add(new Word("One", "Uno"));
        words.add(new Word("Two", "Dos"));
        words.add(new Word("Three", "Tres"));
        words.add(new Word("Four", "Cuatro"));
        words.add(new Word("Five", "Cinco"));
        words.add(new Word("Six", "Siese"));
        words.add(new Word("Seven", "Siete"));
        words.add(new Word("Eight", "Ocho"));
        words.add(new Word("Nine", "Nuveve"));
        words.add(new Word("Ten", "Dias"));



        /*
        * adding the words to our activity
         */
//        int index;
//        for(index =0;index < words.size();index++){
//            LinearLayout rootView = findViewById(R.id.rootView);
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(index));
//            rootView.addView(wordView);
//        }

    /*
    * Using the array adapter and list view to show our list of items
     */

        WordAdapter itemsAdapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.listView);

        listView.setAdapter(itemsAdapter);

    }
}