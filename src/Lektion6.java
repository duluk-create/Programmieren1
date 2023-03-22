import java.util.Locale;
import java.util.Scanner;

public class Lektion6 {
    public static int runden(double x){
        return (int) (x + 0.5);
    }

    public static void rundenGenauer(double x, int stellen){
        double result = x;
        int groesse = 1;
        for (int i = 0; i < stellen; i++) {
            result *= 10;
            groesse *= 10;
        }
        int ganzeTeile = (int) result;
        if(result - ganzeTeile >= 0.5)
            result += 1;

        result = result / groesse;

        System.out.printf(Locale.ENGLISH, "%." + stellen +"f", result);
    }




    public static int fordereFak(){
        System.out.println("Bitte gebe eine ganze Zahl ein: ");
        Scanner scanner = new Scanner(System.in);
        int eingabe = scanner.nextInt();

        return berechneFak(eingabe);
    }

    public static int berechneFak(int eingabe) {
        for (int i = eingabe - 1; i > 1; i--) {
            eingabe *= i;
        }
        return eingabe;
    }


    public static void sternchenMuster(int zeilen){
        int platz = zeilen;
        for (int i = 1; i <= zeilen; i++) {
            for (int k = 0; k < platz; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            platz--;
            System.out.println();
        }
    }


    public static double potenz(double basis, int exponent){
        if(exponent == 0)
            return 1;
        return basis * potenz(basis, exponent - 1);
    }




}
