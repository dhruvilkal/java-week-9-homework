package javahomeworkweek9;

/**
 * Write a Java program to reverse an array of integer values.
 */

public class Programme_3_ReverseArray {
    //main method
    public static void main(String[] args) {

        int[] arr ={1, 2, 3, 4, 5};

        System.out.println("Original Array:");
        printArray(arr);

        reverseArray(arr);

        System.out.println("\nReversed Array:");
        printArray(arr);
    }

    //Function to reverse an array of integers
    public static void reverseArray(int[] arr){
        int start = 0;
        int end =arr.length - 1;

        while (start < end){
            // Swap the elements at start and end
            int temp = arr[ start];

            arr[start] = arr[end];
            arr[end] =temp;

            start++;
            end--;

        }
    }
    //Function to print the elements of an array
    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
