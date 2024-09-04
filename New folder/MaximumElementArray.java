public class MaximumElementArray {
    public static void main(String[] args)
    {
        int arr[] ={1,4,3,2};
        
        int max=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }

        System.out.println("Max : "+max);
    }
}
