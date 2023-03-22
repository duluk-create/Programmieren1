import java.util.Arrays;

public class MeineDreiAutos {
   public static Auto golf = new Auto("VW", 1, "schwarz", true, false);
   public static Auto manta = new Auto("Opel", 2, "rot", false, true);
   public static Auto kadett = new Auto("Opel", 1, "weiß", true, false);



    public MeineDreiAutos() {
        golf.marke = "VW";
        golf.farbe = "schwarz";
        golf.checkHeftGeflegt = true;
        golf.schaeden = false;
        golf.hubraum = 1;

        manta.marke = "Opel";
        manta.farbe = "rot";
        manta.checkHeftGeflegt = false;
        manta.schaeden = true;
        manta.hubraum = 2; //in Liter

        kadett.marke = "Opel";
        kadett.farbe = "weiß";
        kadett.checkHeftGeflegt = true;
        kadett.schaeden = false;
        kadett.hubraum = 1;

    }

    public static Auto getGolf(){
        return golf;
    }
    public static Auto getManta(){
        return manta;
    }
    public static Auto getKadett(){
        return kadett;
    }


}
