public class RandomNumbers {
    public static void main(String[] args) {

        int[] arrOfRandomNum = new int[15];
        for (int i = 0; i < arrOfRandomNum.length; i++) {
            arrOfRandomNum[i] = randomNumbers();
            System.out.print(arrOfRandomNum[i] + " ");
        }
        System.out.print("\n");
        quantityOfEvenNumber(arrOfRandomNum);
    }

    public static int randomNumbers() {
        int randomNum = (int) ( Math.random() * 100 );
        return  randomNum;
    }

    public static void quantityOfEvenNumber (int[] arrOfRandomNum) {

        int quantityOfEvenNum = 0;
        for (int i = 0; i < arrOfRandomNum.length; i++) {
            if (i % 2 == 0) {
                quantityOfEvenNum++;
            }
        }
        System.out.print("Number of even elements in the array = " + quantityOfEvenNum);
    }
}
