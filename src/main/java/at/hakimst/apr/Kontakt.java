package at.hakimst.apr;

public class Kontakt {
    private String vorname;
    private String nachname;
    private String email;
    private String telefonnummer;

    public Kontakt(String vorname, String nachname, String email, String telefonnummer) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.email = email;
        this.telefonnummer = telefonnummer;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    @Override
    public String toString() {
        return vorname + " " + nachname +  "," + email + " " + telefonnummer;
    }
}
