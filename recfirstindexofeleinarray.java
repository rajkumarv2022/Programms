public class recfirstindexofeleinarray {
    public static int fun(int arr[],int i,int j,int k)
    {
        if(i==j)
        {
            return -1;
        }
        if(arr[i]==k)
        return i;
        return fun(arr,i+1,j,k);
    }
    public static void main(String[] args)
    {
        int arr[]={1,2,3,3,5};
        //System.out.println(fun(arr,0,arr.length,3));
        System.out.println(funwa(int arr,arr.length,3));
    }
}
