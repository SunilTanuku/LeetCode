package simple;

public class ClosestNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 4, 7,6};
        int number =5;
        int closeNumber = number-arr[0];
        int checkNumber = 0;
        int j=0;
        for(int i=1;i< arr.length;i++){
            checkNumber = Math.abs(number-arr[i]);

            if(checkNumber<closeNumber){
                closeNumber = checkNumber;
                j=i;

            }
        }
        System.out.println(arr[j]);

    }
}
