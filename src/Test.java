import java.util.Random;

public class Test {

    public static String ersetze(String eingabe){
        char[] c = eingabe.toCharArray();

        for(int i= 0; i<eingabe.length(); i++){
            if(c.length-1 - i > 3 && c[i] == '.')
                c[i] = '_';
        }


        return String.valueOf(c);
        /*
        Oder mit einer Schleife
        for (int i= 0; i<c.length; i++) {
            System.out.print(c[i]);
        }
         */
    }

}
