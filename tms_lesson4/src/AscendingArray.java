public class AscendingArray {
    public static void main(String[] args) {
        int[] arr = new int[4];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomNumbers();
            System.out.print(arr[i] + " ");
        }

        boolean flag = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                flag = false;
                break;
            }
        }

        if (flag == true) {
            System.out.print("The array is a strictly increasing sequence");
        } else {
            System.out.print("The array is not a strictly increasing sequence");
        }
    }

    public static int randomNumbers() {
        int randomNum = (int) ( Math.random() * 11 );
        return  randomNum;
    }
}
