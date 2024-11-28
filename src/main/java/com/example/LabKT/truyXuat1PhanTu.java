package com.example.LabKT;

public class truyXuat1PhanTu {
    public int truyXuat1PhanTu(int[] arr, int index) {
        if (arr == null || index < 0 || index >= arr.length) {
            throw new IndexOutOfBoundsException("Invalid array or index");
        }
        return arr[index];
    }
}
