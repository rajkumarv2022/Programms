public class carppoling {
    public static boolean cp(int arr[][],int cap)
    {
        int arr1[]=new int[1000];

        for(int i=0;i<arr.length;i++)
        {
                int sp=arr[i][1];
                int ep=arr[i][2];
                int pe=arr[i][0];

                arr1[sp]=arr1[sp]+pe;
                arr1[ep]=arr1[ep]-pe;
        }

        int cp=0;

        for(int i=0;i<arr1.length;i++)
        {
           cp=cp+arr1[i];

           if(cp>cap)
           {
            return false;
           }
        }

        return true;

    }
    public static void main(String[] args)
    {
        int arr[][]={{3,1,5},{3,3,7}};
        System.out.println(cp(arr,5));
    }
}
