package htl.swp2.OOP.onlineshop.onlineshop;

public class Kunde {
    private String vorname;
    private Adresse anschrift;
    private String nachname;


    public Kunde(String vorname, String nachname, Adresse anschrift) {
        this.vorname = vorname;
        this.anschrift = anschrift;
        this.nachname = nachname;
    }

    public Kunde(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public void kundeProfilAnzeigen() {
        System.out.println("Kundendaten:");
        System.out.println("------------");
        System.out.printf("Vorname: %s\n", vorname);
        System.out.printf("Nachname: %s\n", nachname);
        System.out.printf("Adresse: %s\n", anschrift);
    }
    public void setAnschrift(Adresse anschrift) {
        this.anschrift = anschrift;
    }
}
