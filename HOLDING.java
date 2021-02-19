import java.util.Arrays;

public class HOLDING implements Client {
    char[] name;
    char[] inn;
    char[] isSanctioned;

    /*public HOLDING () {

    }*/

    public HOLDING(char[] name, char[] inn, char[] isSanctioned) {
        this.name = name;
        this.inn = inn;
        this.isSanctioned = isSanctioned;
    }

    private void edit (char[] name, char[] inn, char[] isSanctioned) {
        this.name = name;
        this.inn = inn;
        this.isSanctioned = isSanctioned;
    }

    public void print() {
        String name = new String(this.name);
        String inn = new String(this.inn);
        String iss = new String(this.isSanctioned);
        System.out.println("Name: " + name);
        System.out.println("INN: " + inn);
        System.out.println("Sanctioned: " + iss);
    }
}