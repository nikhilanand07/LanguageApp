package com.example.languageapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);



        //Creating the arraylist of Word type  for storing the words
        ArrayList<Word> phrases = new ArrayList<>();

        //adding the phrases into the arrayList
        phrases.add(new Word("One", "Uno"));
        phrases.add(new Word("Two", "Dos"));
        phrases.add(new Word("Three", "Tres"));
        phrases.add(new Word("Four", "Cuatro"));
        phrases.add(new Word("Five", "Cinco"));
        phrases.add(new Word("Six", "Siese"));
        phrases.add(new Word("Seven", "Siete"));
        phrases.add(new Word("Eight", "Ocho"));
        phrases.add(new Word("Nine", "Nuveve"));
        phrases.add(new Word("Ten", "Dias"));



        /*
         * adding the phrases to our activity
         */
//        int index;
//        for(index =0;index < phrases.size();index++){
//            LinearLayout rootView = findViewById(R.id.rootView);
//            TextView wordView = new TextView(this);
//            wordView.setText(phrases.get(index));
//            rootView.addView(wordView);
//        }

        /*
         * Using the array adapter and list view to show our list of items
         */

        WordAdapter itemsAdapter = new WordAdapter(this, phrases, R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.listView);

        listView.setAdapter(itemsAdapter);

    }
}