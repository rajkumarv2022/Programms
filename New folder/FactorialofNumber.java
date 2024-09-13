import java.util.*;

public class FactorialofNumber {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number : ");

        int num=scan.nextInt();

        int fact=1;

        for(int i=1;i<=num;i++)
        {
            fact=fact*i; 
        }

        System.out.println("The factorial ofa number is : "+fact);

    }
}
