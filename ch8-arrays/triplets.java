import java.util.Arrays;
import java.util.Scanner;

public class triplets {

    //this program accepts an array n returns the triplets of elements of index i, j, k where i!=j, i!=k, j!=k, and num[i]+num[j]+num[k]==0
    //solution shouldnt contain duplicate triplets

    public static void triplets(int arr[]) 
    {    Arrays.sort(arr); // Step 1: sort the array
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            // Skip duplicate 'i' elements
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            int left = i + 1;
            int right = n - 1;

            while (left < right) {              //calculates if the sum of left n right elements with the ith element is zero
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    System.out.println("Triplet: " + arr[i] + ", " + arr[left] + ", " + arr[right]);

                    // Move pointers and skip duplicates
                    left++;
                    right--;

                    while (left < right && arr[left] == arr[left - 1]) left++;
                    while (left < right && arr[right] == arr[right + 1]) right--;

                } else if (sum < 0) {
                    left++; // Need a bigger number
                } else {
                    right--; // Need a smaller number
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements of array:");
        for (int i = 0; i <n; i++) 
        {
            arr[i]=sc.nextInt();
        }
        triplets(arr);
    }
    
}
