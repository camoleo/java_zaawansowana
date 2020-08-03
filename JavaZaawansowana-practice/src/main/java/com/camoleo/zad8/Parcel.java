package com.camoleo.zad8;

public class Parcel {

    final int xLength;
    final int yLength;
    final int zLength;
    final float weight;
    final boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }
}
