//structure for containing client data (possible to add various fields)

import java.util.Arrays;

public class Info {
    char[] name = new char[100];
    char[] inn = new char[100];
    char[] iss = new char[100];
    char[] type = new char[100];

    @Override
    public boolean equals (Object BB) {
        Info B = (Info) BB;
        return (this.type == B.type) && (this.inn == B.inn) && (this.iss == B.iss) && (this.name == B.name);
    }

    @Override
    public int hashCode () {
        return 31;
    }

    //adding new fields here for different counter-agents
}