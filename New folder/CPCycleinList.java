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

public class CPCycleinList {

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
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        l5.next=l6;
        l6.next=l7;
        l7.next=l8;
        l8.next=l9;
        l9.next=l4;

        // if(isContainloop(l1)!=null)
        //     System.out.println(true);
        // else
        //     System.out.println(false);
        
       // System.out.println(looppos(l1));

       //System.out.println(lenofloop(l1));

       System.out.println(tailoflength(l1));

    }
    public static void main(String[] args)
    {
        run();
    }
}
