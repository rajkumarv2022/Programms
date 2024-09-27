class Node
{
    int data;
    Node next;

    Node(int data,Node next)
    {
        this.data=data;
        this.next=next;
    }
}


public class AllProgramofLL {

    public static int mid_ele(Node li)
    {
        Node fp=li;
        Node sp=li;

        while(fp!=null&&fp.next!=null)
        {
            fp=fp.next.next;
            sp=sp.next;
        }
        return sp.data;
    }
    public static Node rev(Node cur)
    {
        Node prev=null;
        Node next=cur.next;

        while(cur!=null)
        {
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }

    
    public static void display(Node ptr)
    {
        while(ptr!=null)
        {
            System.out.println(ptr.data);
            ptr=ptr.next;
        }
        System.out.println();
    }

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

    public static void run()
    {
        Node l1=new Node(2,null);
        Node l2=new Node(4,null);
        Node l3=new Node(6,null);
        Node l4=new Node(7,null);
        Node l5=new Node(9,null);
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;

        // display(l1);
        // Node nh=rev(l1);
        // display(nh);
        // rev(nh);
        // display(l1);
        //System.out.println("Middle Element : "+(mid_ele(l1)));
        // System.out.println(length(l1));
       
    }
    public static void main(String[] args)
    {
        run();
    }
}

