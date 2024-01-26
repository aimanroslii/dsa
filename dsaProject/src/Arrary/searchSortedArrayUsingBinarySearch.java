//Search Sorted Array Using Binary Search
//Time Complexity : 0(log(n))
//Auxiliary Space : 0(log(n)) due to recursive calls
package Arrary;

public class searchSortedArrayUsingBinarySearch {

    //function to implement
    //binary search
    static int binarySearch(int arr[], int low, int high,
                            int key){
        //Base check
        if(high < low) return -1;

        int mid = (low + high) / 2;
        if(key == arr[mid])
            return mid;
        if(key > arr[mid]){
            //remove left half
            return binarySearch(arr, (mid+1), high, key);
        }
        //remove right half
        return binarySearch(arr, low, (mid-1), key);
    }
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10};
        int n, key;
        n = arr.length - 1;
        key = 10;

        //Function call
        System.out.println("\nIndex: " + binarySearch(arr,0, n, key));
    }
}
