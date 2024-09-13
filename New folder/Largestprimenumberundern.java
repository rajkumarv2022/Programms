import java.util.*;

public class Largestprimenumberundern {
    
    public static boolean isprime(int num)
    {
        if(num<2)
            return false;

        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
                return false;
        }

        return true;
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Enter number : ");
        int num=scan.nextInt();


        for(int i=num;i>=0;i--)
        {
            if(isprime(i))
            {
                System.out.println(i);
                break;
            }  
        }

    }
}
