package com.example.LabKT;

public class timPhanTuBeNhatTrongMang {
    public int timSoBeNhatMang(int[] mang){
        if (mang == null || mang.length == 0) {
            throw new NullPointerException("Array is empty or null");
        }
        int min = mang[0];
        for (int a : mang) {
            if(a < min){
                min = a;
            }
        }
        return min;
    }
}
