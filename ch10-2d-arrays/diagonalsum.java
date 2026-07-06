/* the problem requires us to give the output as the sum of both primary n secondary diagonals
eg
1   2   3
4   5   6
7   8   9
the output= (1+5+9)+(3+7)
the middle cell 5, is repeated so we put a condition to not repeat.
 */
public class diagonalsum{
    //brute force solution, time complexity=O(n^2)
    public static void brutediagonal(int matrix[][])
    {
        int sum=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                
                //primary diagonal
                if(i==j)
                    {
                        sum+=matrix[i][j];
                    }                
                //secondary diagonal
                if(i+j==matrix.length-1)
                {
                    sum+=matrix[i][j];
                }
            }
            
        }
        System.out.println("diagonal sum= " + sum);

    }

    //optimised solution that replaces j by its value in terms of i, hence only one loop
    //time complexity= O(n^1)
    public static void diagonal(int matrix[][]) {
        int sum=0;
        for (int i = 0; i < matrix.length; i++) {
            //primary i=j
            sum+=matrix[i][i];
            //secondary i+j=n-1; therefore j=n-i-1
            //overlapping cell condition
            if(i!=matrix.length-i-1) //i!=j cuz its already done in primary
            {
                sum+=matrix[i][matrix.length-i-1];
            }
            
        }
        System.out.println("diagonal sum= " + sum);
        
        
    }

    public static void main(String args[])
    {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        brutediagonal(matrix);
        diagonal(matrix);
    }
        
}