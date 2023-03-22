import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.net.URL;
import java.util.Scanner;

public class Lektion8 {
    public static void galgenMaennchen(){

        String[] woerterAuswahl = {
                "JAVA", "PROGRAMMIERSPRACHE", "DEBUGGEN", "KLASSE", "OBJEKT", "APPLIKATION" ,"HACKERANGRIFF",
                "MULTITHREADING", "PYTHON", "IDE", "ZUSE", "SCHLEIFE", "LISTE", "FRAMEWORK", "VERERBUNG",
                "METHODE", "PACKAGES", "EXTENSIONS", "LIBRARIES", "ATTRIBUT"
        };

        String zufaelligesWort = woerterAuswahl[(int) (Math.random()* woerterAuswahl.length)];

        char[] wort = zufaelligesWort.toCharArray();

        char[] gefundeneStellen = new char[wort.length];

        //Schleife zum gefundeStellen beschreiben
        for (int k = 0; k < gefundeneStellen.length; k++) {
            gefundeneStellen[k] = '_';
        }

        int counter = 0;

        System.out.println(1 + ". Versuch:" + zufaelligesWort.replaceAll("\\w", "_"));

        Scanner scanner = new Scanner(System.in);

        for (int i = 2; i < 16 && counter < gefundeneStellen.length; i++) {
            String eingabe = scanner.nextLine().toUpperCase();
            if(eingabe.equals(zufaelligesWort)){
                System.out.println("Herzlichen Glückwunsch du hast es erraten");
                return;
            }
            if(Arrays.toString(wort).contains(eingabe)){
                for (int j = 0; j < wort.length; j++) {
                    if(eingabe.equals(Character.toString(wort[j]))){
                        gefundeneStellen[j] = wort[j];
                        counter++;
                    }
                }
            }
            System.out.print(i + ". Versuch:");
            for (int j = 0; j < gefundeneStellen.length; j++) {
                System.out.print(gefundeneStellen[j]);
            }
            System.out.println();
            if(counter == gefundeneStellen.length){
                System.out.println("Du hast das Wort richtig erraten");
                return;
            }
        }
        System.out.println("Du hast leider verloren");
    }

    public static void einfacherRechner(String[] zahlenUop){
        String operator = zahlenUop[zahlenUop.length-1];

        int ergebnis = Integer.parseInt(zahlenUop[0]);

        for (int i = 1; i < zahlenUop.length-1; i++) {
            if(operator.equals("+"))
                ergebnis += Integer.parseInt(zahlenUop[i]);
            else
                ergebnis -= Integer.parseInt(zahlenUop[i]);
        }

        System.out.println(ergebnis);
    }


    public static void saveImageFromURL() throws IOException
    {
        String seite = "<body id=\"www-wikipedia-org\">"
                + "<div class=\"central-textlogo\">"
                + "<img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb"
                + "/b/bb/Wikipedia_wordmark.svg/174px-Wikipedia_wordmark.svg.png\">"
                + "</div>"
                + "</body>";


        //Finde die Zeichenfolge src und .png
        int src = 0;
        int png = 0;

        char[] seiteBearbeitung = seite.toCharArray();

        for (int i = 0; i < seiteBearbeitung.length-3; i++) {
            if(seiteBearbeitung[i] == 's' && seiteBearbeitung[i+1] == 'r' && seiteBearbeitung[i+2] == 'c')
                src = i+5; //src=" entspricht 5 Zeichen

            if(seiteBearbeitung[i] == 'p' && seiteBearbeitung[i+1] == 'n' && seiteBearbeitung[i+2] == 'g')
                png = i+3; //png entspricht 3 Zeichen
        }


        String downloadUrl = seite.substring(src, png);
        System.out.println(downloadUrl);
                URL url = new URL(downloadUrl);
        BufferedImage image = ImageIO.read(url);
        ImageIO.write(image, "png", new File("bild.png"));
    }

    public static Auto getAutoMaxHubraum(){
        MeineDreiAutos autos = new MeineDreiAutos();
        Auto golf = MeineDreiAutos.getGolf();
        Auto kadett = MeineDreiAutos.getKadett();
        Auto manta = MeineDreiAutos.getManta();

        if(golf.hubraum > manta.hubraum && golf.hubraum > kadett.hubraum)
            return golf;
        if(kadett.hubraum > golf.hubraum && kadett.hubraum > manta.hubraum)
            return kadett;

        return manta;
    }


    public static void gebeCoolstesAutoAus(){

        Auto bestesAuto = getAutoMaxHubraum();

        System.out.println("Marke: " + bestesAuto.marke + "  Farbe: " + bestesAuto.farbe + "  Checkheftgepflegt: "
                + bestesAuto.checkHeftGeflegt + "  Schäden: " + bestesAuto.schaeden
                + "  Hubraum: " + bestesAuto.hubraum
        );
    }
}
