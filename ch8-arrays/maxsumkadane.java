import java.util.Scanner;

public class maxsumkadane 
{ public static void kadanes(int arr[]) 
    {int maxsum=Integer.MIN_VALUE;
     int currsum=0;
     //for an array where all the elements are negative, we take sum as the smallest negative number
     for (int i = 0; i<arr.length ; i++) 
     {
      currsum=currsum+arr[i];
      if (currsum<0) 
      { currsum=0;}
      maxsum=Math.max(currsum, maxsum); 
        
     }
    System.out.println("The max sum is= "  + maxsum);
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) 
        {arr[i]=sc.nextInt();}

        kadanes(arr);
        
    }
}
