import java.util.*;
public class CPboating0follwedby1 {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);

        int arr[]={1,1,1,1,0,1,1,0,0,1,0};

        int i=0;
        int j=0;

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
        }

        for(int k:arr)
        {
            System.out.print(k+" ");
        }
    }
}
