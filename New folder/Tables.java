import java.util.Scanner;

public class Tables {

        public static void main(String[] args)
        {
            Scanner scan=new Scanner(System.in);

            System.out.print("Enter the number : ");
            int num=scan.nextInt();

            for(int i=1;i<=10;i++)
            {
                int res=num*i;
                System.out.println(i+" X "+num+" = "+res);
            }
        }

        

}
