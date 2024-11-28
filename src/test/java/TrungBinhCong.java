import com.example.LabKT.trungBinhCong;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TrungBinhCong {
    trungBinhCong trungBinhCongService = new trungBinhCong();

    @Test
    public void testcaseMangRong(){
        double[] mang = {};
        assertThrows(ArithmeticException.class, () -> {
            trungBinhCongService.trungBinhCong(mang);
        });
    }

    @Test
    public void testcaseMangNull(){
        double[] mang= null;
        assertThrows(ArithmeticException.class,() -> {
            trungBinhCongService.trungBinhCong(mang);});
    }

    @Test
    public void testcase2(){
        double[] mang= {1,2,3,0};
        assertEquals(1.5,trungBinhCongService.trungBinhCong(mang));
    }

    @Test
    public void testcase3(){
        double[] mang= {1,2,3};
        assertEquals(2,trungBinhCongService.trungBinhCong(mang));
    }

    @Test
    public void testcase4(){
        double[] mang= {1,2,3,2};
        assertEquals(2,trungBinhCongService.trungBinhCong(mang));
    }

    @Test
    public void testcase5(){
        double[] mang= {1,2,3,2,2};
        assertEquals(2,trungBinhCongService.trungBinhCong(mang));
    }

    @Test
    public void testcase6(){
        double[] mang= {1,2,3,2,2,8};
        assertEquals(3,trungBinhCongService.trungBinhCong(mang));
    }

    @Test
    public void testcase7(){
        double[] mang= {1};
        assertEquals(1,trungBinhCongService.trungBinhCong(mang));
    }

    @Test
    public void testcase8(){
        double[] mang= {1,3};
        assertEquals(2,trungBinhCongService.trungBinhCong(mang));
    }

    @Test
    public void testcase9(){
        double[] mang= {1,3,5,6,0};
        assertEquals(1,trungBinhCongService.trungBinhCong(mang));
    }

    @Test
    public void testcase10(){
        double[] mang= {1,3,2};
        assertEquals(2,trungBinhCongService.trungBinhCong(mang));
    }
}
