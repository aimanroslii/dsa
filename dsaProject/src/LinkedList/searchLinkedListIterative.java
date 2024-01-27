//Search Node in LinkedList using Iterative method
//Time complexity : O(N)
//Space complexity: 0(1)
package LinkedList;

//class Node {
//    int data;
//    Node next;
//    Node(int d){
//        data = d;
//        next = null;
//    }
//}

public class searchLinkedListIterative {

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        int x = 21;


        /*Use push() operation to construct below list
        * 14->21->30->10 */
        llist.push(10);
        llist.push(30);
        llist.push(21);
        llist.push(14);

        //Function call
        if(llist.search(llist.head,x))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
