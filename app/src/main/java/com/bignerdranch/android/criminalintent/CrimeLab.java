package com.bignerdranch.android.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Paul Barker on 4/9/2016.
 */
public class CrimeLab {

    private static CrimeLab sCrimeLab;
    private List<Crime> mCrimes;

    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context) {
        mCrimes = new ArrayList<>();

    }
    public List<Crime> getCrimes(){
        return mCrimes;
    }

    public Crime getCrime(UUID id) {
        for (Crime crime : mCrimes){
            return crime;
        }
        return null;
    }
}
