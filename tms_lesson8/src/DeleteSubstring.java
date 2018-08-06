import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DeleteSubstring {
    public static void main(String[] args) {
        String sumStr = readStr();
        System.out.println("Строка в которой нужно вырезать подстроку " + "\n" + sumStr);
        System.out.println("Введите подстроку для удаления");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int index = str.length();
        int indexOf = sumStr.indexOf(str);
        String substr1 = sumStr.substring(0, indexOf);
        String substr2 = sumStr.substring(indexOf + index);
        String newString = substr1 + substr2;

        //System.out.println(newString);
        writeStr(newString);
    }

    private static void writeStr (String newString) {
        try(FileOutputStream fos=new FileOutputStream("C:\\Users\\Usr_RF25.RF25U3EA\\Desktop\\test1.txt"))
        {
            // перевод строки в байты
            byte[] buffer = newString.getBytes();

            fos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        System.out.println("Строка перезаписана в файл");
    }


    private static String readStr() {
        String sumStr = "";
        try(FileInputStream fin = new FileInputStream("C:\\Users\\Usr_RF25.RF25U3EA\\Desktop\\test1.txt")) {
            byte[] buffer = new byte[fin.available()];
            // считаем файл в буфер
            fin.read(buffer, 0, fin.available());

            sumStr = new String(buffer);

        }
        catch(IOException ex) {

            System.out.println(ex.getMessage());
        }

        return sumStr;
    }
}
