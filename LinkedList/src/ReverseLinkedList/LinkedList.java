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
    public void getData(Node node){
        Node current=node;

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

    public boolean isPalindrome(Node node) {
        Node node1=head;
        Node node2=head;

        if(head == null || head.next == null)
            return true;

        System.out.println("Original List:");
        getData(node1);
        System.out.println();

        System.out.println("Reversed List:");
        node2 = reverseList(node2);
        getData(node2);
        while (node2 != null && node1 != null) {
            if(node1.data != node2.data) {
                return false;
            }
            node1 = node1.next;
            node2 = node2.next;
        }
        return true;
    }

    //Reverse the linked list
    public  Node reverseList(Node head){
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
        return prev;
    }


}
