public class findelepresinthearr {
    public static boolean find(int arr[],int i,int j,int n)
    {
        if(i==j)
        return false;

        if(arr[i]==n)
        return true;

        find(arr,i+1,j,n);
    }
    public static void main()
    {
        int arr[]={1,2,3,4};
        System.out.print(find(arr,0,arr.length,3));
    }
}
