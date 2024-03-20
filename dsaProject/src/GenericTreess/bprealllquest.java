////Jawapan sebenar BP

//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.nio.charset.StandardCharsets;
//import java.util.*;
//
///**
// * The Main class implements an application that reads lines from the standard input
// * and prints them to the standard output.
// */
//public class Main {
//    /**
//     * Iterate through each line of input.
//     */
//
//    //Code driver
//    public static void main(String[] args) throws IOException {
//        Map<String, Node> graph = new HashMap<>();
//        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
//        BufferedReader in = new BufferedReader(reader);
//        String liness;
//        while ((liness = in.readLine()) != null) {
//
//            if(liness.contains(",")){
//                String returnValue;
//                try{
//                    boolean intersectionFound = LinkedListIntersection(Arrays.stream(liness.split(",")).map(String::trim).toArray(String[]::new), graph);
//                    returnValue = intersectionFound ? "True" : "False";
//                } catch (RuntimeException ex) {
//                    if(ex.getMessage().equals("Cycle detected.")){
//                        returnValue = "Error Thrown!";
//                    } else {
//                        returnValue = null;
//                    }
//                }
//                System.out.println(returnValue);
//
//            } else if(liness.contains("->")){
//                String[] splitStr = liness.split("->", -1);
//                String current = splitStr[0];
//                String next = splitStr[1];
//                //for (String line : splitStr){
//                Node nextNode = graph.get(next);
//                if(nextNode == null){
//                    nextNode = new Node(next, null);
//                    graph.put(next, nextNode);
//                }
//                //Check if the child node already exists
//                Node currentNode = graph.get(current);
//                if(currentNode != null){
//                    currentNode.next = nextNode;
//                } else {
//                    graph.put(current, new Node(current, nextNode));
//                }
//            }
//        }
//    }
//
//
//
//    //Create function to check on LinkedListIntersection
//    private static boolean LinkedListIntersection(String[] nodeGroup, Map<String, Node> graph) {
//        Set<String> allTraversedNodes = new HashSet<>();
//
//        for(String value : nodeGroup){
//            Set<String> currentTraversedNodes = new HashSet<>();
//
//            Node node = graph.get(value);
//            if(node == null){
//                continue;
//            }
//
//            while(node != null){
//                if(allTraversedNodes.contains(node.value)) {
//                    return true;
//                }
//
//                if(currentTraversedNodes.contains(node.next != null ? node.next.value : null)) {
//                    throw new RuntimeException("Cycle detected.");
//                }
//
//                allTraversedNodes.add(node.value);
//                currentTraversedNodes.add(node.value);
//
//                node = node.next;
//            }
//        }
//        return false;
//    }
//
//    //Create Node class
//    static class Node {
//        public String value;
//        public Node next;
//
//        public Node(String value, Node next) {
//            this.value = value;
//            this.next = next;
//        }
//    }
//}
