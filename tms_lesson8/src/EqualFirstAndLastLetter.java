import java.io.FileInputStream;
import java.io.IOException;

public class EqualFirstAndLastLetter {
    public static void main(String[] args) {

        String[] words = readStr().split("\\s*(\\s|,|!|\\.)\\s*");
        for (int i = 0; i < words.length; i++){

            String word1 = words[i].toLowerCase();
            if ((i + 2) > words.length) {
                System.out.println("And of Array");
                break;
            } else {
                String word2 = words[i + 1].toLowerCase();

                char[] wordsArray = word1.toCharArray();
                char[] wordArray1 = word2.toCharArray();
                if (wordsArray[wordsArray.length - 1] == wordArray1[0]) {
                    System.out.print(words[i] + " - " + words[i + 1] + "\n");

                }
            }
        }

    }

    private static String readStr() {
        String sumStr = "";
        try(FileInputStream fin = new FileInputStream("C:\\Users\\Usr_RF25.RF25U3EA\\Desktop\\test1.txt")) {
            byte[] buffer = new byte[fin.available()];
            // считаем файл в буфер
            fin.read(buffer, 0, fin.available());

            sumStr = new String(buffer );

        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        return sumStr;
    }
}
