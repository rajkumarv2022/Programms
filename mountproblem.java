public class mountproblem {
    public static int mount(int arr[])
    {
        int left=0;
        int right=0;
        int gans=0;

        for(int i=1;i<arr.length-1;i++)
        {
            left=0;
            right=0;
            //System.out.println(arr[i]);
            if((arr[i-1]<arr[i]) && (arr[i]>arr[i+1]))
            {
                left=i;
                right=i;
               //System.out.println(arr[i]);
            }

            while(left>0 && arr[left]>arr[left-1])
            {
                left--;
            }

            while(right<arr.length-1 && arr[right]>arr[right+1])
            {
                right++;
            }
            int cans=right-left+1;
            gans=Math.max(gans,cans);
        }
        return gans;
    }
    public static void main(String[] args)
    {
        int arr[]={2,1,3,4,5,7,6,4,3,8,2,-1,-2,-3,-4,-5,-6,-7,-8,-9};
        System.out.println("ans "+mount(arr));
    }
}
