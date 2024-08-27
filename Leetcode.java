public class Leetcode
{
    public static void tw(int arr[])
    {
        int pm[]=new int[arr.length];
        int sm[]=new int[arr.length];
        int ans=0;
        pm[0]=arr[0];
        sm[arr.length-1]=arr[arr.length-1];
        for(int i=1;i<arr.length;i++)
        {
            pm[i]=Math.max(arr[i],pm[i-1]);
        }
        for(int i=arr.length-2;i>=0;i--)
        {
            sm[i]=Math.max(arr[i],sm[i+1]);
        }
        for(int i=0;i<arr.length;i++)
        {
            ans=ans+Math.min(pm[i],sm[i])-arr[i];
        }
        System.out.print(ans);
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
        tw(arr);
    }
}