package Array;
public class Largest_Element_In_An_Array{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int max = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            max = Math.max(max,arr[i]);
        }
        System.out.println("The Largest Number In Array Is : " + max);
    }
}