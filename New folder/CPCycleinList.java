// class Node
// {
//     int data;
//     Node next;

//     Node(int data,Node next)
//     {
//         this.data=data;
//         this.next=next;
//     }
// }
import java.util.*;
public class CPCycleinList {


    public static int length(Node h)
    {
        int c=0;

        while(h!=null)
        {
            c++;
            h=h.next;
        }

        return c;
    }

    public static int junction(Node h1,Node h2)
    {
        int len1=length(h1);
        int len2=length(h2);

        Node ptr1=h1;
        Node ptr2=h2;

        int slen=Math.abs(len1-len2);

        if(len1>len2)
        {
            while(slen>0)
            {
                ptr1=ptr1.next;
                slen--;
            }
        }
        else
        {
            while(slen>0)
            {
                ptr2=ptr2.next;
                slen--;
            }
        }

        while(ptr1!=ptr2)
        {
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }

        return ptr1.data;

    }

    public static int tailoflength(Node h)
    {
        if(isContainloop(h)==null)
        {
            return -1;
        }

        Node slow=isContainloop(h);
        Node h1=h;

        while(h1!=slow)
        {
            h1=h1.next;
            slow=slow.next;
        }

        int pos=1;

        slow=h;

        while(slow!=h1)
        {
            pos++;
            slow=slow.next;
        }

        return pos;

    }

    public static int lenofloop(Node h)
    {

        int len=1;
        
        if(isContainloop(h)==null)
        {
            return -1;
        }

        Node slow=isContainloop(h);

        Node h1=h;

        while(h1!=slow)
        {
            h1=h1.next;
            slow=slow.next;
        }

        slow=slow.next;

        while(h1!=slow)
        {
            len++;
            slow=slow.next;
        }

        return len;

    }

    public static int looppos(Node h)
    {
        int pos=1;

        if(isContainloop(h)==null)
        {
            return -1;
        }

        Node h1=h;
        Node slow=isContainloop(h);
        while(h1!=slow)
        {
            pos++;
            h1=h1.next;
            slow=slow.next;
        }

        return pos;

    }

    public static Node isContainloop(Node h)
    {
        Node slow =h;
        Node fast=h;

        while(fast.next!=null&&fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                return slow;
            }
        }
        return null;
    }

    public static void run()
    {
        Node l1=new Node(1,null);
        Node l2=new Node(2,null);
        Node l3=new Node(3,null);
        Node l4=new Node(4,null);
        Node l5=new Node(5,null);
        Node l6=new Node(6,null);
        Node l7=new Node(7,null);
        Node l8=new Node(8,null);
        Node l9=new Node(9,null);

        //junction problem

        Node n1=new Node(10,null);
        Node n2=new Node(11,null);
        Node n3=new Node(12,null);
  
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        l5.next=l6;
        l6.next=l7;
        l7.next=l8;
        l8.next=l9;
        l9.next=null;

        //junction problem

        n1.next=n2;
        n2.next=n3;
        n3.next=l6;

        // if(isContainloop(l1)!=null)
        //     System.out.println(true);
        // else
        //     System.out.println(false);
        
        // System.out.println(looppos(l1));

        //System.out.println(lenofloop(l1));

        //System.out.println(tailoflength(l1));

        //junction problem

        System.out.println(junction(l1,n1));

    }
    public static void main(String[] args)
    {
        run();
    }
}
