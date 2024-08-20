// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
       
        int num=19;
        boolean ans=true;
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                ans=false;
                break;
            }
        }
        if(ans==true)
        {
            System.out.println("Prime number");
        }
        else
        {
            System.out.println("Non Prime number");
        }
       
    }
}