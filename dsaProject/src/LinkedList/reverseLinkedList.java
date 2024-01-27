package LinkedList;

public class reverseLinkedList {

    public static void main(String[] args) {
        LinkedList revList = new LinkedList();

        revList.push(3);
        revList.push(2);
        revList.push(1);

        //Before reverse
        System.out.print("\n Initial Linked List : ");
        revList.printList(revList.head);

        //After reverse LinkedList
        revList.head = revList.reverse(revList.head);
        System.out.print("\n After reverse Linked List : ");
        revList.printList(revList.head);
    }
}
