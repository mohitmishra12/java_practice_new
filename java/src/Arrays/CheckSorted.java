package Arrays;

public class CheckSorted {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5};
        boolean isSorted = true;




        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
                break;
            }
        }

        if(isSorted){
            System.out.println("The array is sorted");
        }else{
            System.out.println("The array is not sorted");
        }
        //System.out.println(isSorted);
        System.out.println("Sorted: " + isSorted);
    }
}
