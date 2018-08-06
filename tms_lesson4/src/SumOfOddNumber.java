public class SumOfOddNumber {
    public static void main(String[] args) {

        System.out.println("The sum of odd numbers from 1 to 99");
        int sum = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
