import java.io.FileInputStream;
import java.io.IOException;

public class BeginningWithVowel {
    public static void main(String[] args) {
        int counter = 0;
        String[] words = readStr().split("\\s*(\\s|,|!|\\.)\\s*");
        for (int i = 0; i < words.length; i++){
            if (sortWord(words[i]) == true){
                System.out.println(words[i]);
                counter++;
            }
        }
        if (counter == 0){
            System.out.println("Слов, начинающихся с гласной буквы, не найдено");
        }
    }

    private static boolean sortWord(String words){
        //char[] vowels = {'а', 'о', 'и', 'е', 'ё', 'э', 'ы', 'у', 'ю', 'я'};
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char[] inPutWord = words.toCharArray();
        for (int i = 0; i < vowels.length; i++){
            if (vowels[i] == inPutWord[0]){
                return true;

            }
        }
        return false;
    }

    private static String readStr(){
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
