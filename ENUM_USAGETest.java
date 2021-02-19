import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class ENUM_USAGETest {

    @Test
    public void read_and_Write() throws FileNotFoundException {
        ENUM_USAGE A = new ENUM_USAGE();
        Info act = A.Read_and_Write(A.Scan("D://acc.txt"));
        String a = "kkk";
        String b = "92342937329487";
        String c = "yes";
        Info exp = new Info();
        exp.name = a.toCharArray();
        exp.iss = c.toCharArray();
        exp.inn = b.toCharArray();
        Assert.assertEquals(exp, act);
    }

    @Test
    public void create() {
        ENUM_USAGE A = new ENUM_USAGE();
        String a = "kkk";
        String b = "92342937329487";
        String c = "yes";
        String d = "HOLDING";
        Info BB = new Info();
        BB.name = a.toCharArray();
        BB.iss = c.toCharArray();
        BB.inn = b.toCharArray();
        BB.type = d.toCharArray();
        HOLDING B1 = new HOLDING(a.toCharArray(), b.toCharArray(), c.toCharArray());
        Client B = A.Create(BB);
        Assert.assertEquals(B1, B);
    }
}