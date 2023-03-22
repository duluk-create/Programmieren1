public class Polonaise {

    Roboter start;

    public Polonaise(){
        start = null;
    }

    public void anhaengen(Roboter roboter){
        if(start == null){
            start = roboter;
            return;
        }
        if(roboter.groesse < start.groesse){
            Roboter speicher = start;
            start = roboter;
            start.next = speicher;
            return;
        }
        Roboter temp = start;
        Roboter oldtemp = start;

        while(temp != null){
            if(roboter.groesse < temp.groesse){
                oldtemp.next = roboter;
                roboter.next = temp;
                return;
            }
            oldtemp = temp;
            temp = temp.next;
        }
        oldtemp.next = roboter;
    }

    public void vorstellen(){
        Roboter temp = start;
        while(temp != null){
            System.out.println(temp.toString());
            temp = temp.next;
        }
    }

}
