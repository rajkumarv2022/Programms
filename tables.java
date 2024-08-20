// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class HelloWorld {
    
    public static void printable(int num)
    {
         for(int i=1;i<=10;i++)
        {
            int val = num*i;
            System.out.println(num+" X "+i+" = "+val);
        }
    }
    
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        num = scan.nextInt();
        printable(num);
       
    }
}