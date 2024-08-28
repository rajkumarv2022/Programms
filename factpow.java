public class factpow {
    public static int pow(int a,int b)
    {
        if(b==1)
        {
            return a;
        }
        return a*pow(a,b-1);
    }
    public static void main(String[] args)
    {
        System.out.println(pow(3,3));
    }
}
