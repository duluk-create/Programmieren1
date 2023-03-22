public class Schachbrett {
    boolean[][] brett = new boolean[8][8];

    public void setzeTurm(int x, int y){
        for (int i = 0; i < brett.length; i++) {
            for (int j = 0; j < brett[i].length; j++) {
                if(x == j || y == i){
                    brett[i][j] = true;
                }else{
                    brett[i][j] = false;
                }
            }
        }
    }

    @Override
    public String toString(){
        String output = "";

        for (int i = 0; i < brett.length; i++) {
            for (int j = 0; j < brett[i].length; j++) {
                if(brett[i][j]) output = output + "x";
                else output = output + "o";
            }
            output = output + "\n";
        }

        return output;
    }
}
