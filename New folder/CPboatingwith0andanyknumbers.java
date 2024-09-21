class Solution {
public void moveZeroes(int[] arr) {
        int i=0;
        int j=0;

        while(j<arr.length)
        {
            if(arr[j]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
            j++;
        }
    }
}

public class CPboatingwith0andanyknumbers {
    public static void main(String[] args)
    {
        int arr[]={0,0,1,2,3,4,0,0};

        Solution s=new Solution();
        s.moveZeroes(arr);
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
