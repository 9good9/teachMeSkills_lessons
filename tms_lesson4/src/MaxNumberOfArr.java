public class MaxNumberOfArr {
    public static void main(String[] args) {

        int[] arr = new int[12];
        int maxNum = 0;
        int maxNumIndex = 0;

        for (int i = 0; i < arr.length; i++){
            arr[i] = randomNumbers();
            System.out.print(arr[i] + " ");
            if (arr[i] > maxNum) {
                maxNum = arr[i];
                maxNumIndex = i;
            } else if(arr[i] == maxNum) {
                maxNumIndex = i;
            }
        }
        System.out.print("\n");
        System.out.print("The maximum element is = " + maxNum + " its index is equal to = " + maxNumIndex);
    }

    public static int randomNumbers() {
        int randomNum = (int) ( Math.random() * 11 );
        return  randomNum;
    }
}
