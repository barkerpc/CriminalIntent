package com.bignerdranch.android.criminalintent;

import java.util.UUID;

/**
 * Created by Paul Barker on 3/5/2016.
 */
public class Crime {

    private UUID mId;
    private String mTitle;

    public Crime() {
        // Generate unique ID
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
