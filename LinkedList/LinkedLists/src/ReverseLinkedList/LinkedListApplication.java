package ReverseLinkedList;
public class LinkedListApplication {

    public static void main(String[] args){

        LinkedList list=new LinkedList();

        LinkedList.Node node1=new LinkedList.Node(10);

        list.addNode(node1.data);
        list.addNode(22);
        list.addNode(11);
        list.addNode(32);
        list.addNode(20);

        System.out.println("Linked List Data:");
        list.getData();
        System.out.println();

       list.reverseList();
       System.out.println("Reversed Linked List Data:");
       list.getData();

    }
}
