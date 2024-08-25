// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void gcd(int num1,int num2)
    {
        while(num2>0)
        {
            int temp=num2;
            num2=num1%num2;
            num1=temp;
        }
        System.out.print(num1);
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