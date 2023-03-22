public class Uhr {
    int std;
    int min;
    int sek;

    public Uhr(int std, int min, int sek){

        if(
                std >= 0 && std < 24
                && min >= 0 && min < 60
                && sek >= 0 && sek < 60
        ){
            this.std = std;
            this.min = min;
            this.sek = sek;
        }
        else{
            this.std = 12;
            this.min = 00;
            this.sek = 00;
        }
    }


    public int getMin() {
        return min;
    }

    public int getSek() {
        return sek;
    }

    public int getStd() {
        return std;
    }
    public void setUhr(int std, int min, int sek){
        if(
                std >= 0 && std < 24
                        && min >= 0 && min < 60
                        && sek >= 0 && sek < 60
        ){
            new Uhr(std, min, sek);
        }
        else{
            System.out.println("Leider haben Sie eine ungültige Uhrzeit eingegeben");
        }
    }
    public void naechsteSek(){
        sek++;
        if(sek >= 60)
            sek = 0;
            min++;
        if(min >= 60)
            min = 0;
            std++;
        if(std > 23)
            std = 00;
    }
}