import java.util.*;

public class SumofNnumbers {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter a number : ");

        int num=scan.nextInt();

        int sum=0;

        for(int i=1;i<=num;i++)
        {
            sum=sum+i;
        }

        System.out.println("The sum is "+sum);

        //formula for sum of n natural numbers

        // int res=num*(num+1)/2;

        // System.out.println("The sum is "+sum);
    }
}
