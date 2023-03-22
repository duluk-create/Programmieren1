public class Roboter {

    String name;
    int groesse;
    Roboter next;

    public Roboter(String name, int groesse){
        this.name = name;
        this.groesse = groesse;
    }

    public String toString(){
        return "Hallo ich bin " + name + ", ich bin " + groesse + " Zentimeter groß";
    }


    public String getName() {
        return name;
    }

    public int getGroesse() {
        return groesse;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroesse(int groesse) {
        this.groesse = groesse;
    }

    public Roboter getNext() {
        return next;
    }

    public void setNext(Roboter next) {
        this.next = next;
    }


}
