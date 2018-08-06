public class ArrOfOddNumber {
    public static void main(String[] args) {
        int[] arrOfOddNum = new int[50];
        int j = 1;

        for (int i = 0; i < arrOfOddNum.length; i++) {
            arrOfOddNum[i] = j;
            j = j + 2;
            System.out.print(arrOfOddNum[i] + " ");
        }
        System.out.print("\n");

        for (int i = arrOfOddNum.length - 1; i >= 0; i--)  {
            System.out.print(arrOfOddNum[i] + " ");
        }
    }
}
