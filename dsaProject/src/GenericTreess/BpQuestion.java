package GenericTreess;

import java.io.InvalidClassException;
import java.io.InvalidObjectException;
import java.util.Map;
import java.util.*;
public class BpQuestion {
    public static class stringUtil{
        public static final String ERROR_THROWN = "Error Thrown!";
    }
    public static void main(String[] args) {
        Map<String, Node> graph = new HashMap<>();

        String[] lines = {
                "a->b",
                "r->s",
                "b->c",
                "x->c",
                "q->r",
                "y->x",
                "w->z",
                "a, q, w",
                "a, c, r",
                "y, z, a, r",
                "a, w"
        };

        for (String line : lines) {
            System.out.println("Line = " + line);
            if (line.contains(",")) {
                String returnValue;
                try {
                    boolean intersectionFound = LinkedListIntersection(Arrays.stream(line.split(",")).map(String::trim).toArray(String[]::new), graph);
                    returnValue = intersectionFound ? "true" : "false";
                } catch (RuntimeException ex) {
                    if (ex.getMessage().equals("Cycle detected.")) {
                        returnValue = stringUtil.ERROR_THROWN;
                    } else {
                        returnValue = null; // Handle other exceptions
                    }
                }
                System.out.println(returnValue);
            } else if (line.contains("->")) {
                String[] splitStr = line.split("->", -1);
                String current = splitStr[0];
                String next = splitStr[1];

                // Check if the parent node already exists
                Node nextNode = graph.get(next);
                if (nextNode == null) {
                    // If it doesn't, add it so we can reference the object
                    nextNode = new Node(next, null);
                    graph.put(next, nextNode);
                }

                // Check if the child node already exists
                Node currentNode = graph.get(current);
                if (currentNode != null) {
                    // If it does, update the existing object
                    currentNode.next = nextNode;
                } else {
                    graph.put(current, new Node(current, nextNode));
                }
            }
        }
    }

    private static boolean LinkedListIntersection(String[] nodeGroup, Map<String, Node> graph) {
        Set<String> allTraversedNodes = new HashSet<>();

        for (String value : nodeGroup) {
            Set<String> currentTraversedNodes = new HashSet<>();

            Node node = graph.get(value);
            if (node == null) {
                continue;
            }

            while (node != null) {
                if (allTraversedNodes.contains(node.value)) {
                    return true;
                }

                // Don't follow cycles
                if (currentTraversedNodes.contains(node.next != null ? node.next.value : null)) {
                    throw new RuntimeException("Cycle detected.");
                }

                allTraversedNodes.add(node.value);
                currentTraversedNodes.add(node.value);

                node = node.next;
            }
        }

        return false;
    }

    static class Node {
        public String value;
        public Node next;

        public Node(String value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
