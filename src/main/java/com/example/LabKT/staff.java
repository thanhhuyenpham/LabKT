package com.example.LabKT;

public class staff {
    private String maNV;
    private String  nhiemVu;

    public staff(String maNV, String nhiemVu) {
        this.maNV = maNV;
        this.nhiemVu = nhiemVu;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getNhiemVu() {
        return nhiemVu;
    }

    public void setNhiemVu(String nhiemVu) {
        this.nhiemVu = nhiemVu;
    }

    public staff() {
    }
}
