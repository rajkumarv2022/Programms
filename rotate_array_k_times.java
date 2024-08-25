// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void swap(int arr[],int i,int j)
    {
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
       
        int arr[]={1,2,3,4}; 
        int k=2;
        
        swap(arr,0,arr.length-1);
        swap(arr,0,k-1);
        swap(arr,k,arr.length-1);

        for(int l:arr)
        {
            System.out.print(l+" ");
        }
    }
}