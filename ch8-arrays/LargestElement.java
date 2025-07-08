import java.util.*;
public class LargestElement {

    // Function to find and print the largest number
    public static void findLargest(int arr[]) {
        int max = arr[0]; // Assume first element is the largest

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("The largest element in the array is: " + max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        findLargest(arr);
    }
}

    
