import java.awt.*;
import java.io.FileReader;

public class Lektion11 {

    public static double[] zeilenMaxima(double[][] matrix){
        double[] output = new double[matrix.length];
        double maxWert = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(maxWert < matrix[i][j])
                    maxWert = matrix[i][j];
            }
            output[i] = maxWert;
            maxWert=0;
        }

        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
        return output;
    }


    public static void init3DTicTacToe(){
        boolean[][][] tictactoe = new boolean[3][3][3];

        for (int i = 0; i < tictactoe.length; i++) {
            for (int j = 0; j < tictactoe[i].length; j++) {
                for (int k = 0; k < tictactoe[j].length; k++) {
                    if((int) (Math.random()*2) == 1)
                        tictactoe[i][j][k] = true;
                    else
                        tictactoe[i][j][k] = false;
                }
            }
        }

        for (int i = 0; i < tictactoe.length; i++) {
            for (int j = 0; j < tictactoe[i].length; j++) {
                for (int k = 0; k < tictactoe[j].length; k++) {
                    if(tictactoe[i][j][k])
                        System.out.print("X");
                    else
                        System.out.print("O");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
        }
    }

    public static int betrag(int x){
        return (x < 0) ? x * (-1) : x;
    }
    public static float betrag(float x){
        return (x <  0) ? (x * (-1)) : x;
    }
    public static double betrag(double x){
        return (x <  0) ? (x * (-1)) : x;
    }
    public static short betrag(short x){
        return (x <  0) ? (short) (x * (-1)) : x;
    }
    public static long betrag(long x){
        return (x < 0) ? (x * (-1)) : x;
    }




    public static int zaehleZeichen(char[][] text){
        int counter = 0;
        for (int i = 0; i < text.length; i++) {
            for (int j = 0; j < text[i].length; j++) {
                if(text[i][j] != ' ')
                    counter++;
            }
        }
        return counter;
    }

    public static boolean tauscheZeilen(char[][] text, int x, int y){
        if(x > text.length-1 || y > text.length-1){
            return false;
        }
        else{
            char[] speicher = text[x];
            text[x] = text[y];
            text[y] = speicher;
            return true;
        }

    }

    public static char[][] fuegeEinTextdokument(char[][] text, int x, char[][] dokument){
        char[][] ausgabe = new char[text.length+dokument.length][];
        try{
            for (int i = 0; i < ausgabe.length; i++) {
                if(i < x-1){
                    ausgabe[i] = text[i];
                }
                else {
                    if (i < dokument.length)
                        ausgabe[i] = dokument[i - x];
                    else
                        ausgabe[i] = text[i - (x + dokument.length)];
                }
            }
        }catch (RuntimeException r){
            System.out.println("Ungültige Zeilenposition");
        }
        return ausgabe;
    }




}
