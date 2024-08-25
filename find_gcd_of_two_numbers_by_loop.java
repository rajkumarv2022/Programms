// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void gcd(int num1,int num2)
    {
        int ans=1;
       for(int i=1;i<=num1;i++)
       {
           if(num1%i==0 && num2%i==0)
           ans=i;
       }
       System.out.print(ans);
    }
    public static void main(String[] args) {
        int num1=5;
        int num2=10;
        if(num1<num2)
        {
            int temp=num1;
            num1=num2;
            num2=temp;
        }
       
        gcd(num1,num2);
    }
}