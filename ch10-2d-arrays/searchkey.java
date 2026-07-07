/* the problem requires us to search for an element 'key' in a sorted matrix
the matrix is sorted row-wise n column-wise
eg  10  20  30  40
    15  25  35  45
    27  29  37  48
    32  33  39  50

    approach1- apply linear search n search every element till u find the key; O(n^2)
    approach2- apply binary search in each row; O(nlogn)
    approach3- apply binary search only where key is in range; O(n+logm)
    approach4- STAIRCASE SEARCH: move bidirectionally
               method1: take top right element
                        key==element{found}
                        key<element{move left}
                        key>element{move down}
               method2: take bottom left element
                        key==element{found}
                        key<element{move up}
                        key>element{move right}
 */
public class searchkey{
    public static boolean staircaseSearch(int mat[][], int key)
    {
        //taking top right element
        int row=0, col=mat[0].length-1;
        while(row<mat.length && col>=0)
        {
            if(key==mat[row][col])
        {
            System.out.println("found key at position: (" + row + "," + col + ")");
            return true;
        }
        else if(key<mat[row][col])
        {
            //move left
            col--;
        }
        else if(key>mat[row][col])
        {
            //move down
            row++;
        }
                
    }
    System.out.println("key does not exist in the matrix");
    return false;
    }

    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,39,48},{32,33,39,50}};
        int key=33;
        staircaseSearch(matrix, key);
    }

}