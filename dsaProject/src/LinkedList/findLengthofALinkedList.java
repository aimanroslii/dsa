package LinkedList;


public class findLengthofALinkedList {
    public static void main(String[] args) {
        //Initilize object linkedlist
        LinkedList lList = new LinkedList();

        //Create LinkedList
        lList.push(1);
        lList.push(3);
        lList.push(4);

        //Print the total node present
        System.out.print("\nCount of node Iterative is : "
                + lList.findLengthIterative() + "\n");

        //Print the total node present Recursive
        System.out.print("Count of node Recursive is: " +
                lList.getCountRecWrapper()+"\n");
    }
}
