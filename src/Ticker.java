import java.util.Arrays;

public class Ticker {
    private char[] nachricht;

    public Ticker(int groesse) {
        // Wenn der Wert für die Größe ungültig ist, wird standardmäßig ein Nachrichtenpuffer
        // der Größe 200 Zeichen erzeugt.
        if (groesse <= 0) {
            groesse = 200;
        }

        nachricht = new char[groesse];

        // Der Nachrichtenpuffer wird mit Leerzeichen gefüllt.
        for (int i = 0; i < groesse; i++) {
            nachricht[i] = ' ';
        }
    }

    public int getGroesse() {
        return nachricht.length;
    }

    public void setNachricht(char[] nachricht) {
        int laenge = Math.min(nachricht.length, this.nachricht.length);
        for (int i = 0; i < laenge; i++) {
            this.nachricht[i] = nachricht[i];
        }

        // Fülle den nicht benötigten Speicherplatz mit dem Pluszeichen (+) auf.
        for (int i = laenge; i < this.nachricht.length; i++) {
            this.nachricht[i] = '+';
        }
    }

    public char[] getNachricht() {
        // Gib eine Kopie des kompletten Nachrichtenpufferinhalts zurück.
        return Arrays.copyOf(nachricht, nachricht.length);
    }

    public void resetNachricht(char zeichen) {
        // Überschreibe den kompletten Inhalt des Nachrichtenpuffers mit dem Zeichen zeichen.
        Arrays.fill(nachricht, zeichen);
    }

    public void resetNachricht() {
        resetNachricht('+');
    }

    public void rotateNachricht(int distance) {
        // Mache nichts, wenn distance ungültig ist.
        if (distance <= 0 || distance >= nachricht.length) {
            return;
        }

        // Rotiere den Nachrichtenpuffer nach links.
        char[] temp = Arrays.copyOfRange(nachricht, distance, nachricht.length);
        System.arraycopy(nachricht, 0, nachricht, nachricht.length - distance, distance);
        System.arraycopy(temp, 0, nachricht, 0, temp.length);
    }
}