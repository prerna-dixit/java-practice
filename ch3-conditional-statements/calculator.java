import java.util.*;

public class calculator {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("CALCULATOR");
        System.out.println("Enter two operands");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter the operator out of + - * / %");
        char operator=sc.next().charAt(0); //converting string to char
        switch (operator) {
            case '+':
                {System.out.println(a+b);} 
            break;
            case '-':
                {System.out.println(a-b);}
            break;
            case '*':
                {System.out.println(a*b);}
            break;
            case '/':
                {System.out.println(a/b);}
            break;
            case '%':
                {System.out.println(a%b);}
            break;
            default:
                {System.out.println("error");}
        }
        sc.close();
        }}
  
