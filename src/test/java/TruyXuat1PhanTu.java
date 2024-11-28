import com.example.LabKT.truyXuat1PhanTu;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TruyXuat1PhanTu {
    truyXuat1PhanTu truyXuat1PhanTuService  = new truyXuat1PhanTu();

    @Test
    public void testcaseNhapVaoIndexKHopLe() {
        int[] mang = {1, 2, 3, 4, 5, 6, 7, 8};
        assertThrows(IndexOutOfBoundsException.class, () -> {
            truyXuat1PhanTuService.truyXuat1PhanTu(mang, 123);
        });

    }

    @Test
    public void testcaseNhapVaoIndexKHopLe2() {
        int[] mang = {1, 2, 3, 4, 5, 6, 7, 8};
        assertThrows(IndexOutOfBoundsException.class, () -> {
            truyXuat1PhanTuService.truyXuat1PhanTu(mang, -6);
        });

    }
}
