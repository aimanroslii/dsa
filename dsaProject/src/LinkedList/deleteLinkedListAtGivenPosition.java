package LinkedList;

public class deleteLinkedListAtGivenPosition {

    public static void main(String[] args) {
        LinkedList llist1 = new LinkedList();

        llist1.push(7);
        llist1.push(1);
        llist1.push(3);
        llist1.push(2);
        llist1.push(8);

        System.out.println("\n Created Linked list is : ");
        llist1.printList(llist1.head);

        //Delete node 2
        llist1.deleteNode(2);

        System.out.println("\nLinked List after Deletion at position: ");
        llist1.printList(llist1.head);
    }
}
