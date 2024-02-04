package sortbasic;

public class sortbasic {

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+" Array index element : " +arr[i]);
        }
    }


    static void swap(int[] arr,int i , int j){
        arr[i] = (arr[i] + arr[j]) - (arr[j] = arr[i]);

    }
    static void swapArray(int[] arr){
        int n = arr.length;
        int left = 0; int right = n -1;
        while (left < right){
            if (arr[left]== 1 && arr[right]==0){
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left]==0){
                left++;
            }
            if (arr[right]==1){
                right--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }



    public static void main(String[] args) {
        int[] arr = {0,1,0,1,0,0,1,1,0};
        swapArray(arr);


    }


}