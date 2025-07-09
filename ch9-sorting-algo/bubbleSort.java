public class bubbleSort {

    //demonstration of bubble sort
    
    //contains an optimized algorithm of time complexity O(n) if the array is already sorted
    //time complexity is O(n**2), bubble sort algorithm
    
    public static void BubbleSort(int arr[])
    {  for (int j = 0; j <arr.length-1; j++) 
        { if (arr[j+1]>arr[j])
            {System.out.println("the array is already sorted!");}

          else
          {//outer loop for turns
            for (int turn = 0; turn <= arr.length-1; turn++) 
            {   //inner loop for comparsion n swapping
                int swaps=0;
                for (int i = 0; i <=arr.length-2-turn; i++) 
                {
                    if(arr[i]>arr[i+1])
                    { //swap
                      int temp=arr[i];
                      arr[i]=arr[i+1];
                      arr[i+1]=temp;
                      swaps++;
                    }
                    
                }
                System.out.println("for " + turn + " turn(s), we swapped the numbers " + swaps + " times");
       }}
    }
       
            
        
    }
    public static void printArray(int arr[]) 
    {
        for (int i = 0; i <arr.length; i++) 
        {
            System.out.println(arr[i]);
            
        }
        
    }

    public static void main(String[] args) {
    int arr[]={5,4,1,3,2};
    BubbleSort(arr);
    printArray(arr);

    }

    
}