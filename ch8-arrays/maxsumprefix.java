
import java.util.Scanner;

public class maxsumprefix 
{public static void maxsum(int arr[]) {
    int[] prefix = new int[arr.length];
    prefix[0] = arr[0];

    for (int i = 1; i < arr.length; i++) {
        prefix[i] = prefix[i - 1] + arr[i]; // building prefix sum
    }

    int maxSum = Integer.MIN_VALUE;

    // now compute all subarray sums using prefix sum
    for (int i = 0; i <arr.length; i++) { //start
        for (int j = i; j < arr.length; j++) { //end
            int currSum=0;
            if (i == 0) {
                currSum = prefix[j]; //nothing to subtract if i==0 
            } else {
                currSum = prefix[j] - prefix[i - 1]; //prefix[end]-prefix[start-1]
            }

            maxSum = Math.max(maxSum, currSum);
        }
    }

    System.out.println("max subarray sum is " + maxSum);
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements-");
        for (int i = 0; i <n; i++) 
        {arr[i]=sc.nextInt();}
        maxsum(arr);

    }
    
}
