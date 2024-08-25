// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        //-b+ sqrt()/2a
        int a=1;
        int b=7;
        int c=12;
        double sq=(b*b)-(4*a*c);
        if(sq<0)
        {
            System.out.println("Imaginary");
        }
        else
        {
            double sqrt=Math.sqrt(sq);
            int root1=(int)(-b+sqrt)/(2*a);
            int root2=(int)(-b-sqrt)/(2*a);
            System.out.print(root1+" "+root2);
        }

    }
}