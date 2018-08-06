public class ArrOfEvenNumber {
    public static void main(String[] args) {
        int[] arrOfNum = new int[10];
        int j = 2;

        for (int i = 0; i < arrOfNum.length; i++) {
            arrOfNum[i] = j;
            j += 2;
        }

        printInString(arrOfNum);
        printInColumn(arrOfNum);
    }

    public static void printInString(int[] arrOfNum) {
        for (int i = 0; i < arrOfNum.length; i++) {
            System.out.print(arrOfNum[i] + " ");
        }
        System.out.print("\n");
    }

    public static void printInColumn(int[] arrOfNum) {
        for (int i = 1; i < arrOfNum.length; i++) {
            System.out.println(arrOfNum[i]);
        }
    }
}
