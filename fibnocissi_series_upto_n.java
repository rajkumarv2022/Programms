// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void fib(int f1,int f2,int n)
    {
        System.out.print("0"+" ");
        n--;
        for(int i=0;i<n;i++)
        {
            int sum=f1+f2;
            System.out.print(sum+" ");
            f1=f2;
            f2=sum;
        }
    }
    public static void main(String[] args) {
        int f1=0;
        int f2=1;
        int n=10;
        fib(f1,f2,n);
    }
}