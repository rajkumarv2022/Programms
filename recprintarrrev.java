public class recprintarrrev {
    public static void printarr(int arr[],int i,int j)
    {
        if(j==-1)
        return;
        System.out.println(arr[j]);

        printarr(arr,i,j-1);
    }
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5};
        printarr(arr,arr.length,arr.length-1);
    }
}
