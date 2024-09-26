import java.util.*;

public class MergeOverLops {
    public static void main(String[] args)
    {
        int arr[][]={{1,4},{5,6},{2,4},{8,10},{11,14},{9,11}};  //{5,6}{2,4} {2,4}{5,6}

       Arrays.sort(arr,(a,b)->{return a[1]-b[1];});

        ArrayList<int[]> al=new ArrayList<>();

        for(int i[]:arr)
        {
            if(al.size()==0)
            {
                al.add(i);
            }
            else
            {
                int li[]=al.get(al.size()-1);

                if(i[0]>li[1])
                {
                    al.add(i);
                }
                else
                {
                   li[1]=Math.max(li[1],i[1]);
                }
            }
        }

        for(int i[]:al)
        {
            for(int j:i)
            {
                System.out.print(j+" ");
            }
        }

    }
}
