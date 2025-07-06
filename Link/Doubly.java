package Link;
public class Doubly {
    static Node head;
    class Node {
        Node pre;
        int data;
        Node next;
        Node(int data) {
            this.data=data;
            this.pre=null;
            this.next=null;
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
    public void insertbegin(int data){
        Node newnode = new Node(data);
        if(head==null) {
            head=newnode;
        } else {
            newnode.next=head;
            head.pre=newnode;
            head=newnode;
        }
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
            newnode.pre=q;
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
            q.next.pre=newnode;
            q.next=newnode;
            newnode.pre=q;
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
            q.next.pre=q;
            q.next=q.next.next;
        }
    }
    public void reverse() {
        Node q=head;
        Node temp=null;
        while(q!=null) {
            temp=q.pre;
            q.pre=q.next;
            q.next=temp;
            q=q.pre;
        }
        if(temp!=null) {
            head = temp.pre;
        }
    }
    public static void main(String[] args) {
        Doubly l=new Doubly();
        l.insertbegin(1);
        l.insertbegin(2);
        l.insertbegin(3);
        l.insertbegin(4);
        printlist();
        l.reverse();
        printlist();
    }
}
