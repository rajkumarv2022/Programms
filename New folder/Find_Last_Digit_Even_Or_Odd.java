import java.util.*;

class Find_Last_DIgit_Even_Or_Odd{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num=scan.nextInt();

        int lastdigit=num%10;

        if(lastdigit%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}