import static java.sql.Types.NULL;

enum Fields {
    name {
        void write (char[] dat, Info info) {
            System.arraycopy(dat, 6, info.name, 0, dat.length - 6);
            String temp = new String(info.name);
            info.name = temp.substring(0, temp.indexOf(NULL)).toCharArray();
        }
    },
    inn {
        void write (char[] dat, Info info) {
            System.arraycopy(dat, 5, info.inn, 0, dat.length - 5);
            String temp = new String(info.inn);
            info.inn = temp.substring(0, temp.indexOf(NULL)).toCharArray();
        }
    },
    clientType {
        void write (char[] dat, Info info) {
            System.arraycopy(dat, 12, info.type, 0, dat.length - 12);
            String temp = new String(info.type);
            info.type = temp.substring(0, temp.indexOf(NULL)).toCharArray();
            //System.out.println(info.type[50]);
            //System.out.println(info.name[50]);
            //System.out.println(info.inn[50]);

        }
    },
    isSanctioned {
        void write (char[] dat, Info info) {
            System.arraycopy(dat, 14, info.iss, 0, dat.length - 14);
            String temp = new String(info.iss);
            info.iss = temp.substring(0, temp.indexOf(NULL)).toCharArray();
            //System.out.println(info.iss[50]);
        }
    };

    abstract void write (char[] dat, Info info);
}
