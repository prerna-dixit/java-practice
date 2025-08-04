import java.util.*;
public class inbuiltSort {

    public static void main(String[] args) {
        int a[]={5,4,1,3,2};
        Arrays.sort(a);
        int b[]={6,12,3,6,4,63};
        Arrays.sort(b, 1, 4);
        for (int i = 0; i <a.length; i++) 
        {
            System.out.println(a[i]);
            
        }
        for (int i = 0; i <b.length; i++) 
        {
            System.out.println(b[i]);
            
        }

    }
    
}
