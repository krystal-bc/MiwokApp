package com.example.android.miwok;


/**
 * Created by Admin on 2/27/2017.
 *
 * {@link} represents a vocabulary word that the user wants to learn.
 *It contains a default translation and a Miwok translation for that word.
 *
 */

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceID = NO_IMAGE;

    private static final int NO_IMAGE = -1;

    public Word (String defaultTranslation, String miwokTranslation){
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    public Word (String defaultTranslation, String miwokTranslation, int imageResourceID){
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceID = imageResourceID;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResourceID(){ return mImageResourceID; }

    public boolean hasImage(){
        return mImageResourceID != NO_IMAGE;
    }

}
