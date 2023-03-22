import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Lektion5 {


    public static void reihenWert(){
        double glied = 0;
        double summe = 0;
        int i = 0;
        do{
            i++;
            glied =  6* 1/Math.pow(i, 2);
            summe += glied;
            System.out.println(i + ". Aktueller Reihenwert = " +summe);
        }while(glied > 10E-5);
        /*
        a)
        1/1+1/4+1/9+1/16+1/25

        c)
       Wenn der Faktor 6 in der Reihe steht 245 Durchgänge und Wert: 9.845164516347676
       Wenn er vor der Summe steht 100 Durchgänge und Wert: 9.809903401109354
         */
    }

    public static double potenz(){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Bitte geben Sie eine Basis (double) an: ");
        double b = scanner.nextDouble();
        System.out.println("Bitte geben Sie einen Exponenten (int) an: ");
        int n = scanner.nextInt();
        double ergebnis = 1;
        if(n > 0){
            while(n > 0){
                ergebnis *= b;
                n--;
            }
        }
        if(n < 0){
            while(n < 0){
                ergebnis *= 1/b;
                n++;
            }
        }
        return ergebnis;
    }

    public static double quadratWurzel(){
        System.out.println("Bitte gebe eine Zahl ein:");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();

        double schaetzwert = 1;
        double speicher = 1;

        for (int i = 0; i < 1000000000; i++) {
            if(Math.abs(schaetzwert*schaetzwert - x) < 1E-3){
                return schaetzwert;
            }

            schaetzwert = x / speicher;
            speicher = (speicher + schaetzwert)/2;
        }
        return 0;
    }

    public static double piAnnaeherung(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie die Anzahl der Rechtecke ein: ");
        int x = scanner.nextInt();
        double rechteckBreite = 1.0/x;
        double summeBreiten = 1.0/x;
        double zwischenErgebnis = 1.0;
        double pi = 0;

        for (int i = x; i > 0; i--) {
            pi += zwischenErgebnis * rechteckBreite;
            zwischenErgebnis = Math.sqrt(1 - Math.pow(summeBreiten, 2));
            summeBreiten += 1.0/x;
        }
        return 4.0 * pi;
    }

    public static void test(){

        String normalName = "Giraffe";
        StringBuilder sb = new StringBuilder(normalName);
          String name = "";

        Random zufall = new Random();


        while(!sb.isEmpty()) {
            int index = zufall.nextInt(sb.length());

            name = name + sb.substring(index, index+1);
           sb.deleteCharAt(index);
        };
        System.out.println(name);
    }

}
