public class ArrayRotateArrayNtimes {
    public static void swap(int arr[],int i,int j)
    {
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5};
        int k=1;

        k=k%arr.length;

        swap(arr,0,arr.length-1);
        swap(arr,0,k-1);
        swap(arr,k,arr.length-1);
        

        for(int i:arr)
            System.out.print(i+" ");
    }
}
