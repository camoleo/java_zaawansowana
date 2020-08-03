package com.camoleo.zad8;

public class ParcelValidator implements Validator {

    @Override
    public boolean validate(Parcel parcel) {

        boolean isSumOfLength = parcel.xLength + parcel.yLength + parcel.zLength < 300;

        return isSumOfLength;


    }
}
