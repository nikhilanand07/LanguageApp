package com.example.languageapp;

public class Word {
    /*
    Default translation of the word
     */

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mimageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    //first constructor
    public Word(String mDefaultTranslation, String mMiwokTranslation){
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
    }

    //second constructor : it takes an extra argumet imageResourceId
    public Word(String mDefaultTranslation, String mMiwokTranslation, int mimageResourceId){
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mimageResourceId = mimageResourceId;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId(){ return mimageResourceId; }

    public boolean hasImage(){
        return mimageResourceId != NO_IMAGE_PROVIDED;
    }
}
