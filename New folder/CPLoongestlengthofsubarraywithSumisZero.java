import java.util.*;

public class CPLoongestlengthofsubarraywithSumisZero {
    public static void main(String[] args)
    {
        int arr[]={1,2,-2,-1,0,5};
        HashMap<Integer,Integer>hm=new HashMap<>();

        hm.put(0,-1);
        int psum=0;
        int maxlen=1;
        int curlen=1;

        for(int i=0;i<arr.length;i++)
        {
            psum=psum+arr[i];

            if(hm.containsKey(psum))
            {
                curlen=i-hm.get(psum);
                maxlen=Math.max(maxlen,curlen);
            }
            else
            {
                hm.put(psum,i);
            }
            
        }

        System.out.println(maxlen);
    }
}
