// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class HelloWorld {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.print("Enter a number ; ");
       int num=scan.nextInt();
       int val=num*(num+1)/2;
       System.out.println("Sum is : "+val);
    }
}