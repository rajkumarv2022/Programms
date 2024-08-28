public class recprintarr {
    public static void printarr(int arr[],int i,int j)
    {
        if(i==j)
        return;
        System.out.println(arr[i]);

        printarr(arr,i+1,j);
    }
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5};
        printarr(arr,0,arr.length);
    }
}
