public class Personenknoten {
    int alter;
    String nachname;
    Personenknoten next;
    Personenknoten previous;

    public Personenknoten(int alter, String nachname){
        this.alter = alter;
        this.nachname = nachname;
    }

}
