import java.util.Scanner;

public class First_program {
    public static void main(String[] args) {
        String name;
        name = "Michail";
        System.out.println("Hello, " + name + " !");

        System.out.println("Please, input your name");
        Scanner in = new Scanner(System.in);
        name = in.next();
        System.out.println("Hello, " + name + " !");

        int a,b,c;
        System.out.println("Please, input integer number 'a' ");
        a = in.nextInt();
        System.out.println("Please, input integer number 'b' ");
        b = in.nextInt();

        c = b - a;
        System.out.println("sub c = " + c); //  subtraction - вычитание

        c = 0;
        c = a + b;
        System.out.println("sum c = " + c);   //  sum - сумма

        c = 0;
        c = a * b;
        System.out.println("mult c = " + c);  // multiplication - умножение

        c = 0;
        c = a / b;
        System.out.println("div c = " + c);  // division - деление

        if (a > 0){
            System.out.println("The integer number 'a' is a positive number");
        } else {
            System.out.println("The integer number 'a' is a negative number");
        }



    }
}
