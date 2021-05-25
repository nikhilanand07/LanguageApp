package com.example.languageapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words){
        super(context, 0, words);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
      View listItemView = convertView;
      if (listItemView == null){
          listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
      }

      Word currentWord = getItem(position);

        TextView miwokTextView = listItemView.findViewById(R.id.textviewMiwok);
        miwokTextView.setText(currentWord.getmMiwokTranslation());

        TextView englishTextView = listItemView.findViewById(R.id.textviewEnglish);
        englishTextView.setText(currentWord.getmDefaultTranslation());

        ImageView imageView = listItemView.findViewById(R.id.imageView);
        imageView.setImageResource(currentWord.getImageResourceId());

        return listItemView;

    }
}
