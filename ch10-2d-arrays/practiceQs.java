public class practiceQs {
    /*
        q1: print number of 7's in a 2d array
        eg array= 4    7    8
                  8    8    7
        output=2
    */

    public static void noOfSeven(int mat[][])
    {
        int count=0;
        for (int i = 0; i < mat.length; i++) 
        {
            for (int j = 0; j < mat[0].length; j++) 
            {
                if(mat[i][j]==7)
                {
                    count++;
                }
                
            }
            
        }
        System.out.println(count);
    }

    /* q2- print sum of numbers in second row of array
       eg- 4    1   9
           11   4   3
           2    2   3
       output=11+4+3=18  
     */

       public static void secondRowSum(int mat[][])
       {
        int sum=0;
        for (int j = 0; j < mat[0].length; j++) {
            {
                sum+=mat[1][j];
            }
        }
        System.out.println("sum of second row elements: " + sum);
       }

       /*   q3- tranpose of a matrix
        */

       public static void tranpose(int mat[][])
       {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[j][i] + "    ");            

            }
            System.out.println();
            
        }
       }


    public static void main(String[] args) {
        int mat[][]={{4,8,7},{5,7,3},{7,7,9}};
        noOfSeven(mat);
        secondRowSum(mat);
        tranpose(mat);
    }
}
