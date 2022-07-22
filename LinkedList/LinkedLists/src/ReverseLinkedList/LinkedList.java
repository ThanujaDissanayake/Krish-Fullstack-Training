package ReverseLinkedList;
import java.util.ArrayList;

public class LinkedList {
    Node head;
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    //Insert data node to end of the singly list
    public void addNode(int data){

        Node new_data=new Node(data);
        Node current=head;

        if(head==null){
            head=new_data;
        }
        else {
            while (current.next!=null){
                current=current.next;
            }
            current.next=new_data;
        }

    }

    //Get elements from the list
    public void getData(){
        Node current=head;

        if(head==null){
            System.out.println("Empty List");

        }
        else {
            while (current!=null){
                System.out.print(current.data + " ");
                current=current.next;
            }
        }
    }

    //Reverse the linked list
    public  void reverseList(){
        Node current=head;
        Node prev=null;
        Node next=null;

        if (head==null){
            System.out.println("Empty List");
        }
        else {
            while (current!=null){
                next=current.next;
                current.next=prev;
                prev=current;
                head=current;
                current=next;
            }
        }
    }


}
