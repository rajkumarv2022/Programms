import java.util.*;

public class CPTwoSumUnsorted{

    public static int[] twosum(int arr[],int tar)
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int ans[]=new int[2];

        for(int i=0;i<arr.length;i++)
            {
                if(hm.containsKey(tar-arr[i]))
                {
                    ans[0]=hm.get(tar-arr[i]);
                    ans[1]=i;
                    return ans;
                }
                else
                {
                    hm.put(arr[i],i);
                }
            }

            return ans;
    }
    public static void main(String[] args)
    {
        int arr[]={5,10,11,7,9,12,19};
        int tar=30;
        
        int res[]=twosum(arr,tar);

        for(int i:res)
        {
            System.out.print(i+" ");
        }

    }
}