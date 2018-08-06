public class TwoRandomArr {
    public static void main(String[] args) {
        //int[] arrOfRandomNum = new int[5];
        int sumOfArr1 = 0;
        int sumOfArr2 = 0;
        System.out.println("Arr 1 ");
        int[] arrOfRandomNum1 = new int[5];
        for (int i = 0; i < arrOfRandomNum1.length; i++) {
            arrOfRandomNum1[i] = randomNumbers();
            System.out.print(arrOfRandomNum1[i] + " ");
            sumOfArr1 += arrOfRandomNum1[i];
        }
        int averageOfArr1 = (int) (sumOfArr1 / arrOfRandomNum1.length);

        System.out.print("\n");

        System.out.println("Arr 2 ");
        int[] arrOfRandomNum2 = new int[5];
        for (int i = 0; i < arrOfRandomNum2.length; i++) {
            arrOfRandomNum2[i] = randomNumbers();
            System.out.print(arrOfRandomNum2[i] + " ");
            sumOfArr2 += arrOfRandomNum2[i];
        }
        int averageOfArr2 = (int) (sumOfArr2 / arrOfRandomNum2.length);

        System.out.print("\n");

        if (averageOfArr1 > averageOfArr2) {
            System.out.print("The arithmetic mean is larger for the first array");
        } else if (averageOfArr1 < averageOfArr2){
            System.out.print("The arithmetic mean is larger for the second array");
        } else {
            System.out.print("arrays are equal");
        }

    }

    public static int randomNumbers() {
        int randomNum = (int) ( Math.random() * 16 );
        return  randomNum;
    }

}
