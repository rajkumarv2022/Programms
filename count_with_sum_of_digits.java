// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=scan.nextInt();
        int sum=0;
        int count=0;
        while(num>0)
        {
            int ld=num%10;
            num=num/10;
            sum=sum+ld;
            count++;
        }
        System.out.println("Sum = "+sum+"\n"+"count = "+count);
    }
}