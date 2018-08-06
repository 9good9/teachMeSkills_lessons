import java.util.Scanner;

public class DigitsOfNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter a three-digit number ");
        int number = in.nextInt();
        int count = getCountsOfDigits(number);

        do {
            if (count != 3) {

                System.out.println("Error, you entered an invalid number. Please enter a three-digit number ");
                number = in.nextInt();
                count = getCountsOfDigits(number);

            } else {

                SumOrProductOfNumbers(number);
                break;
            }
        } while (true);


    }

    static void SumOrProductOfNumbers(int number) {

        if (number % 2 == 0) {

            int sum = 0;

            while (number != 0) {

                sum += (number % 10);
                number /= 10;
            }
            System.out.println("The sum of digits = " + sum);
        } else {

            int product = 1;

            while (number != 0) {
                product *= (number % 10);
                number /= 10;
            }
            System.out.println("The multiplication of digits = " + product);
        }
    }

    static int getCountsOfDigits ( int number){

        int count = (number == 0) ? 1 : 0;

        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;

    }
}
