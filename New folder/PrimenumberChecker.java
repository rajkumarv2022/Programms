import java.util.*;

public class PrimenumberChecker {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter number : ");
        int num=scan.nextInt();
        int flag=0;

        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
                flag=1;
            
        }

        if(flag==1)
            System.out.println("Not Prime");
        else
            System.out.println("Prime");

    }
}
