public class Auto {
    String marke;
    int hubraum;
    String farbe;
    boolean checkHeftGeflegt;
    boolean schaeden;

    static  int produzierteAutos = 0;

    public Auto(String marke, int hubraum, String farbe, boolean checkHeftGeflegt, boolean schaeden){
        this.marke = marke;
        if(hubraum > 0)
        this.hubraum = hubraum;
        else
            this.hubraum = 1600;
        this.schaeden = schaeden;
        this.farbe = farbe;
        this.checkHeftGeflegt = checkHeftGeflegt;
        produzierteAutos++;
    }

    public void setHubraum(int ccm){
        if(ccm > 0)
            hubraum = ccm;
    }

    public void gebeWerteAus(){
        System.out.println("Marke: " + marke + ", Farbe: " + farbe +
                ", Hubraum: " + hubraum + ", Checkheftgepflegt: " + checkHeftGeflegt + ", Schäden: " + schaeden);
    }




}
