public class ArrayLinearSearch {
    public static void main(String[] args)
    {

        int n=5;
        int arr[]={1,2,3,5,6,7};
        int flag=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==n)
            { 
                System.out.println("Element was found");
                flag=1;
            }
        }
        
        if(flag==0)
        {
            System.out.println("Element was not found");
        }
    }
}
