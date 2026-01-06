package Arrays;

public class MaxMinArray {
    public static void main(String[] args) {

        int arr[] = {23,12,1,34,19,99};
        int max=arr[0];
        int min=arr[0];

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max)
                max=arr[i];

                if(arr[i]<min)
                    min=arr[i];

        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
