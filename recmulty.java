public class recmulty {
    public static int mul(int a,int b)
    {
        if(a==1)
        {
            return b;
        }
        if(b==1)
        {
            return a;
        }
        return a+mul(a,b-1);
    }
    public static void main(String[] args)
    {
        System.out.println(mul(5,4));
    }
}
