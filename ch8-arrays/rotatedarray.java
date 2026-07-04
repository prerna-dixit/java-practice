import java.util.Arrays;
import java.util.Scanner;

public class rotatedarray {

    /*this program accepts an array, converts into ascending order, then rotated it by any index k where k belongs to 1 to array length included, 
    for example, array [0,1,2,3,4] is rotated at index 3 then it becomes [3,4,0,1,2]
    we need to calculate the index value of any key in the rotated array, eg index of 2 in original array is 3. whereas in rotated array is 5. */
    //time complexity of this program is O(n log n) 

    public static void rotatedArray(int arr[], int k, int key) 
    {   
        int sorted[]=Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted);              //sorted the array in ascending order

        //rotating the array
        int n=arr.length;
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
        rotated[(i + k) % n] = sorted[i];  // Use sorted[i], not arr[i]
}

        //binary search
        int start=0;
        int end=sorted.length-1;
        boolean found=false;

        while(start<=end)
        {int mid= (start+end)/2; 
        if (rotated[mid]==key)
        {System.out.println("element found at index: " + mid);
        found=true;
        break;}
        else if (rotated[mid]<key)         //look in the right half
        {start=mid+1;}
        else 
        {end=mid-1; }

    }
    if (!found)
    {System.out.println("-1");}
        


        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=sc.nextInt();
        System.out.println("enter the distinct elements of array :");
        int array[]=new int[n];
        for (int i = 0; i < n; i++) 
        { array[i]=sc.nextInt();   }
        System.out.println("at what index do u want the array to be rotated: (make sure the index is >=1 and <array length, and the indexing of an array goes from 0, 1, 2 to array length)");
        int k=sc.nextInt();
        System.out.println("for which element do you want to know the new index:");
        int key=sc.nextInt();
        rotatedArray(array, k, key);



    }
    
}
