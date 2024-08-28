public class elepresentornotinarr {
    public static boolean fun(int arr[],int i,int j,int n)
    {
    
        if(i==j)
        return false;
        if(arr[i]==n)
        {
            return true;
        }
        return fun(arr,i+1,j,n);
        
        
    }
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5,6};
        System.out.print(fun(arr,0,arr.length,7));
    }
}
