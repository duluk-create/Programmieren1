public class Wortknoten {
    String wort;
    String bedeutung;
    Wortknoten left;
    Wortknoten right;

    public Wortknoten(String wort, String bedeutung){
        this.wort = wort;
        this.bedeutung = bedeutung;
    }

    public String getBedeutung() {
        return bedeutung;
    }

    public String getWort() {
        return wort;
    }
}
