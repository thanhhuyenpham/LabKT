package com.example.LabKT;

import java.util.ArrayList;
import java.util.List;

public class TruyXuatMaNhanVienTuHoSo {
    public String truyXuatMaNhanVien(String maNhanVien){
        List<staff> listHoSo= new ArrayList<>();
        listHoSo.add(new staff("PH1","Sale"));
        listHoSo.add(new staff("PH2","Sale"));
        listHoSo.add(new staff("PH3","Sale"));
        listHoSo.add(new staff("PH4","Sale"));
        listHoSo.add(new staff("PH5","Sale"));
        listHoSo.add(new staff("PH6","Sale"));
        listHoSo.add(new staff("PH7","Sale"));
        listHoSo.add(new staff("PH8","Sale"));

        for (staff a :listHoSo) {
            if(a.getMaNV().equalsIgnoreCase(maNhanVien)){
                return a.getMaNV();
            }
        }
        throw new NullPointerException();
    }
}
