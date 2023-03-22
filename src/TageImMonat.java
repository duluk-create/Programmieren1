import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class TageImMonat
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean korrekt = false;
        while(!korrekt)
        try{
            System.out.println(tageImMonat(scanner.nextLine()));
            korrekt = true;
        }catch (RuntimeException r){
            System.out.println("Bitte gebe einen gültigen Monat an");
        }
    }

    public static int tageImMonat(String monat)
    {
        int tage = switch(monat)
                {
                    case "Februar" -> 28;
                    case "April", "Juni", "September", "November" -> 30;
                    case "Januar", "März", "Mai", "Juli", "August", "Oktober",
                            "Dezember" -> 31;
                    default -> throw new RuntimeException("falscher Monatsname");
                };
        return tage;
    }
}