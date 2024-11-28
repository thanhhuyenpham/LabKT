package com.example.LabKT;

public class tinhThuong {
    public double tinhThuong(int a, int b) {
        if(b == 0) {
            throw new ArithmeticException("chia cho 0");
        } else {
            return (double) a / b;
        }
    }
}
