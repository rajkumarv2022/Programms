// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {

    public static void main(String[] args) {
       
        int arr1[]={1,2,5,4};
        int arr2[]={5,9,7,8};
        int ans[]=new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int indx=-1;
        while(i<arr1.length && j<arr2.length)
        {
            
            if(arr1[i]<arr2[j])
            {
                indx++;
                ans[indx]=arr1[i];
                i++;
            }
            else
            {
                indx++;
                ans[indx]=arr2[j];
                j++;
            }
        }
        while(i<arr1.length)
        {
            indx++;
            ans[indx]=arr1[i];
            i++;
        }
        while(j<arr2.length)
        {
            indx++;
            ans[indx]=arr2[j];
            j++;
        }
        
      for(int k:ans)
      System.out.print(k+" ");
    }
}