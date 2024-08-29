public class printallsubsequenceofanstring {
    public static void printsubseq(String str,String curs,int indx)
    {
        if(indx==str.length())
        {
            System.out.println(curs);
            return;
        }

        printsubseq(str,curs+str.charAt(indx),indx+1);
        printsubseq(str,curs,indx+1);
    }
    public static void main(String[] args)
    {
        String str="abc";
        String curs="";
        printsubseq(str,curs,0);
        System.out.println((int)Math.pow(2,str.length()));
    }
}
