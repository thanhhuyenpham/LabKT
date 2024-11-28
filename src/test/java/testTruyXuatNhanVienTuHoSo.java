import com.example.LabKT.TruyXuatMaNhanVienTuHoSo;
import com.example.LabKT.truyXuat1PhanTu;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class testTruyXuatNhanVienTuHoSo {
   TruyXuatMaNhanVienTuHoSo truyXuatMaNhanVienTuMotPhongBan = new TruyXuatMaNhanVienTuHoSo();

    @Test
    public void testCase1(){
        assertEquals("PH1",truyXuatMaNhanVienTuMotPhongBan.truyXuatMaNhanVien("PH1"));
    }

    @Test
    public void testCase2(){
        assertEquals("PH2",truyXuatMaNhanVienTuMotPhongBan.truyXuatMaNhanVien("PH2"));
    }

    @Test
    public void testCase3(){
        assertEquals("PH3",truyXuatMaNhanVienTuMotPhongBan.truyXuatMaNhanVien("PH3"));
    }

    @Test
    public void testCaseChuaTaoMaNhanVien(){
        assertThrows(NullPointerException.class,() -> {truyXuatMaNhanVienTuMotPhongBan.truyXuatMaNhanVien("PH44");});
    }

    @Test
    public void testCaseDumg5(){
        assertEquals("PH5",truyXuatMaNhanVienTuMotPhongBan.truyXuatMaNhanVien("PH4"));
    }

    @Test
    public void testCaseDumg6(){
        assertEquals("PH4",truyXuatMaNhanVienTuMotPhongBan.truyXuatMaNhanVien("PH4"));
    }

    @Test
    public void testCaseDumg7(){
        assertEquals("PH5",truyXuatMaNhanVienTuMotPhongBan.truyXuatMaNhanVien("PH5"));
    }

    @Test
    public void testCaseDumg8(){
        assertEquals("PH6",truyXuatMaNhanVienTuMotPhongBan.truyXuatMaNhanVien("PH6"));
    }

    @Test
    public void testCaseDumg9(){
        assertEquals("PH7",truyXuatMaNhanVienTuMotPhongBan.truyXuatMaNhanVien("PH7"));
    }

    @Test
    public void testCaseDumg10(){
        assertEquals("PH8",truyXuatMaNhanVienTuMotPhongBan.truyXuatMaNhanVien("PH8"));
    }
}
