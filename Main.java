//java.lang - стандартные типы данных (double, long, string...)
//java.io - InputStream, OutputStream

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        ENUM_USAGE Main = new ENUM_USAGE();
        Scanner read = Main.Scan("D://acc.txt");
        Info A = Main.Read_and_Write(read);
        Client B = Main.Create(A);
        String a = "kkk";
        String b = "92342937329487";
        String c = "yes";
        String d = "HOLDING";
        Info BB = new Info();
        BB.name = a.toCharArray();
        BB.iss = c.toCharArray();
        BB.inn = b.toCharArray();
        BB.type = d.toCharArray();
        System.out.println(Arrays.equals(A.iss, BB.iss));
        System.out.println(Arrays.equals(A.inn, BB.inn));
        //System.out.println(A.type);
        //System.out.println(BB.type);
        System.out.println(Arrays.equals(A.type, BB.type));
        System.out.println(Arrays.equals(A.name, BB.name));
        //System.out.println(Arrays.equals(A.name, BB.name));
        //System.out.println(BB.type);
        //System.out.println(A.type);
        System.out.println(BB.equals(A));
        HOLDING B1 = new HOLDING(a.toCharArray(), b.toCharArray(), c.toCharArray());
        /*B.print();
        B1.print();*/
        /*System.out.println(B.hashCode());
        System.out.println(B1.hashCode());*/
        System.out.println(B1.equals(B));
    }
}
