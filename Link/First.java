package Link;
public class First {
    static Node head;
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data=data;
            this.next=null;
        }
    }
    public void insertbegin(int data){
        Node newnode = new Node(data);
        if(head==null) {
            head=newnode;
        } else {
            newnode.next=head;
            head=newnode;
        }
    }
    public static void printlist() {
        if(head==null) {
            System.out.println("NULL");
        }
        Node q=head;
        while(q!=null) {
            System.out.print(q.data+" ");
            q=q.next;
        }
        System.out.println();
    }
    public void insertend(int data) {
        Node newnode = new Node(data);
        if(head == null) {
            head=newnode;
        } else {
            Node q=head;
            while(q.next!=null) {
                q=q.next;
            }
            q.next=newnode;
        }
    }
    public void insertbet(int n,int data) {
        Node newnode= new Node(data);
        if(head==null) {
            head=newnode;
        } else {
            Node q=head;
            for(int i=1;i<n-1;i++) {
                q=q.next;
                if(q==null) {
                    System.out.println("Inserting position is outside the Linked list");
                    break;
                }
            }
            newnode.next=q.next;
            q.next=newnode;
        }
    }
    public void deletebeg()
    {
        if(head==null) {}
        else {
            head=head.next;
        }
    }
    public void deletend() {
        if(head==null) {}
        else {
            Node q=head;
            while(q.next.next!=null) {
                q=q.next;
            }
            q.next=null;
        }
    }
    public void deleteat(int n) {
        if(head==null) {}
        else {
            Node q=head;
            for(int i=1;i<n-1;i++) {
                q=q.next;
            }
            q.next=q.next.next;
        }
    }
    public void reverse() {
        Node q,pre,nex;
        q=head;
        pre=nex=null;
        while(q!=null) {
            nex=q.next;
            q.next=pre;
            pre=q;
            q=nex;
        }
        head=pre;
    }
    public static void main(String[] args) {
        First list=new First();
        list.insertbegin(1);
        list.insertbegin(2);
        list.insertbegin(3);
        list.insertbegin(4);
        list.insertbegin(5);
        printlist()        list.reverse();
        printlist();
    }
}