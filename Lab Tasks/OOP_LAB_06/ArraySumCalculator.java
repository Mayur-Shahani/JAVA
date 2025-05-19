package OOP_LAB;

public class ArraySumCalculator{
    public static void main(String[] args) {
        int arr[] = {3,5,7,9,12};
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        System.out.println("The total sum is : " + sum);
    }
}
