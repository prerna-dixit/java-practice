/* the problem requires us to print a matrix in a spiral manner, eg
a matrix:
1   2   3   4
5   6   7   8
9   10  11  12
13  14  15  16
will give the output: 
1   2   3   4   8   12  16  15  14  13  9   5   6   7   11  10

so we break down the problem as "borders" of the matrix n print each border in each iteration of while loop
each border is printed in 4 passes:
top- 1 2 3 4
right- 8 12 16
bottom- 15 14 13
left- 9 5
*/

public class spiralmatrix{
    public static void spiral(int matrix[][])
    {
        int startrow=0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;

        while(startrow<=endrow && startcol<=endcol)
        {
            //top
            for (int j =startcol; j <=endcol; j++) 
            {
                System.out.print(matrix[startrow][j] + "    ");
            }
            //right
            for (int i =startrow+1; i<=endrow; i++) 
            {
                System.out.print(matrix[i][endcol] + "    ");
            }
            //bottom
            for (int j =endcol-1; j >=startcol; j--) 
            {
                /*introducing a condition for when values of n and m are odd n produce a single cell as a boundary
                then to avoid printing that single cell twice [its already been printed in top n right]
                we introduce this condition in bottom n left*/

                if(startrow==endrow)
                {
                    break;
                }

                System.out.print(matrix[endrow][j] + "    ");
            }
            //left
            for (int i =endrow-1; i>=startrow+1; i--) 
            {
                if(startcol==endcol)
                {
                    break;
                }
                System.out.print(matrix[i][startcol] + "    ");
            }

            startrow++;
            startcol++;
            endrow--;
            endcol--;

        }
        
        
    }

    public static void main(String[] args) {
        int matrix[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        spiral(matrix);
    }
}