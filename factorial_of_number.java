// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class HelloWorld {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the number : ");
      int num=scan.nextInt();
      int val=1;
      for(int i=1;i<=num;i++)
      {
          val=val*i;
      }
      System.out.println("Factorial of number is : "+val);
    }
}