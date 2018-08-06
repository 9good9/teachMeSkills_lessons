import java.util.Scanner;

public class NumberN {
    public static void main(String[] args) {

        int size = inPutNumber();
        int[] arr = new int[size];
        int evenNum = 0;

        System.out.println("Array of random number: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomNumbers(size);
            System.out.print(arr[i] + " ");
            if (arr[i] % 2 == 0 && arr[i] != 0) {
                evenNum++;
            }
        }

        System.out.println("\n" + "Array of even number: ");
        if (evenNum != 0) {
            int[] arrOfEvenNum = new int[evenNum];
            int k = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0 && arr[i] != 0) {
                    arrOfEvenNum[k] = arr[i];
                    System.out.print(arrOfEvenNum[k] + " ");
                    k++;
                }
            }

        } else if (evenNum == 0) {
            System.out.println("There are no even numbers in the array");
        }

    }

    public static int inPutNumber(){
        System.out.println("Enter a number that is greater than 3 ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        do {
            if (number < 3){
                System.out.print("You entered the wrong number, repeat the input, the number must be more than three!");
                number = in.nextInt();
            } else {
                break;
            }
        }while(true);
        //int number = 5;
        return number;
    }

    public static int randomNumbers(int size){
        int randomNum = (int) ( Math.random() * (size + 1) );
        return  randomNum;
    }
}
