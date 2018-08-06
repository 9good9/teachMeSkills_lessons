import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class PeopleInTheCircle {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<>(getArrayList()); // копирование полученого листа в новый лист
        Iterator<Integer> iter = myArrayList.iterator();  // создание итератора для перебора листа
        //int index = 0;

        for (int j = 0; j < myArrayList.size(); j++) {  // цикл перебора листа
            printArrayList(myArrayList);
            int index = 0;  // индекс по которому удаляются элементы в листе
            while(iter.hasNext()){   // проверка на наличие следующего элемента в листе
                if ((index + 1) < myArrayList.size()) {  // проверка на то, что индекс не выходит за пределы листа
                    index++;
                    myArrayList.remove(index); // удаление элемента листа по индексу
                }
                else if (myArrayList.size() == 2){
                    printArrayList(myArrayList);
                    myArrayList.remove(1);

                }else{
                    break;
                }
            }
            /*for (int i = 0; i < myArrayList.size(); i +=2) { // старый код, который никак не хотел работать)))
                //System.out.print(" Позиция с которой происходит удаление " + i + "\n");
                myArrayList.remove(index);
                index++;

            }*/
        }
        printArrayList(myArrayList);
    }

    private static void printArrayList(ArrayList myArrayList) {
        for(int i = 0; i < myArrayList.size(); i++){
            System.out.print(myArrayList.get(i) + " ");
        }
        System.out.print("\n");
    }

    private static ArrayList getArrayList () {

        ArrayList<Integer> myArrayList = new ArrayList<>();
        int sizeofArrayList = getNumber();             // получение размера листа
        /*for (int i = 0; i < sizeofArrayList; i++){ // заполнение листа числами
            myArrayList.add( i + 1 );
        }*/
        for (int i = sizeofArrayList; i > 0; i--) { //реверсивное заполнение листа числами

            myArrayList.add(i );
        }

        return myArrayList;
    }

    private static int getNumber (){
        int number = 0;
        try {

            System.out.println("Пожалуйста, введите целое число : ");
            Scanner in = new Scanner(System.in);
            number = in.nextInt();

        } catch (InputMismatchException e) {

            System.out.println("Неверный формат данных, введите число снова");
            getNumber();
        }
        return number;
    }
}
