import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DeletingAndReplacingSubstrings {
    public static void main(String[] args) {
        getStr();
    }

    public static void getStr (){
        try{
            FileInputStream fstream = new FileInputStream("C:\\Users\\Usr_RF25.RF25U3EA\\Desktop\\тест.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while ((strLine = br.readLine()) != null){
                //System.out.println(strLine);
                System.out.println(changeStr(strLine) + "\n");

            }
        }catch (IOException e){
            System.out.println("Ошибка");
        }
    }

    private static String changeStr (String strLine){

        System.out.println("Строка в которой нужно вырезать подстроку " + "\n" + strLine);
        System.out.println("Введите подстроку которую хотите заменить : ");
        String str = inPutStr();
        int index = str.length();
        System.out.print("\n");
        System.out.println("Введите подстроку на которую хотите заменить : ");
        String newStr = inPutStr();
        System.out.print("\n");
        int indexOf = strLine.indexOf(str);
        StringBuilder stringBuilder = new StringBuilder(strLine);
        stringBuilder.replace(indexOf, indexOf + index, newStr);
        return stringBuilder.toString();

    }

    private static String inPutStr (){
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        if (string == null | string.trim().length()==0){
            System.out.println("Вы ввели пустую строку, пожалуйста повторите ввод.");
            inPutStr();
        }
        return string;
    }
}
