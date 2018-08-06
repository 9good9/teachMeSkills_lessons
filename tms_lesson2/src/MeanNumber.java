import java.util.Scanner;

public class MeanNumber {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please, input number 1 ");
        int num1 = in.nextInt();

        System.out.println("Please, input number 2 ");
        int num2 = in.nextInt();

        System.out.println("Please, input number 3 ");
        int num3 = in.nextInt();

        int middleNum = 0;
        if (num1 == num2 || num1 == num3 || num2 == num3) {

            System.out.println("Error");

        } else if (num1 > num2 && num1 < num3) {

            middleNum = num1;

        } else if (num2 > num1 && num2 < num3) {

            middleNum = num2;

        } else if (num3 > num1 && num3 < num2) {

            middleNum = num3;
        }
        System.out.println("Mean of the entered numbers: " + middleNum);

    }
}