public class CPDesignHashset {

    static boolean arr[];

    CPDesignHashset()
    {
        arr=new boolean[1001];
    }

    public static boolean isContain(int tar)
    {
        if(arr[tar]==true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static void put(int val)
    {
       
        arr[val]=true;

    }
    
    public static void remove(int tar)
    {
        arr[tar]=false;
    }
    public static void main(String[] args)
    {
        CPDesignHashset hs=new CPDesignHashset();
        put(5);
        System.out.println(isContain(5));
        remove(5);
        System.out.println(isContain(5));
        
    }
}
