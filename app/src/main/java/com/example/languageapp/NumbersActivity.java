package com.example.languageapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Creating the arraylist of Word type  for storing the words
        ArrayList<Word> words = new ArrayList<>();

        //adding the words into the arrayList
        words.add(new Word("One", "Uno", R.drawable.number_one));
        words.add(new Word("Two", "Dos",R.drawable.number_two));
        words.add(new Word("Three", "Tres",R.drawable.number_three));
        words.add(new Word("Four", "Cuatro",R.drawable.number_four));
        words.add(new Word("Five", "Cinco",R.drawable.number_five));
        words.add(new Word("Six", "Siese", R.drawable.number_six));
        words.add(new Word("Seven", "Siete", R.drawable.number_seven));
        words.add(new Word("Eight", "Ocho", R.drawable.number_eight));
        words.add(new Word("Nine", "Nuveve", R.drawable.number_nine));
        words.add(new Word("Ten", "Dias", R.drawable.number_ten));



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

        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.listView);

        listView.setAdapter(itemsAdapter);

    }
}