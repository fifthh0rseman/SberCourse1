public class LEGAL_ENTITY implements Client {
    char[] name;
    char[] inn;
    char[] isSanctioned;

    public LEGAL_ENTITY(char[] name, char[] inn, char[] isSanctioned) {
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
