package MonthOfTheYear;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        int numOfMonth = inputNum();

        do {

            if (numOfMonth > 12 || numOfMonth < 1) {

                System.out.println("You entered an invalid number! ");
                numOfMonth = inputNum();

            } else {

                System.out.println("The month is " + monthOfTheYear.getMonth(numOfMonth));
                break;
            }
        } while (true);


    }
    private static int inputNum () {

        System.out.println("Enter the number of month");
        Scanner in = new Scanner (System.in);
        int num = in.nextInt();
        return num;
    }
}
