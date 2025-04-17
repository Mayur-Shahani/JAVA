package Array;

public class Smallest_Number_In_An_Array {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int min = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            min = Math.min(min,arr[i]);
        }
        System.out.println("The Minimum Number In An Array is : " + min);
    }
}
