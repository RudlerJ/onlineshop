package htl.swp2.OOP.onlineshop.onlineshop;

public class Adresse {
    private String Hausnummer;
    private String PLZ;
    private String Stadt;
    private String Strasse;

    public Adresse (String Hausnummer, String PLZ, String Stadt, String Strasse) {
        this.Hausnummer = Hausnummer;
        this.PLZ = PLZ;
        this.Stadt = Stadt;
        this.Strasse = Strasse;
    }

    public void getVollstaendigeAdressen() {
        this.Hausnummer = Hausnummer;
        this.PLZ = PLZ;
        this.Stadt = Stadt;
        this.Strasse = Strasse;

    }
}
