import java.util.*;

public class Fahrstrecke {
    List<Zielort> fahrstecke;
    public Fahrstrecke(){
        fahrstecke = new ArrayList<Zielort>();
    }

    public void einfuegen(Zielort ort){
        fahrstecke.add(ort);
    }

    private int gesamtStrecke() {
        int output = 0;
        for (int i = 0; i < fahrstecke.size(); i++) {
            output += fahrstecke.get(i).getDistanz();
        }
        return output;
    }

    public static void main(String[] args) {
        Fahrstrecke wueNue = new Fahrstrecke();

        wueNue.einfuegen(new Zielort("Würzburg", 0, "Kitzingen"));
        wueNue.einfuegen(new Zielort("Kitzingen", 19, "Neustadt"));
        wueNue.einfuegen(new Zielort("Neustadt", 42, "Nürnberg"));
        wueNue.einfuegen(new Zielort("Nürnberg", 49, " "));

        int gesamtStrecke = wueNue.gesamtStrecke();
        System.out.println("Die Gesamtstrecke von Würzburg nach Nürnberg beträgt: " + gesamtStrecke + " km.");
    }


}
