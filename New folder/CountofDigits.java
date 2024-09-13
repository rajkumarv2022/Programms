import java.util.*;

public class CountofDigits {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num=scan.nextInt();

        int count=0;

        while(num>0)
        {
            count++;
            num=num/10;
        }

        System.out.println("Number of digits present : "+count);
    }
}
