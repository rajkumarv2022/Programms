// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int arr[]={-6,3,2,4,5,-2,1,9};
        int ps[]=new int[arr.length];
        int l[]={2,3,1};/
        int r[]={5,6,4};
        ps[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            ps[i]=ps[i-1]+arr[i];
        }
        for(int i=0;i<l.length;i++)
        {
            int le=l[i];
            int ri=r[i];
            if(le==0)
            System.out.print(ps[ri]+" ");
            else
            System.out.print(ps[ri]-ps[le-1]+" ");
        }
    }
}