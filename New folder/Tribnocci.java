public class Tribnocci {

    public static int trib(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else if(n==1)
        {
            return 1;
        }
        else if(n==2)
        {
            return 1;
        }
        else
        {
            return trib(n-1)+trib(n-2)+trib(n-3);
        }
    }
    public static void main(String[] args)
    {
        int n=10;
        
        for(int i=0;i<n;i++)
        {
            System.out.print(trib(i)+" ");
        }

    }
}
