//Delete Sorted Array Using Binary Search
//Time Complexity : 0(N) worst case as all elements may have to be moved
//Auxiliary Space : O(log N). An implicit stack will be used
package Arrary;

public class deleteSortedArray {

    static int binarySearch(int[] arr, int low, int high, int key){
        if(high<low) return -1;

        int mid = (low + high) / 2;
        if(key == arr[mid]){
            return mid;
        }
        if(key > arr[mid]){
            return binarySearch(arr, (mid + 1), high, key);
        }
        return binarySearch(arr, low, (mid - 1), key);
    }

    static int deleteElement(int[] arr, int n, int key){
        int pos = binarySearch(arr, 0, n-1, key);

        if(pos == -1){
            System.out.println("\nElement not found");
            return n;
        }

        int i;
        for(i=pos; i < n-1; i++){
            arr[i] = arr[i+1];
        }
        return n-1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 30;
        int n = arr.length;

        //Array before deletion
        System.out.println("\nArray before deletion: ");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i]  + " ");
        }

        n = deleteElement(arr, n, key);

        //Array after deletion
        System.out.println("\nArray after deletion: ");
        for(int i=0; i< n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
