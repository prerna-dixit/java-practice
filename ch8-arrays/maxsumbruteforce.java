
import java.util.*;

public class maxsumbruteforce {
    //subarrayprint
    public static void subarray(int arr[]) 
    {int ts=0;
        for (int i = 0; i <arr.length; i++)                               
        { int start=i;                                                     
            for (int j = i; j <arr.length; j++)                          
            { int end=j;
                for (int k = start; k <=end; k++) 
                { System.out.print(arr[k] + " ");}                       //printing subarrays
                ts++;                                                      //counting the no of subarrays
                System.out.println();                
            }
            System.out.println();            
        }
        System.out.println("total subarrays= " + ts);        
    }
    //maxsum
    public static void maxsum(int arr[]) 
    { int maxsum=Integer.MIN_VALUE;
      int currsum=0;
      for (int i = 0; i <arr.length; i++)                               
        { int start=i;                                                     
            for (int j = i; j <arr.length; j++)                          
            { int end=j;
              currsum=0;                                                          //resetting currsum to 0 for every subarray
                for (int k = start; k <=end; k++) 
                { currsum+=arr[k];} 
                System.out.println("current sum= " + currsum);                      //calculating sum of subarrays
                if (maxsum<currsum) 
                { maxsum=currsum;}        
            }       
        }
        System.out.println("max subarray sum is " + maxsum);
    }
    //mainfunc
    public static void main(String[] args) 
    { Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of the array");
      int n=sc.nextInt();
      int arr[]=new int[n];  //creatin an empty array
      System.out.println("enter " + n + " elements");
      for (int i = 0; i <arr.length; i++) 
      {arr[i]=sc.nextInt();}  
      System.out.println("here are the subarrays-");   
      subarray(arr);
      maxsum(arr);

        
    }
}