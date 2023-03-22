import java.util.Scanner;

public class Kurs {
    String kursart;
    int kursdauer;
    Mitglied[] mitglieder;

    public Kurs(String kursart, int kursdauer, int maxMitglieder) {
        this.kursart = kursart;
        this.kursdauer = kursdauer;
        mitglieder = new Mitglied[maxMitglieder];
    }

    public void anmeldungKurs(Mitglied mitglied) {
        for (int i = 0; i < mitglieder.length; i++) {
            if (mitglied.aktuellerKurs != null) {
                System.out.println("Leider haben Sie schon einen Kurs belegt");
                return;
            }

            if (mitglieder[i].mitgliedsnummer == mitglied.mitgliedsnummer) {
                System.out.println("Mitglied ist bereits vorhanden");
                return;
            }
            if (mitglieder[i] == null) {
                mitglieder[i] = mitglied;
                return;
            }
        }
        System.out.println("Kurs ist bereits voll!");
    }

    public void abmeldungKurs(int mitgliedsnummer) {
        for (int i = 0; i < mitglieder.length; i++) {
            if (mitglieder[i].mitgliedsnummer == mitgliedsnummer) {
                mitglieder[i] = null;
                return;
            }
        }
        System.out.println("Mitglied wurde nicht gefunden");
    }

    public static int f(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n > 1) return f(n-1) + f(n-2);
        return 0;
    }


    public static void main(String[] args) {
        System.out.println(f(100));
    }
}


