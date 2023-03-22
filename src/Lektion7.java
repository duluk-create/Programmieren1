import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lektion7 {

    public static void sinusBerechnung(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gebe eine Zahl für den sinus ein:");
        double x = scanner.nextDouble();
        double summand = 1.0;
        double zaehler = x;
        double nenner = 1;
        double summe = x;
        for (int i = 2; summand > 1E-15 || summand < -1E-15; i += 2) {
            zaehler *= (-1) * x * x;
            nenner *= i * (i + 1);
            summand = zaehler / nenner;
            summe += summand;
        }
        System.out.println(summe);
    }

    public static void arithmetischeOperationen(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Anzahl der einzulesenden Werte:");
        int anzahl = scanner.nextInt();
        if(anzahl < 1){
            System.out.println("Fehler gebe mindestens einen Wert ein");
            return;
        }
        double[] arr = new double[anzahl];

        for (int i = 0; i < anzahl; i++) {
            System.out.println(i + 1 + ". Wert:");
            arr[i] = scanner.nextDouble();
        }

        System.out.println("Kleinster Wert: " +  Arrays.stream(arr).min().getAsDouble());
        System.out.println("Groesster Wert: " + Arrays.stream(arr).max().getAsDouble());
        System.out.println("Arithmetischer Mittelwert: " + (Arrays.stream(arr).sum()/anzahl));
    }


    public static void bSprachenSpiel(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gebe eine Zeichenfolge ein:");
        String eingabe = scanner.nextLine();

        char[] listeEingabe = eingabe.toCharArray();
        String[] bearbeitung = new String[eingabe.length()];

        String[] vokale = {"a", "e", "i", "o", "u"};
        for (int i = 0; i < bearbeitung.length; i++) {
            if(Arrays.asList(vokale).contains(String.valueOf(listeEingabe[i]))){
                //Befehl in Prog1 nicht erlaubt mach es mit switch und einer Schleife und erhöhe deinen Index
                bearbeitung[i] = listeEingabe[i]+"b"+listeEingabe[i];
            }
            else
                bearbeitung[i] = String.valueOf(listeEingabe[i]);
        }

        String output = "";
        for (String s : bearbeitung) {
            output = output + s;
        }
        //String iwas = Arrays.stream(bearbeitung).collect(Collectors.joining(""));
        //ArrayList ausgabe = new ArrayList(Arrays.asList(bearbeitung));

        System.out.println(output);

    }

    public static void euroStueck(){
        Random zufall = new Random();

        int durchlaeufe = 10000;
        double anzahlGefundenerMünzen = 0.0;

        for (int i = 0; i < durchlaeufe;) {

            int halbeWahrscheinlichkeit = zufall.nextInt(2);
            int zufaelligeSchublade = zufall.nextInt(3)+1;

            if(zufaelligeSchublade != 1 && zufaelligeSchublade != 2){
                if(halbeWahrscheinlichkeit == 1){
                    anzahlGefundenerMünzen++;
                }
                i++;
            }
        }

        System.out.println("Die Wahrscheinlichkeit einer gefundenen Münze beträgt " + anzahlGefundenerMünzen/durchlaeufe * 100.0 + " %.");
    }

    public static void lottoZiehung(){
        ArrayList lottoZahlen = new ArrayList();
        int richtigeStellen = 0;
        Random random = new Random();

        while(lottoZahlen.size() != 6) {
            int zufall = random.nextInt(50);
            if(!lottoZahlen.contains(zufall))
                lottoZahlen.add(zufall);
        }

        while(richtigeStellen != 6){
            int min = Integer.MAX_VALUE;
            for (int i = richtigeStellen; i < 6; i++) {
                if((int) lottoZahlen.get(i) < min)
                    min = (int) lottoZahlen.get(i);
            }
            lottoZahlen.set(lottoZahlen.indexOf(min), lottoZahlen.get(richtigeStellen));
            lottoZahlen.set(richtigeStellen, min);

            richtigeStellen++;
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(lottoZahlen.get(i) + " ");
        }


    }


    public static void bSprachenSpiel2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gebe einen Satz ein:");
        int counter = 0;
        String eingabe = scanner.nextLine();
        char[] vokale = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        char[] eingabeBearb = eingabe.toCharArray();
        String[] ausgabe = new String[eingabeBearb.length];

        for (int i = 0; i < eingabeBearb.length; i++) {
            for(int j = 0; j < vokale.length; j++){
                if(vokale[j] == eingabeBearb[i]){
                    ausgabe[i] = vokale[j] + "b" + vokale[j];
                    counter++;
                }
            }
            if(counter == 0)
                ausgabe[i] = "" + eingabeBearb[i];
            counter = 0;
        }

        for (int k = 0; k < ausgabe.length; k++) {
            System.out.print(ausgabe[k]);
        }
        System.out.println();

    }



}
