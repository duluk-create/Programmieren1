public class Sitzplatzreservierung {
    char[][] saal;

    public char[][] erstelleSaal(int anzahlReihen){
        char[][] saal = new char[anzahlReihen][];
        int plaetze = 3;
        for (int i = 0; i < saal.length; i++) {
            saal[i] = new char[plaetze+i];
        }
        return saal;
    }

    public void fuelleSitze(){
        for (int i = 0; i < saal.length; i++) {
            for (int j = 0; j < saal[i].length; j++) {
                if(Math.random()*2 < 1){
                    saal[i][j] = 'x';
                }else saal[i][j] = 'o';
            }
        }
    }

    public void bucheSitz(int reihe, int platz){
        if(saal[reihe][platz] == 'o'){
            saal[reihe][platz] = 'x';
        }
        else{
            System.out.println("Platz bereits belegt");
        }
    }

    public void saalAusgabe(){
        for (int i = 0; i < saal.length; i++) {
            for (int j = 0; j < saal[i].length; j++) {
                System.out.print(saal[i][j]);
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        Sitzplatzreservierung barbarossa = new Sitzplatzreservierung();
        barbarossa.saal = barbarossa.erstelleSaal(7);
        barbarossa.fuelleSitze();
        barbarossa.bucheSitz(2, 1);
        barbarossa.saalAusgabe();
    }
}
