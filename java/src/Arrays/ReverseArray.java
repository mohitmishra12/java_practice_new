package Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int arr[] = {76,43,23,57,57,34,97,45,55,12};

        int start= 0;
        int end = arr.length-1;

        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
