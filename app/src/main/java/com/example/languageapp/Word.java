package com.example.languageapp;

public class Word {
    /*
    Default translation of the word
     */

    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public Word(String mDefaultTranslation, String mMiwokTranslation){
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
}
