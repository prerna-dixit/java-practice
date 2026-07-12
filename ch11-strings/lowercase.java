public class lowercase {

    public static void main(String[] args) {
        String str="I am Prerna Dixit";

        int count=0;
        for (int i = 0; i <str.length(); i++) 
        {
                if(str.charAt(i)>='a' && str.charAt(i)<='z')
                {
                    count++;
                }
            

        }
        System.out.println(count);
    }
    
}
