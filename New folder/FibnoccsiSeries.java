public class FibnoccsiSeries {
    public static void main(String[] args)
    {
        int n=7;
        int t1=-1;
        int t2=1;
        int t3;

        for(int i=0;i<n;i++)
        {
            t3=t1+t2;
            t1=t2;
            t2=t3;
            System.out.print(t3+" ");
        }
    }
}
