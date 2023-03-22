public class Zielort {
    public String name;
    public int distanz;
    public String next;

    public Zielort(String name, int distanz, String next){
        this.name = name;
        this.distanz = distanz;
        this.next = next;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDistanz(int distanz) {
        this.distanz = distanz;
    }

    public int getDistanz() {
        return distanz;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Ortsname " + name + " Distanz: " + distanz + " kmq";
    }



}
