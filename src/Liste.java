public class Liste {

  Knoten start;
  Knoten temp;

    public Liste(){
        start = new Knoten(1);
        initListe();
    }

    public void einfuegen(int i){
        Knoten elem = new Knoten(i);
            Knoten temp = start;
            while(temp.next != null){

                temp = temp.next;
            }
            temp.next = elem;
    }

    public void initListe(){
        for (int i = 2; i < 50; i++) {
            einfuegen(i);
        }
    }

    public void entferneElement(int x){
        Knoten temp = start;
        Knoten oldtemp = start;
        int counter = 1;
        while (counter != x && temp != null){
            oldtemp = temp;
            temp = temp.next;
            counter++;
        }
        if(temp != null){
            oldtemp.next = temp.next;
        }
    }


    public Knoten findeElement(int x){
        Knoten temp = start;
        int counter = 1;
        while(counter < x){
            temp = temp.next;
            counter++;
        }
        return temp;
    }

    public void ziehung(){
        Knoten zahlen = null;

        for (int i = 0; i < 6; i++) {
            int index = (int) ((Math.random()*49)+1)-i;
            Knoten elem = findeElement(index);
            Knoten temp = zahlen;
            if(zahlen == null){
                zahlen = new Knoten(elem.zahl);
            }else {
                while (temp.next != null){
                    temp = temp.next;
                }
                temp.next = new Knoten(elem.zahl);
            }
              entferneElement(index);
        }

        for (int i = 0; i < 6; i++) {
            int min = 50;
            Knoten temp = zahlen;
            Knoten oldtemp = zahlen;
            while (temp != null){
                if(temp.zahl < min){
                    min = temp.zahl;
                }
                temp = temp.next;
            }
            temp = zahlen;
            while(temp.zahl != min){
                oldtemp = temp;
                temp = temp.next;
            }
            System.out.println(temp.zahl);
                oldtemp.next = temp.next;

        }


    }


}