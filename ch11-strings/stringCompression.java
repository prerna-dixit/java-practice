public class stringCompression {

    public static void compress(String str)
    {
        StringBuilder sb=new StringBuilder("");
        
        for (int i = 0; i <str.length(); i++) {
            int count=1;
            int j=i;
            while(j<str.length()-1 && str.charAt(j)==str.charAt(j+1))
            {
                count++;
                j++;
            }
            sb.append(str.charAt(i));
            if(count>1)
            {
                sb.append(count);
            }
            i=j;
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String str="aaabbcccdda";
        compress(str);
    }
    
}
