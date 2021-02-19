import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.sql.Types.NULL;

public class Switch {
    public Scanner Scan(String pathname) throws FileNotFoundException {
        return new Scanner(new File(pathname));
    }

    public Info Read_and_Write (Scanner read) {
        char[] dat; // variable for the reader
        Info info = new Info();
        while (read.hasNextLine()){
            String data = read.nextLine(); //reading
            dat = data.toCharArray();
            if (data.contains("name")){
                System.arraycopy(dat, 6, info.name, 0, dat.length - 6);
                //System.out.println(name);
            }

            if (data.contains("inn")){
                System.arraycopy(dat, 5, info.inn, 0, dat.length - 5);
                //System.out.println(inn);
            }

            if (data.contains("clientType")){
                System.arraycopy(dat, 12, info.type, 0, dat.length - 12);
                //System.out.println(type);
            }

            if (data.contains("isSanctioned")){
                System.arraycopy(dat, 14, info.iss, 0, dat.length - 14);
                //System.out.println(iss);
            }

        }
        read.close();
        /*String typ = new String(info.type);
        typ = typ.substring(0, typ.indexOf(NULL));*/
        return info;
    }

    public Client CreateClient (Info info) {
        String typ = new String(info.type);
        typ = typ.substring(0, typ.indexOf(NULL));
        Client A;
        switch (typ) {
            case "LEGAL_ENTITY":
                A = new LEGAL_ENTITY(info.name, info.inn, info.iss);
            case "INDIVIDUAL":
                A = new INDIVIDUAL(info.name, info.inn, info.iss);
            case "HOLDING":
                A = new HOLDING(info.name, info.inn, info.iss);
                //holding.print();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + typ);
        }
        return A;
    }


}
