public class printallsubseqofarray {
    public static void printsubseq(int arr[],String curarr,int indx)
    {
        if(indx==arr.length)
        {
            System.out.println(curarr);
            return;
        }

        printsubseq(arr,curarr+arr[indx],indx+1);
        printsubseq(arr,curarr,indx+1);
    }
    public static void main(String[] args)
    {
        int arr[]={1,2,3};
        
        printsubseq(arr,"",0);
    }
}
