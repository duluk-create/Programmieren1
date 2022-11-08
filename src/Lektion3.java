import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Lektion3 {
    //1
    public static void modulo(){
        System.out.println("Geben Sie eine Zahl ein");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if(x % 7 == 0)
            System.out.println("Die Zahl ist ganzzahlig durch 7 teilbar.");
        else
            System.out.println("Sie ist nicht ganzzahlig durch 7 teilbar.");
    }
    // -7/7 = -1 => kein Rest. Funktioniert.
//Ich lese nur einen Integer ein. Kommazahl führt zu einer InputMismatchException
    //2
    public static void pizzaRechner(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie den Durchmesser der 1. Pizza in cm an: ");
        int dEins = scanner.nextInt();
        System.out.println("Bitte geben Sie den Preis der 1. Pizza in € an: ");
        double preisEins = scanner.nextDouble();
        System.out.println("Bitte geben Sie den Durchmesser der 2. Pizza in cm an: ");
        int dZwei = scanner.nextInt();
        System.out.println("Bitte geben Sie den Preis der 2. Pizza in € an: ");
        double preisZwei = scanner.nextDouble();

        double flächeEins = Math.PI * Math.pow(dEins/2, 2);
        double flächeZwei = Math.PI * Math.pow(dZwei/2, 2);

        if(flächeEins/preisEins > flächeZwei/preisZwei)
            System.out.println("Die Pizza 1 hat das bessere Preisleistungsverhältnis");
        else
            System.out.println("Die Pizza 2 hat das bessere Preisleistungverhältnis");

    }

    public static void einzelZeichen() throws IOException {
        System.out.println("Gebe eine Ziffer ein: ");
        Scanner scanner = new Scanner(System.in);

        int counter = 0;

        String s = scanner.next();

        if(s.matches("[A-Z]")){
            System.out.println("Großbuchstabe");
            counter++;
        }
        if(s.matches("\\d") || s.matches("[a-f]") || s.matches("[A-F]")){
            System.out.println("Hezadezimale Ziffer");
            counter++;
        }
        if(s.matches("0|1")){
            System.out.println("Binäre Ziffer");
            counter++;
        }
        if(s.matches("[0-7]")){
            System.out.println("Oktale Ziffer");
            counter++;
        }
        if(counter == 0){
            System.out.println("Unbekannt");
        }
    }

    public static void würfelWurf(){
        Random random = new Random();

        int zahl = random.nextInt(6)+1;

        switch (zahl) {
            case 1 -> System.out.println("1 gewürfelt");
            case 2 -> System.out.println("2 gewürfelt");
            case 3 -> System.out.println("3 gewürfelt");
            case 4 -> System.out.println("4 gewürfelt");
            case 5 -> System.out.println("5 gewürfelt");
            case 6 -> System.out.println("6 gewürfelt");
        }
    }

    public static void matrikelNummer(String numm){

        if(numm.matches("((50)|(51)|(61))\\d{5}"))
            System.out.println("Es handelt sich um eine Matrikelnummer.");
        else
            System.out.println("Es handelt sich um keine Matrikelnummer.");

    }

    public static void schaltJahr(int jahr){

        String schaltjahr = "Es handelt sich um ein Schaltjahr";
        String keinSchaltjahr = "Es handelt sich um kein Schaltjahr";

        if(jahr%4 == 0){
            if(jahr%400 == 0){
                System.out.println(schaltjahr);
                return;
            }
            if(jahr%100 == 0){
                System.out.println(keinSchaltjahr);
                return;
            }
            System.out.println(schaltjahr);
        }
        else{
            System.out.println(keinSchaltjahr);
        }
    }




}
