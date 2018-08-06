import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class InputOutputStringToFile {
    public static void main(String[] args) {
        writeStack(getStack()); // вызов метода записи файла и вложенный вызов чтения файла и создания стека

    }

    private static void writeStack (Stack<String> myStackList) {

        try (FileWriter writer = new FileWriter("C:\\Users\\Usr_RF25.RF25U3EA\\Desktop\\тест1.txt" )){ //создание файла и потока записи
            while(myStackList.empty() == false) { // проверка на пустоту стека

                writer.write(myStackList.pop() + "\r\n"); // построчная запись в файл с переходом на новую строку

            }

        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }

    }

    private static Stack<String> getStack() {
        String str = null;
        Stack<String> myStackList = new Stack<String>(); // создание стека
        try (FileReader reader = new FileReader("C:\\Users\\Usr_RF25.RF25U3EA\\Desktop\\тест.txt"))//открытие потока FileReader
        {
            Scanner in = new Scanner(reader); // чтение из потока
            while (in.hasNextLine()){         // проверка на наличие следующей строки
                str = in.nextLine();          // считываение следующей строки
                myStackList.push(str);         // заполнение стека
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        return myStackList;
    }

}
