public class factusingrec {
        public static int fun(int n)
        {
            if(n==1)
            {
            return 1;
            }
            // System.out.println(n);
            int rec= fun(n-1);
            // System.out.println(n);
            int rec_ans=rec*n;
            return rec_ans;
        }
        public static void main(String[] args)
        {
            int n=5;
            System.out.println(fun(5));
        }
    
}
