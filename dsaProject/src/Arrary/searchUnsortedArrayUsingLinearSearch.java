//Search Unsorted Array Using Linear Search
//Time Complexity: 0(n)
//Auxiliary Space:0(1)

package Arrary;

public class searchUnsortedArrayUsingLinearSearch {

    public static int findElement(int[] arr, int key, int n){
        for(int i = 0; i < n; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 10, 6, 40};
        int n = arr.length;

        //Using last element as serach element
        int key = 40;

        //Function call
        int position = findElement(arr, key, n);

        if(position == -1){
            System.out.print("\nElement not found\n");
        } else {
            System.out.print("\nElement found at Position: " +
                    (position + 1) + "\n");
        }
    }

}
