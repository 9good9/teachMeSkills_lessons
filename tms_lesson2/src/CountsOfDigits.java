import java.util.Scanner;

public class CountsOfDigits {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please, input a number ");
        int number = in.nextInt();
        int count = getCountsOfDigits(number);

        if (number < 0) {
            System.out.println(getTypeOfWord(count) + " negative number");
        } else {
            System.out.println(getTypeOfWord(count) + " positive number");
        }

    }
    public static int getCountsOfDigits(int number) {
        int count = (number == 0) ? 1 : 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
    public static String getTypeOfWord(int count) {
        String[] word = {"single-valued", "two-digit", "three-digit", "four-digit", "five-digit", "six-digit", "seven-digit",
                "eight-digit", "nine-digit", "ten-digit"};
        return word[count - 1];
    }
}
