public class InvertedStar {
    
    public void invStar(int lines)
    {
        for(int i=1; i<=lines; i++)
        {
            for(int j=1; j<=lines-i+1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        InvertedStar obj=new InvertedStar();
        obj.invStar(4);
    }
}
