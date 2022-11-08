import java.util.Locale;
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









}
