public class Student {
    public String vorname;
    public String nachname;
    public String gebDatum;
    public String matrikelnummer;

    public Student(String matrikelnummer, String vorname, String nachname, String gebDatum){
        this.matrikelnummer = matrikelnummer;
        this.vorname = vorname;
        this.nachname = nachname;
        this.gebDatum = gebDatum;
    }


    public String getNachname() {
        return nachname;
    }

    public String getVorname() {
        return vorname;
    }


    public String getMatrikelnummer() {
        return matrikelnummer;
    }
}
