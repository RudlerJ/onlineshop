package htl.swp2.OOP.onlineshop.onlineshop;

public class Main {
    public static void main(String[] args) {

        Kunde p1 = new Kunde();
        Kunde p2 = new Kunde();

        p1.setVorname("Hans");
        p1.setAnschrift("Himmelstraße 4 8644 AT");
        p1.setNachname("Hans");

        p2.setVorname("Dominik");
        p2.setAnschrift("Engengasse 3 6170 AT");
        p2.setNachname("Dimit");

        System.out.printf("%s %s wohnt in der %s\n", p1.getVorname(), p1.getNachname(), p1.getAnschrift());
        System.out.printf("%s %s wohnt in der %s\n", p2.getVorname(), p2.getNachname(), p2.getAnschrift());
    }
}
