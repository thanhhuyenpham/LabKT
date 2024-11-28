import com.example.LabKT.tinhThuong;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TinhThuong2So {
    tinhThuong tinhThuong2SoService = new tinhThuong();

    @Test
    public void testcase1ChiaCho0() {
        assertThrows(ArithmeticException.class, () -> {
            tinhThuong2SoService.tinhThuong(2,0);
        });
    }

    @Test
    public void testcase2() {
        assertEquals(2, tinhThuong2SoService.tinhThuong(4,2));
    }

    @Test
    public void testcase3() {
        assertEquals(-1, tinhThuong2SoService.tinhThuong(-9,9));
    }

    @Test
    public void testcase4() {
        assertEquals(4, tinhThuong2SoService.tinhThuong(4,1));
    }

    @Test
    public void testcase5() {
        assertEquals(2, tinhThuong2SoService.tinhThuong(20,10));
    }

    @Test
    public void testcase6() {
        assertEquals(0.3333333333333333, tinhThuong2SoService.tinhThuong(1,3));
    }

    @Test
    public void testcase7() {
        assertEquals(-1, tinhThuong2SoService.tinhThuong(2,-2));
    }

    @Test
    public void testcase8() {
        assertEquals(1.5, tinhThuong2SoService.tinhThuong(3,2));
    }

    @Test
    public void testcase9() {
        assertEquals(0.2, tinhThuong2SoService.tinhThuong(5,25));
    }

    @Test
    public void testcase10() {
        assertEquals(0, tinhThuong2SoService.tinhThuong(25,10));
    }
}
