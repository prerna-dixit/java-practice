
import java.util.Scanner;

public class distinctElements 
{ 
    //this program accepts an array, returns true if any element appears twice, n returns false if all the elements are distinct

    public static void distinctElements(int arr[]) 
    {   boolean distinct=true;                                   //assuming that all the elements are distinct
            for (int i = 0; i <arr.length; i++)                  //take one element
            { 
                for (int l = i+1 ; l <arr.length; l++)           //n comparing it with all the further elements in the array
                {
                        if (arr[i]==arr[l])                      //if elements are equal, distinct becomes false, prints true, n breaks the loop n moves onto next i
                        { System.out.println("true");  
                          distinct=false;
                          break; }
                }

                if (!distinct)                                  //when distinct becomes false, move out of the loop completely, saves time to not check anymore
                { break;}
            }  
        if (distinct) 
        { System.out.println("false");}                      //if distinct stays true all along, we print false
            
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements of array:");
        for (int i = 0; i <n ; i++) 
        { arr[i]=sc.nextInt();   }

        distinctElements(arr);                               


    }
    
}
