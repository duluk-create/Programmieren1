import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class MathProg {

    public static void pqFormula(double p, double q){
        double discr = Math.pow(p/2, 2) - q;
        if (discr < 0)
            throw (new ArithmeticException("Negative Wurzel hat kein reelles Ergebnis!"));
        else{
            double xa = -p/2 + Math.sqrt(discr);
            double xb = -p/2 - Math.sqrt(discr);

            System.out.println("x1 beträgt " + Math.round(xa) + " und x2 beträgt " + Math.round(xb));
        }

    }

    public static void circleShpere(double r){
        double circleArea = Math.PI * Math.pow(r, 2);
        double circleScope = 2*Math.PI*r;
        double volumeSphere = (4.0/3.0) * Math.PI * Math.pow(r, 3);

        System.out.println("Die Fläche des Kreises beträgt: " + Math.round(circleArea) + "\n" + "Der Umfang des Kreises beträgt: " + Math.round(circleScope) +"\n" + "Das Volumen der Kugel beträgt: " + Math.round(volumeSphere));
        System.out.printf("Die Fläche des Kreises beträgt: %.2f", circleArea);
    }




}
