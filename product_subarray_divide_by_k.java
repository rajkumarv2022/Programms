public class product_subarray_divide_by_k {
    public static int fun(int arr[],int k)
    {
        int sum=0;

        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        if(sum%k==0)
        {
            return 0;
        }

        
        for(int sp=0;sp<arr.length;sp++)
        {
            for(int ep=sp;ep<arr.length;ep++)
            {
                
            }
        }

    }
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5,6};
        int k=3;
        System.out.println(fun(arr,k));
    }
}
