package ReverseLinkedList;
public class LinkedListApplication {

    public static void main(String[] args){

        LinkedList list=new LinkedList();

        LinkedList.Node node1=new LinkedList.Node(2);
        list.addNode(node1.data);
        list.addNode(3);
        list.addNode(4);
        list.addNode(3);
        list.addNode(2);

        if (list.isPalindrome(node1)){
            System.out.println();
            System.out.println("Linked list is a Palindrome");
        }
        else {
            System.out.println();
            System.out.println("Linked list is not a Palindrome");
        }
    }
}
