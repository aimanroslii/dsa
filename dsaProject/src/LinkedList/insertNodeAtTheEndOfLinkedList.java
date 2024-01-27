//Insert Node at the End/Beginning and given index of LinkedList
//Time complexity : O(1)

//Insert Node at the
package LinkedList;

//Create class Node
class Node {
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        next = null;
    }
}

class LinkedList {
    Node head;
    //Inserts a new node at the front of the list
    void push(int new_data){
        Node newNode = new Node(new_data);
        newNode.next = head;
        head = newNode;
    }

    //Appends a new node at the end of the list
    void append(int new_data){
        Node newNode = new Node(new_data);

        if(head == null){
            head = newNode;
            return;
        }

        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = newNode;
    }

    //This function is in LinkedList class.
    //Insert a new node after the given prev_node. This method
    //is defined inside LinkedList class shown above
    void insertAfter(Node prev_node, int new_data){
        //1.Check if the given Node is null
        if(prev_node == null){
            System.out.println("The given previous node cannot be null");
            return;
        }

        //2.Allocate the Node &
        Node newNode = new Node(new_data);

        //3.put in the data
        newNode.data = new_data;

        //4.Make next of the new Node as next of prev_node
        newNode.next = prev_node.next;

        //5.move to the next of pre_node as new_node
        prev_node.next = newNode;
    }

    //Prints the contents of the linked list
    void printList(Node node){
        node = head;
        while(node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    //Checks whether the value x is present in linkedList
    //Time complexity: 0(N)
    public boolean search(Node head, int x){
        Node current = head; //Initilize current
        while (current != null){
            if(current.data == x){
                return true; //data found
            }
            current = current.next;
        }
        return false;
    }

    //Checks whether the value x is present in LinkedList
    //Time complexity: 0(N)
    public boolean searchRecursive(Node head, int x){
        if(head == null){
            return false;
        }
        if(head.data == x){
            return true;
        }
        return searchRecursive(head.next, x);
    }

    //Iterative approach to find the length of LinkedList
    //Time Complexity : 0(N)
    //Auxiliary Space : O(1)
    public int findLengthIterative(){
        Node temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    //Recursive approach to fimd the length of LinkedList
    //Time complexity : 0(N)
    //Auxiliary Spac : 0(N)
    public int getCountRecursive(Node node){
        //base case
        if(node == null){
            return 0;
        }

        //Count is this node plus rest of the list
        return 1 + getCountRecursive(node.next);
    }

    //Wrapper over getCountRecursive
    public int getCountRecWrapper(){
        return getCountRecursive(head);
    }

    //Reverse LinkedList using Iterative method
    //Time complexity : 0(N)
    //Auxiliary Space : 0(1)
    Node reverse(Node node){
        Node prev = null;
        Node current = node;
        Node next = null;

        //Iterate to reverse the LinkedList
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    //Delete linkedList node at a given position
    void deleteNode(int position){
        //If linked list is empty
        if(head == null){
            return;
        }

        //Store head node
        Node temp = head;

        //if head needs to be removed
        if(position == 0){
            head = temp.next;
            return;
        }

        //Find previous node of the node to be deleted
        for(int i=0; temp != null && i < position - 1; i++){
            temp = temp.next;
        }

        if(temp == null || temp.next == null)
            return;

        Node next = temp.next.next;

        temp.next = next;
    }
}
public class insertNodeAtTheEndOfLinkedList {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.push(6);
        linkedList.push(5);
        linkedList.push(4);
        linkedList.push(3);
        linkedList.push(2);

        System.out.print("\nCreated Linked list is : ");
        linkedList.printList(linkedList.head);

        linkedList.append(1);

        linkedList.insertAfter(linkedList.head.next.next, 7);

        System.out.print("\nAfter inserting 1 at the end: ");
        System.out.print("\nAfter inserting 7 after 4: ");
        linkedList.printList(linkedList.head);
    }
}
