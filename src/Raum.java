import java.util.Arrays;

public class Raum {
    private String name;

    private int aktuelleAnzahl = 0;

    public int anzahlStudierender;
    public boolean frei;

    public Student[] aktuelleStudenten;

    public Raum(String name, int anzahlStudierender, boolean frei){
        this.name = name;
        this.anzahlStudierender = anzahlStudierender;
        this.frei = frei;
        aktuelleStudenten = new Student[anzahlStudierender];
    }

    public void betreteRaum(Student student){
        for (int i = 0; i < aktuelleStudenten.length; i++) {
            if(aktuelleStudenten[aktuelleAnzahl] == null){
                aktuelleStudenten[aktuelleAnzahl] = student;
                aktuelleAnzahl++;
                return;
            }
        }

    }

    public void verlasseRaum(Student student){
        for (int i = 0; i < aktuelleStudenten.length; i++) {
            if(aktuelleStudenten[i] == student){
                aktuelleStudenten[i] = null;
                aktuelleAnzahl--;
                return;
            }

        }
    }

    public void gebeAusUndLeereRaum(){
        for (int i = 0; i < aktuelleStudenten.length; i++) {
            if(aktuelleStudenten[i] != null){
                System.out.println("Name: " +
                        aktuelleStudenten[i].getVorname()
                        + "  " + aktuelleStudenten[i].getNachname()
                        + "   Matrikelnummer: " + aktuelleStudenten[i].getMatrikelnummer());
            }
        }
        aktuelleStudenten = new Student[anzahlStudierender];
    }



    public String getName() {
        return name;
    }

    public int getAnzahlStudierender() {
        return anzahlStudierender;
    }

    public boolean isFrei() {
        return frei;
    }

    public void setFrei(boolean frei) {
        this.frei = frei;
    }


    public void setAnzahlStudierender(int anzahlStudierender) {
        this.anzahlStudierender = anzahlStudierender;
    }
}
