//PreOrderTraversal in Generic Tree
//Time Complexity : 0(N)
// Auxiliary Space : 0(h)
package GenericTreess;

import java.util.ArrayList;
import java.util.Stack;

public class GTPreorderTraversal {
    //Node structure of K- ary Tree
    static class Node {
        int key;
        //All children are stored in a list
        ArrayList<Node> child;

        Node(int val){
            key = val;
            child = new ArrayList<>();
        }
    }

    //Utility function to print the
    //preorder of the given K-Ary Tree
    static void preOrderTraversal(Node root){
        Stack<Node> stack = new Stack<>();

        //'Preorder' - >contains all the visited nodes
        ArrayList<Integer> preOrder = new ArrayList<>();

        stack.push(root);
        while (!stack.isEmpty()){
            Node temp = stack.peek();
            stack.pop();
            //store teh key in preorder vector(visited list)
            preOrder.add(temp.key);
            //Push all of the child nodes of temp into
            //the stack from right to left.
            for (int i = temp.child.size() - 1; i >= 0; i--){
                stack.push(temp.child.get(i));
            }
        }

        for(int i : preOrder){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // input nodes
        /*
                1
              /  |  \
            /   |   \
            2    3    4
          / \      / | \
          /   \    7  8  9
        5     6
        /    / | \
      10   11 12 13
        */
        Node root = new Node(1);
        root.child.add(new Node(2));
        root.child.add(new Node(3));
        root.child.add(new Node(4));

        root.child.get(0).child.add(new Node(5));
        root.child.get(0).child.get(0).child.add(
                new Node(10));
        root.child.get(0).child.add(new Node(6));
        root.child.get(0).child.get(1).child.add(
                new Node(11));
        root.child.get(0).child.get(1).child.add(
                new Node(12));
        root.child.get(0).child.get(1).child.add(
                new Node(13));
        root.child.get(2).child.add(new Node(7));
        root.child.get(2).child.add(new Node(8));
        root.child.get(2).child.add(new Node(9));

        preOrderTraversal(root);
    }
}
