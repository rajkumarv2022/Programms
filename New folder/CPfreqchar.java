import java.util.*;

public class CPfreqchar {
    public static void main(String[] args)
    {
        String str="aaaabbaabbcdrfffe";
        HashMap<Character,Integer> hm=new HashMap<>();

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }

        char ans='\0';

        int max=1;

        for(char i:hm.keySet())
        {
            if(hm.get(i)>max)
            {
                max=hm.get(i);
                ans=i;
            }
        }

        System.out.println(ans);

    }
}
