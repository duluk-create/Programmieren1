import java.util.Scanner;

public class Lektion4 {

    public static void testePrimzahl(int x){
        boolean prim = true;

        for (int i = 2; i <= Math.sqrt(x); i++) {
            if(x % i == 0){
                prim = false;
                break;
            }
        }
        if(prim)
            System.out.println(x +" ist eine Primzahl");
        else
            System.out.println( x + " ist keine Primzahl");
    }

    public static void querprodukt(){
        Scanner scanner = new Scanner(System.in);
        boolean gueltig = false;
        int eingabe = 0;
        while(!gueltig){
            System.out.println("Geben Sie bitte eine Zahl ein: ");
            eingabe = scanner.nextInt();
            if(eingabe >= 1 && eingabe <= 1000000)
                gueltig = true;
            else
                System.out.println("FEHLER Zahl ist ungültig");
        }
        int querprodukt = 1;
        int output = eingabe;
        while(eingabe > 0){
            querprodukt *= (eingabe % 10);
            eingabe = eingabe / 10;
        }
        System.out.println("Das Querprodukt der Zahl " + output + " beträgt " + querprodukt);
    }

    public static void kleinesEinmalEins(){
        for(int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }

    public static double potenz(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Basis (double) ein: ");
        double b = scanner.nextDouble();
        System.out.println("Bitte geben Sie einen Exponenten (int) ein: ");
        int n = scanner.nextInt();

        double result = 1;

        if(n > 0){
            for (int i = n; i > 0; i--) {
                result *= b;
            }
        }
        if(n == 1){
            result = 1;
        }
        if(n < 0){
            for (int i = n; i > 0 ; i--) {
                result *= 1/b;
            }
        }
        return result;
    }
}
