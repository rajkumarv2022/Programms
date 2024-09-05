public class MinnimunElementArrays {
    public static void main(String[] args)
    {
        int arr[]={2,4,1,5};
        int min=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i])
                min=arr[i];
        }
        System.out.println("Minimum elemet is "+min);
    }
}
