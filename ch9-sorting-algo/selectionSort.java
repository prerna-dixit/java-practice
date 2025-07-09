public class selectionSort {
    //selection sort demonstration
    //time complexity is O(n**2)

    public static void selectionSort(int arr[]) 
    {
        for (int turn = 0; turn <arr.length-1; turn++) 
        {
            int minPos=turn; //assuming the minimum element is at current position
            for (int i = turn+1; i <arr.length; i++) //turn+1 to compare it with next element
            {
                if (arr[minPos]>arr[i]) //compare min pos n current element
                {
                    minPos=i;           
                }
                
            }
            //swapping directly at the beginning
            int temp=arr[minPos];
            arr[minPos]=arr[turn];
            arr[turn]=temp;            
        }
    }
       
        public static void printArray(int a[]) 
        {
            for (int i = 0; i <a.length; i++) 
            {
                System.out.println(a[i]);
                
            }
            
        }

    public static void main(String[] args) 
    {
        int arr[]={5,4,1,2,3};
        selectionSort(arr);
        printArray(arr);
        
    }
    
}
