import java.util.*;
public class basic {

    public static void input(int matrix[][])
    {
         Scanner sc=new Scanner(System.in);
         int n=matrix.length;
         int m=matrix[0].length;
         System.out.println("enter the elements of matrix:");
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j]=sc.nextInt();
                
            }
            
        }


    }

    public static void print(int matrix[][]) {
        int n=matrix.length;
        int m=matrix[0].length;

        System.out.println("the matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + "  ");
                
            }
            System.out.println();
            
        }
        
    }


    public static boolean searching(int matrix[][], int key) {
        int n=matrix.length;
        int m=matrix[0].length;
        System.out.println("finding "+key+" in the matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(matrix[i][j]==key)
                {
                    System.out.println("found at position: (0th indexing)" + i+ " , " + j);
                    return true;
                }
                
            }
            
        }
        return false;
        
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of matrix: ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        
        int matrix[][]=new int[n][m];

        input(matrix);
        print(matrix);

        System.out.println("enter the element to be found: ");
        int key=sc.nextInt();
        searching(matrix, key);


    }
}
