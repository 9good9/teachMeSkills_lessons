import java.util.ArrayDeque;
import java.util.InputMismatchException;
import java.util.Queue;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        Queue<Integer> myQueue = getQueue();
        System.out.println("Перевернутое число :");
        while (myQueue.peek() != null){
            System.out.print(myQueue.poll());
        }
        System.out.println("\n" + "Программа закончена");
    }

    private static Queue<Integer> getQueue(){
        Queue<Integer> myQueue = new ArrayDeque<Integer>();
        int number = getNumber();
        if (number < 0){
            number *= -1;
        }
        for (; number > 0; number /= 10){
            int newNumber = number % 10;
            myQueue.add(newNumber);

        }
        return myQueue;
    }

    private static int getNumber (){
        int number = 0;
        try {
            System.out.println("Пожалуйста, введите целое число : ");
            Scanner in = new Scanner(System.in);
            number = in.nextInt();

        } catch (InputMismatchException e){

            System.out.println("Неверный формат данных, введите число снова");
            getNumber();
        }
        return number;
    }
}
