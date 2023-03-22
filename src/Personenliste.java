public class Personenliste {
    Personenknoten start;


 public void einfuegen(Personenknoten person){
     if(start == null) start = person;
     else{
         if(person.alter < start.alter){
             Personenknoten temp = start;
             start = person;
             person.next = temp;
             temp.previous = start;

         }
         else{
             Personenknoten temp = start;
             Personenknoten oldtemp = start;

             while(temp != null){
                 if(person.alter < temp.alter){
                     oldtemp.next = person;
                     person.previous = oldtemp;
                     person.next = temp;
                     temp.previous = person;
                     return;
                 }
                 oldtemp = temp;
                 temp = temp.next;
             }
             oldtemp.next = person;
             person.previous = oldtemp;
         }
     }

 }



    public Personenknoten suche(String nachname){
        Personenknoten temp = start;

        while (temp.nachname != nachname && temp != null) {
            temp = temp.next;
        }
        return temp;
    }


}
