public class ArraynoofElementOddEven {
    public static void main(String[] args)
    {
        int oc=0;
        int ec=0;

        int arr[]={1,2,3,4,5,6,7};

        for(int i=0;i<arr.length;i++)
        {
            //using mod operator

            if(arr[i]%2==0)
                ec++;
            else
                oc++;

            //using bitwise operator

            // if((arr[i]&1)==0)
            //     ec++;
            // else
            //     oc++;
        }

        System.out.println("Even count : "+ec+" Odd count : "+oc);
    }
}
