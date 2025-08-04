public class countingSort {
    //demonstration of counting sort

    public static void countingSort(int arr[]) 
    {
        int largest=Integer.MIN_VALUE; //largest num of the array
        for (int i = 0; i <arr.length; i++) 
        {
         largest= Math.max(largest, arr[i]);   
        }
        //frequency count
        int count[]=new int[largest+1];  //+1 for 0
        for (int i = 0; i < arr.length; i++) 
        { 
            count[arr[i]]++ ; //taking number as index nd ++ to count the frequency of that num
            
        }
        //sorting
        int j=0;
        for (int i = 0; i <count.length; i++) 
        {
            while (count[i]>0) 
            {
                arr[j]=i;
                j++;
                count[i]--; 
                
            }
            
        }


        
    }
    public static void printArray(int arr[]) 
    {
        for (int i = 0; i < arr.length; i++) 
        {
         System.out.println(arr[i]);   
        }
        
    }

    public static void main(String[] args) {
        int arr[]={1,4,1,3,2,4,3,7};
        countingSort(arr);
    printArray(arr);    }
    
}
