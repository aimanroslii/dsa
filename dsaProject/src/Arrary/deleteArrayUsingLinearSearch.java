//Delete Unsorted Array using Linear Search
//Time Complexity : 0(N)
//Auxiliary Space : O(1)
package Arrary;

public class deleteArrayUsingLinearSearch {

    public static int findElement(int[] arr, int arrayLength,
                           int k){
        for(int i = 0; i < arrayLength; i++){
            if(arr[i] == k){
                return i;
            }
        }
        return -1;
    }

    public static int deleteElement(int[] arr, int n, int key){
        int pos = findElement(arr, n, key);

        if(pos == -1){
            System.out.println("\nElement not found!!");
            return n;
        }

        for(int i = pos; i < n-1; i++){
            arr[i] = arr[i+1];
        }
        return (n-1);
    }
    public static void main(String[] args) {
        int i;
        int[] arr = {10, 50, 30, 40, 20};

        int n = arr.length;
        int key = 222;

        System.out.println("\nArray before deletion");
        for(i=0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        n = deleteElement(arr, n, key);

        System.out.println("\nArray after deletion");
        for(i=0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
