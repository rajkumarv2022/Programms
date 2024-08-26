// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int sum=0;
        int sq=1;
        int num=1010;
        
        while(num>0)
        {
            if(num%10==1)
            {
                sum=sum+sq;
            }
            sq=sq*2;
            num=num/10;
        }
        System.out.print(sum);
    }
}