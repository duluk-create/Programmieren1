import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.channels.ReadableByteChannel;


public class Main {

    public static int ersetze(char[] datei) {

        int zaehler = 0;
        for (int i = 0; i < datei.length; i++) {
            if (datei[i] == '.')
                zaehler++;
        }
        return zaehler - 1;
    }

    public static int[] flatten(int[][] array) {
        int laengeArr = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            laengeArr += array[i].length;
        }

        int[] output = new int[laengeArr];

        for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    output[count] = array[i][j];
                    count++;
                }
            }
        return output;
    }

    public static void baumEinfuegen(Baum baum, Wortknoten eintrag){
        baum.insert(eintrag);
        baum.print();
    }

    public static void baumSuchen(Baum baum, String wort){
        System.out.println(baum.search(wort));
    }


   public static int[] sortiereAbsteigend(int[] feld){
        int[] ausgabe = new int[feld.length];
        int groessterWert = 0;
        boolean passt = true;
        int k = 0;

        while(ausgabe.length != k){
            for (int i = 0; i < feld.length; i++) {
                if(groessterWert < feld[i]){
                    for (int j = 0; j < ausgabe.length; j++) {
                        if(feld[i] == ausgabe[j]){
                            passt = false;
                        }
                    }
                }else{
                    passt = false;
                }
                if(passt){
                    groessterWert = feld[i];
                }
                passt = true;
            }

            ausgabe[k] = groessterWert;
            groessterWert = 0;
            k++;
        }
        return ausgabe;
   }

   public static int zaehleGrossbuchstaben(String text){
        int counter = 0;
        char[] eingabe = text.toCharArray();
       for (int i = 0; i < eingabe.length; i++) {
           if (eingabe[i] >= 65 && eingabe[i] <= 90){
               counter++;
           }
       }
       return counter;
   }

   public static boolean feldEnthalten(int[] array, int[] feld){
        int[] indizes = new int[feld.length];
       for (int i = 0; i < feld.length; i++) {
           for (int j = 0; j < array.length; j++) {
               if(array[j] == feld[i]){
                   indizes[i] = j;
               }
           }

       }

       for (int i = 0; i < indizes.length-1; i++) {
           if(!(indizes[i] < indizes[i+1])){
               return false;
           }
       }
       return true;
   }


   public int[][] berechneMatrix(int x, int y, double sparsity){

        int nullen = 0;
        int elemente =0;
        int[][] matrix = new int[x][y];

       for (int i = 0; i < x; i++) {
           for (int j = 0; j < y; j++) {
               if(Math.random() * 2 < 1){
                   matrix[i][j] = 1;
                   elemente++;
               }else {
                   if((nullen*1.0/elemente)*100 > sparsity){
                       matrix[i][j] = 1;
                       elemente++;
                   }
                   else{
                       matrix[i][j] = 0;
                       nullen++;
                       elemente++;
                   }
               }

           }

       }
        return matrix;
   }

   public int meineEndrekursiveMethode(int x){
        return rekursiveMetode(x, x);
   }

    private int rekursiveMetode(int x, int y) {
        if(y == 0) return x;
        else{
            return rekursiveMetode(x+y, y-1);
        }
    }


    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.meineEndrekursiveMethode(10));

    }



}



