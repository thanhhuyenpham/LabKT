import com.example.LabKT.tinhTich;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TinhTich2So {
    tinhTich tinhTich2SoService = new tinhTich();
    @Test
    public void testcase1(){
        assertEquals(0,tinhTich2SoService.tinhTich2So("3","1"));
    }
    @Test
    public void testcase2(){
        assertEquals(2,tinhTich2SoService.tinhTich2So("1","2"));
    }
    @Test
    public void testcase3(){ assertEquals(3,tinhTich2SoService.tinhTich2So("1","3")); }
    @Test
    public void testcase4(){
        assertEquals(9,tinhTich2SoService.tinhTich2So("1","9"));
    }
    @Test
    public void testcase5(){
        assertEquals(12,tinhTich2SoService.tinhTich2So("1","10"));
    }
    @Test
    public void testcase6(){
        assertEquals(11,tinhTich2SoService.tinhTich2So("1","11"));
    }
    @Test
    public void testcase7(){
        assertEquals(-10,tinhTich2SoService.tinhTich2So("2","-5"));
    }
    @Test
    public void testcase8(){
        assertEquals(100,tinhTich2SoService.tinhTich2So("5","20"));
    }
    @Test
    public void testcase9DoanLoi(){ assertThrows(NumberFormatException.class, () -> {
            tinhTich2SoService.tinhTich2So(".5","10");
        });
    }
    @Test
    public void testcase10DoanLoi(){ assertThrows(NumberFormatException.class, () -> {
            tinhTich2SoService.tinhTich2So("1d","30a");
        });
    }
}
