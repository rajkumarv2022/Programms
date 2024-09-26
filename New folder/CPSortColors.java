public class CPSortColors {
    public static void main(String[] args)
    {
        int arr[]={2,0,2,1,1,0,2,0,1,2,1,1,1,0,0,0,2,2,1,2};  // 0 0 2 1 1 2 // 0 0 1 1 2 2 // 

        int i=0;
        int j=0;
        int k=arr.length-1;

        // while(i<=k)
        // {
        //     if(arr[i]==0)
        //     {
        //         int temp=arr[i];
        //         arr[i]=arr[j];
        //         arr[j]=temp;
        //         i++;
        //         j++;
        //     }
        //     else if(arr[i]==1)
        //     {
        //         i++;
        //     }
        //     else
        //     {
        //         int temp=arr[i];
        //         arr[i]=arr[k];
        //         arr[k]=temp;
        //         k--;     
        //     }
        
        //   //  System.out.print(arr[j-1]+" ");
        // }

        while(j<arr.length)
        {
            if(arr[j]==0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
           j++;
        
          //  System.out.print(arr[j-1]+" ");
        }

        System.out.println("\n"+i+" "+j);

        for(int l:arr)
        {
            System.out.print(l+" ");
        }
    }
}
