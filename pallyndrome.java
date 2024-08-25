// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {

    public static void main(String[] args) {
       
        String s="MADAM";
        
        StringBuffer sb=new StringBuffer(s);
        StringBuffer rev=sb.reverse();
        
        String ss=sb.toString();
        String srev=rev.toString();
        
        if(ss.equals(srev))
        System.out.print("pallyndrome");
        else
        System.out.print("Not");
    }
}