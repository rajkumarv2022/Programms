public class CPMergeSort {

    public static int[] merge(int arr1[],int arr2[])
    {
        int result[]=new int[arr1.length+arr2.length];

        int i=0;
        int j=0;
        int k=0;

        while(i<arr1.length&&j<arr2.length)
        {
            if(arr1[i]<=arr2[j])
            {
                result[k]=arr1[i];
                i++;
                k++;
            }
            else
            {
                result[k]=arr2[j];
                j++;
                k++;
            }
        }

        while(i<arr1.length)
        {
            result[k]=arr1[i];
            i++;
            k++;
        }

        while(j<arr2.length)
        {
            result[k]=arr2[j];
            j++;
            k++;
        }

        return result;
    }

    public static void mergesort(int arr[],int low,int high)
    {

        if(low==high)
        {

        }

        int mid=low+high/2;

        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
    }
    public static void main(String[] args) {
        int arr[]={1,4,3,2,6,5,9,8};
        mergesort(arr,0,arr.length-1);
    }
}
