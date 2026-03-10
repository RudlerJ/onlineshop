package htl.swp2.OOP.onlineshop.onlineshop;

public class Main {
    public static void main(String[] args) {

        Adresse a1 = new Adresse("6522 ",  "Prutz ", "mühle ", "6a ");
        Adresse a2 = new Adresse("6020 ", "Inssbruck ", "Anichstraße ", "26 ");
        Adresse a3 = new Adresse("6170 ", "Zirl ", "Sonnenweg ", "14 ");

        Kunde k1 = new Kunde("Jonathan", "Rudler", a1);
        Kunde k2 = new Kunde("Peter", "Müller", a2);
        Kunde k3 = new Kunde("Claudia", "Huber", a1);


        k1.kundeProfilAnzeigen();

        Kunde k4 = new Kunde ("Simon", "Schober");
        k4.setAnschrift(a3);
        k4.kundeProfilAnzeigen();

   /*     Kunde p1 = new Kunde();
        Kunde p2 = new Kunde();

        p1.setVorname("Hans");
        p1.setAnschrift("Himmelstraße 4 8644 AT");
        p1.setNachname("Hans");

        p2.setVorname("Dominik");
        p2.setAnschrift("Engengasse 3 6170 AT");
        p2.setNachname("Dimit");

        System.out.printf("%s %s wohnt in der %s\n", p1.getVorname(), p1.getNachname(), p1.getAnschrift());
        System.out.printf("%s %s wohnt in der %s\n", p2.getVorname(), p2.getNachname(), p2.getAnschrift());

    */
    }
}
