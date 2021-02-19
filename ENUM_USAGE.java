import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.util.Scanner;

import static java.sql.Types.NULL;

public class ENUM_USAGE {
    public Scanner Scan(String pathname) throws FileNotFoundException {
        return new Scanner(new File(pathname));
    }

    public Info Read_and_Write (Scanner read) {
        Info info = new Info();
        char[] dat; // variable for the reader
        while (read.hasNextLine()){
            String data = read.nextLine(); //reading
            dat = data.toCharArray();
            data = data.substring(0, data.indexOf(":"));
            Fields fields = Fields.valueOf(data);
            fields.write(dat, info);
            /*if (data.contains("name")){
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
            }*/

        }
        read.close();
        return info;
    }

    Client Create (Info info) {
        String typ = new String(info.type);
        ClientType A = ClientType.valueOf(typ);
        return A.create(info);
    }

}
