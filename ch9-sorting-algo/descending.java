public class descending {
    //sort an array in descending order using all sorting algos

    public static void bubbleSort(int arr[]) 
    { //no of turns
      for (int i = 0; i <arr.length-1; i++) 
      { //swapping
       for (int j = 0; j <arr.length-1-i; j++) {
            if (arr[j]<arr[j+1]) 
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                
            }
       }
          
      }    
    }
    public static void selectionSort(int arr[]) 
    {
        //no of turns
        for (int i = 0; i < arr.length-1; i++) 
        { int LargestNumPos=i;     //assuming the position of the largest number as current one
            for (int j = i+1; j < arr.length-1; j++) 
            {
                if (arr[LargestNumPos]<arr[j])
                {LargestNumPos=j;}          //shift the position of largest frm current to j if j is larger      
            }
        //swapping
        int temp=arr[LargestNumPos];
        arr[LargestNumPos]=arr[i];
        arr[i]=temp;
        }
        
    }
    public static void insertionSort(int arr[]) 
    {
        for (int i = 0; i < arr.length; i++) 
        {
            int curr=arr[i]; //temporary memory to store current element in
            int prev=i-1;
            //finding out where to insert
            while (prev>=0 && arr[prev]<curr) 
            {
                arr[prev+1]=arr[prev];
                prev--;                
            }          
            //insertion
            arr[prev+1]=curr;  
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
        int arr[]={3,6,2,1,8,7,4,5,3,1};
       // bubbleSort(arr);
       //selectionSort(arr);
       insertionSort(arr);
        printArray(arr);

    }
    
}
