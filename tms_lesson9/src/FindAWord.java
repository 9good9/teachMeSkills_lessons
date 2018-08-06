import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindAWord {
    public static void main(String[] args){


        for(Map.Entry<String, Integer> item : getMap().entrySet()) { //спросить как это устроено

            System.out.printf("Уникальное слово : %s  Кол-во повторений : %s \n", item.getKey(), item.getValue());
        }
    }

    private static Map<String, Integer> getMap() {
        int index = 1; // счетчик повторения каждого уникального слова
        String str = null;
        Map<String, Integer> myMap = new HashMap<String, Integer>(); // создание мапа
        try (FileReader reader = new FileReader("C:\\Users\\Usr_RF25.RF25U3EA\\Desktop\\test1.txt"))//открытие потока FileReader
        {
            Scanner in = new Scanner(reader); // чтение из потока
            while (in.hasNext()){         // проверка на наличие следующего слова
                str = in.next();        // считываение следующего слова
                str = uniqueWord(str);    // вызов метода для удаления спецсимволов
                //Почему не работает этот код?!(мой)
                /* if (myMap.put(str,index) != null){ // проверка на наличие повторения слова в мапе
                   // index = index + 1;
                    myMap.put(str, index);
                    //System.out.printf("Слово : " + str + " кол-во повторений : " + index);
                } else {
                    index = 1;
                    myMap.put(str, index);

                }*/
                Integer frequency = myMap.get(str);
                myMap.put(str, frequency == null ? 1 : frequency + 1);
            }
        }catch (IOException ex)  {
            System.out.println(ex.getMessage());
        }
        return myMap;
    }

    private static String uniqueWord(String word) {

        word = word.replaceAll("[^a-zA-Zа-яА-Я]", " "); // спросить как это устроено
        return word;
    }
}
