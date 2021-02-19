import junit.framework.TestCase;
import org.junit.Assert;

import java.io.FileNotFoundException;

public class SwitchTest extends TestCase {

    public void testRead_and_Write() throws FileNotFoundException {
        Switch A = new Switch();
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

    public void testCreateClient() {
        Switch A = new Switch();
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
        Client B = A.CreateClient(BB);
        Assert.assertEquals(B, B1);
    }
}