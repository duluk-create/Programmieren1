import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

public class hts {
    public static List<String> getLinesFromDocument(String fileName) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines;
    }

    public static void vergleiche(String eingabe) throws IOException {

        List<String> wordlist =  getLinesFromDocument("C:/Users/Dell/Downloads/wordlist/wordlist.txt");

        int counter = 0;

        String[] ver = eingabe.split("\n");
        for (int i = 0; i < ver.length; i++) {
            for (int j = 0; j < wordlist.size(); j++) {
                if(wordlist.get(j).length() == ver[i].length()){

                    for (int k = 0; k < wordlist.get(j).length(); k++) {
                        if(wordlist.get(j).contains(Character.toString(ver[i].charAt(k)))){
                            counter++;
                        }
                        if(ver[i].contains(Character.toString(wordlist.get(j).charAt(k)))){
                            counter++;
                        }
                    }
                    if(counter/2 == ver[i].length()){
                        System.out.print(wordlist.get(j) + ",");
                    }


                    counter = 0;
                }
            }
        }
    }


    public static String md5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            String hashtext = number.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static int evalCrossTotal(String input) {
        int total = 0;
        for (int i = 0; i < input.length(); i++) {
            total += Integer.parseInt("0x0" + input.charAt(i), 16);
        }
        return total;
    }



    public static String decryptString(String encryptedString, String password) {
        // Calculate the MD5 hash of the password and the cross total
        String passwordMD5 = md5(password);
        int md5Total = evalCrossTotal(passwordMD5);

        // Split the encrypted string into an array of integers
        String[] encryptedValues = encryptedString.split(" ");
        int[] intEncryptedValues = new int[encryptedValues.length];
        for (int i = 0; i < encryptedValues.length; i++) {
            intEncryptedValues[i] = Integer.parseInt(encryptedValues[i]);
        }

        // Initialize an empty string to store the decrypted characters
        String decryptedString = "";

        // Iterate through the encrypted values
        for (int i = 0; i < intEncryptedValues.length; i++) {
            // Calculate the decrypted character by reversing the encryption process
            char decryptedChar = (char)(intEncryptedValues[i] + md5Total - (int)passwordMD5.charAt(i % 32));
            decryptedString += decryptedChar;

            // Update the cross total for the next iteration
            md5Total = evalCrossTotal(md5(decryptedString.substring(0, i + 1)).substring(0, 16) + md5(String.valueOf(md5Total)).substring(0, 16));
        }

        return decryptedString;
    }

}
