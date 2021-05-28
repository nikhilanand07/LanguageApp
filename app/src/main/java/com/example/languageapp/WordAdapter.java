package com.example.languageapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int colorId;
    public WordAdapter(Activity context, ArrayList<Word> words, int colorId){
        super(context, 0, words);
        this.colorId = colorId;
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
       // LinearLayout imageViewLayout = listItemView.findViewById(R.id.imageViewLayout);  //finds the id of the linear layout containing the images
        if (currentWord.hasImage()){
            imageView.setImageResource(currentWord.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }else{
            imageView.setVisibility(View.GONE);
        }

        LinearLayout layout = listItemView.findViewById(R.id.textLayout);
        int color = ContextCompat.getColor(getContext(), colorId);
        layout.setBackgroundColor(color);




        return listItemView;

    }
}
