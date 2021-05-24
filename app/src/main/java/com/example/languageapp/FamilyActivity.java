package com.example.languageapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);



        //Creating the arraylist of Word type  for storing the words
        ArrayList<Word> family = new ArrayList<>();

        //adding the family into the arrayList
        family.add(new Word("Father", "Padre"));
        family.add(new Word("Mother", "mamá"));
        family.add(new Word("Son", "hijo"));
        family.add(new Word("Daughter", "hija"));
        family.add(new Word("Older Brother", "Hermano mayor"));
        family.add(new Word("Younger Brother", "hermano más joven"));
        family.add(new Word("Older Sister", "hermana mayor"));
        family.add(new Word("Younger Sister", "hermana menor"));
        family.add(new Word("Grandmother", "abuela"));
        family.add(new Word("GrandFather", "abuelo"));



        /*
         * adding the family to our activity
         */
//        int index;
//        for(index =0;index < family.size();index++){
//            LinearLayout rootView = findViewById(R.id.rootView);
//            TextView wordView = new TextView(this);
//            wordView.setText(family.get(index));
//            rootView.addView(wordView);
//        }

        /*
         * Using the array adapter and list view to show our list of items
         */

        WordAdapter itemsAdapter = new WordAdapter(this, family);

        ListView listView = (ListView) findViewById(R.id.listView);

        listView.setAdapter(itemsAdapter);

    }
}