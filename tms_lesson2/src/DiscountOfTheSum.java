import java.util.Scanner;

public class DiscountOfTheSum {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter the sum of buy ");
        double sumOfBuy = in.nextInt();

        double sumOfDiscount = 0;
        if (sumOfBuy < 500) {

            System.out.println("The sum of buy will remain the same");

        } else if (sumOfBuy >= 500 && sumOfBuy < 1000) {

            sumOfDiscount = sumOfBuy * 0.03;
            sumOfBuy -= sumOfDiscount;
            System.out.println("The sum of buy with discount (3%) is  " + sumOfBuy);

        } else if (sumOfBuy >= 1000) {

            sumOfDiscount = sumOfBuy * 0.05;
            sumOfBuy -= sumOfDiscount;
            System.out.println("The sum of buy with discount (5%) is  " + sumOfBuy);
        }
    }
}

