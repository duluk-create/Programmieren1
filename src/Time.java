import java.time.LocalTime;

public class Time {

    public static void actualTime(){
        int h = LocalTime.now().getHour();
        int m = LocalTime.now().getMinute() + h*60;
        int s = LocalTime.now().getSecond() + m*60;

        int sMax = 24*3600;

        double percent = Math.round((s*10000.0/sMax))/100.0;

        System.out.println("Es sind seit Mitternacht: " + s + " Sekunden vergangen.");
        System.out.println("Die verbleidenden Sekunden belaufen sich auf: " + (sMax-s) + " Sekunden");
        System.out.println("Es sind " + percent + "% vom Tag vergangen.");
    }



}
