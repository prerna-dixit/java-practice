import java.util.*;

public class useofoperator {
    public static void main(String[] args) 
    {Scanner sc=new Scanner(System.in);
     System.out.println("Here's a demonstration of different kinds of operators in java");
     System.out.println("Enter two numbers- [let the second num not be 0]");
     float a=sc.nextFloat();
     float b=sc.nextFloat();
     System.out.println("1. Arithmetic Operator-");
     System.out.println("a.Unary \n" + "post-increment=" +  a++  + "\n"+ "pre-increment=" + ++a + "\n"+ "post-decrement=" + a-- +"\n" + "pre-decrement=" + --a);
     System.out.println("b. Binary");
     float add=a+b;
     float sub=a-b;
     float mul=a*b;
     float div=a/b;
     float rem=a%b;
     System.out.println("addition=" + add +"\n"+ "subtraction=" + sub +"\n" + "multiplication=" + mul + "\n" + "division=" + div +"\n" + "remainder=" + rem);
     System.out.println("2. Relational Operator-");
     int c=2;
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == c: " + (a == c));
        System.out.println("a != c: " + (a != c));
     System.out.println("3. Arithmetic Operators");
        System.out.println("a += 2: " + (a += 2));
        System.out.println("a -= 4: " + (a -= 4));
        System.out.println("a *= 7: " + (a *= 7));
        System.out.println("a /= 3: " + (a /= 3));
        System.out.println("a %= 5: " + (a %= 5));
     System.out.println("4. Logical Operator-");
        boolean x = true;
        boolean y = false;      
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
    System.out.println("5. Ternary Operator-");
    float result;
        result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
        System.out.println("Max of three numbers = "+ result);
    System.out.println("6. Bitwise Operator-");
        int d = 0b1010;
        int e = 0b1100;
        System.out.println("d & e : " + (d & e));
        System.out.println("d | e : " + (d | e));
        System.out.println("d ^ e : " + (d ^ e));
        System.out.println("~d : " + (~d));
        System.out.println("d << 2 : " + (d << 2));
        System.out.println("e >> 1 : " + (e >> 1));
        System.out.println("e >>> 1 : " + (e >>> 1));        
    }
}