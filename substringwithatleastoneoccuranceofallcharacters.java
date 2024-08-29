import java.util.HashSet;
import java.util.Set;

public class substringwithatleastoneoccuranceofallcharacters{
    public static void fun(String str)
    {
        Set<Character> cmp = new HashSet<>();

        for(char s:str.toCharArray())
        {
            cmp.add(s);
        }

        int reqlen=cmp.size();

        Set<Character> s=new HashSet<Character>();


        
       for(int i=0;i<str.length();i++)
       {
        s.clear();
        for(int j=i;j<str.length();j++)
        {
            s.add(str.charAt(j));
            if(s.size()==reqlen)
            {
                System.out.println(str.substring(i,j+1));
            }
        }

       }

    }
    public static void main(String[] args)
    {
        String str="aaabccbbcddabcd";

        fun(str);
    }

}