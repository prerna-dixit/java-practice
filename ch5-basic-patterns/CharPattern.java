public class CharPattern {
    public void charPattern(int lines)
    {char z='A';
        for(int i=1; i<=lines; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(z);
                z++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        CharPattern obj=new CharPattern();
        obj.charPattern(4);
    }
    
}
