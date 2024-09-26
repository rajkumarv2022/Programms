public class CPQuickSort {

    public static int part(int arr[],int pivot,int low,int high)
    {
        int i=low;
        int j=low;

        while(i<=high)
        {
            if(arr[i]<=pivot)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
            }
            else
            {
                i++;
            }
        }
        return j-1;
    }

    public static void QuickSort(int arr[],int low,int high)
    {

        if(high<0)
            return;
        if(low>high)
            return;

        int pivot=arr[high];
        
        int indx=part(arr,pivot,low,high);

        QuickSort(arr,low,indx-1);
        QuickSort(arr,indx+1,high);
        
    }

    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5,6,7};

        QuickSort(arr,0,arr.length-1);

        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
