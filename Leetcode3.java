public class Leetcode3 {
    public static void lnss(String str)
    {
        int s=0;
        int e=0;
        int count=0;
        int ans=0;
        int freq[]=new int[132];

        while(e<str.length())
        {
            char sss=str.charAt(e);
            if(freq[sss]==1)
            {
                count++;
            }
            freq[sss]++;
            e++;
            while(count>0)
            {
                char ss=str.charAt(s);
                if(freq[ss]==2)
                {
                    count=0;
                }
                freq[ss]--;
                s++;
            }
            ans=Math.max(ans,(e-s));
        }
        System.out.print(ans);
    }
    public static void main(String[] args)
    {
        String str="abcabcabb";
        lnss(str);
    }
}
