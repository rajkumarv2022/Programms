import java.util.*;

public class CPNoofSubArraySumisZero {
    public static void main(String[] args)
    {
        int arr[]={1,2,-2,-1,0,5};

        HashMap<Integer,Integer>hm=new HashMap<>();

        int psum=0;
        int c=0;

        hm.put(0,1);

        for(int i=0;i<arr.length;i++)
        {
            psum=psum+arr[i];

            if(hm.containsKey(psum))
            {
                c=c+hm.get(psum);
            }

            hm.put(psum,hm.getOrDefault(psum,0)+1);
        }

        System.out.println(c);

    }
}
