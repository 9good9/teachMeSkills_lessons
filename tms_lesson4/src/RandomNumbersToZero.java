public class RandomNumbersToZero {
    public static void main(String[] args) {

        int[] arrOfRandomNum = new int[20];
        for (int i = 0; i < arrOfRandomNum.length; i++){
            arrOfRandomNum[i] = randomNumbers();
        }
        printArr(arrOfRandomNum);
        System.out.print("\n");
        changeOddNumberToZero(arrOfRandomNum);
    }

    public static int randomNumbers() {

        int randomNum = (int) ( Math.random() * 21 );
        return  randomNum;
    }

    public static void changeOddNumberToZero (int[] arrOfRandomNum) {

        int quantityOfEvenNum = 0;
        for (int i = 0; i < arrOfRandomNum.length; i++) {
            if (i % 2 != 0) {
                arrOfRandomNum[i] = 0;
            }
        }
        printArr(arrOfRandomNum);
    }

    public static void printArr (int[] arrOfRandomNum) {

        for (int i = 0; i < arrOfRandomNum.length; i++){
            System.out.print(arrOfRandomNum[i] + " ");
        }
    }
}
