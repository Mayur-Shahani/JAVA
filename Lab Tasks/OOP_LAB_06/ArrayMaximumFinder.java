package OOP_LAB;

public class ArrayMaximumFinder {
    public static void main(String[] args) {
        int arr[] = {4,7,9,23,56};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        System.out.println("The maximum number is : " + max);
    }
}

