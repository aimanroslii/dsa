//Level Order Traversal using BFS
//Time complexity: O(V) v = height of the tree


package GenericTreess;

import java.util.Vector;

public class GTLevelOrderTraversal{
    //Create Node class
    static class Node {
        public int val;
        public Vector<Node> children;
        public Node(int key){
            val = key;
            children = new Vector<Node>();
        }
    }

    //Utility function to create a new tree node
    static Node newNode(int key){
        Node temp = new Node(key);
        return temp;
    }
    public static void main(String[] args) {

    }
}