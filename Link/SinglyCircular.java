package Link;
public class SinglyCircular {
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
            head.next=head;
        } else {
            newnode.next=head;
            Node q=head.next;
            while(q.next!=head) {
                q=q.next;
            }
            q.next=newnode;
            head=newnode; 
        }
    }
    public static void printlist() {
        if(head==null) {
            System.out.println("NULL");
        } else {
            System.out.print(head.data+" ");
            Node q=head.next;
            while(q!=head) {
                System.out.print(q.data+" ");
                q=q.next;
            }
            System.out.println();
        }
    }
    public void insertend(int data) {
        Node newnode = new Node(data);
        if(head == null) {
            head=newnode;
        } else {
            Node q=head;
            while(q.next!=head) {
                q=q.next;
            }
            q.next=newnode;
            newnode.next=head;
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
            Node q=head;
            while(q.next!=head) {
                q=q.next;
            }
            q.next=head.next;
            head=head.next;
        }
    }
    public void deletend() {
        if(head==null) {}
        else {
            Node q=head;
            while(q.next.next!=head) {
                q=q.next;
            }
            q.next=head;
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
        Node q=head,pre,nex;
        while(q.next!=head) {
            q=q.next;
        }
        pre=q;
        q=head;
        do{
            nex=q.next;
            q.next=pre;
            pre=q;
            q=nex;
        }while(q!=head);
        head=pre;
    }
        public static void main(String[] args) {
        SinglyCircular list=new SinglyCircular();
        list.insertbegin(1);
        list.insertbegin(2);
        list.insertbegin(3);
        list.insertbegin(4);
        list.insertbegin(5);
        list.insertbegin(6);
        printlist();
        list.reverse();
        printlist();
    }
}