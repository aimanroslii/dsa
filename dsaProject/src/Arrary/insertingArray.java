package Arrary;

public class insertingArray {

    //Create operation on insert key at End
    static int insertUnsorted(int arr[], int n, int key,
                            int capacity){
        if(n >= capacity)
            return n;

        arr[n] = key;
        return (n + 1);
    }

    //Insert element at any position
    static void insertElement(int arr[], int n, int x,
                              int pos){
        //shift elements to the right
        //which are on the right side of pos
        for (int i = n-1; i>=pos; i--){
            arr[i+1] = arr[i];
        }
        arr[pos] = x;
    }

    //Insert element in sorted array
    static int insertSorted(int[] arr, int n, int key,
                            int capacity){
        //Cannot insert more elements if n i already
        //more than or equal to capacity
        if(n >= capacity) return n;

        int r;
        for(r = n-1; (n>=0 && arr[r] > key); r--){
            arr[r+1] = arr[r];
        }
        arr[r+1] = key;

        return (n+1);
    }

    public static void main(String[] args) {
        //Inserting elements in an Array at the End
        // Time complexity: 0(n)
        // Auxiliary Space : 0(1)
        int[] arr = new int[20];
        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 70;
        int capacity = 20;
        int n = 6;
        int i,key = 26;

        //Before inset key
        System.out.print("\nBefore Insertion: ");
        for (i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        n = insertUnsorted(arr, n, key, capacity);

        //After insert key
        System.out.print("\nAfter Insertion: ");
        for (i=0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        //-------------------------------------

        //Inserting key at specific position
        //Time complexity - 0(N)
        //Auxiliary Space - 0(1)
        int[] arr1 = new int[15];
        arr1[0] = 2;
        arr1[1] = 4;
        arr1[2] = 1;
        arr1[3] = 8;
        arr1[4] = 5;
        int e = 5;
        int x = 10, pos = 2;

        //Before Insertion
        System.out.print("\nBefore Insertion: ");
        for(int j =0; j< e; j++){
            System.out.print(arr1[j] + " ");
        }
        //Inserting key at specific position
        insertElement(arr1,e, x, pos);
        e+=1;

        //After Insertion
        System.out.print("\nAfter Insertion: ");
        for (int j = 0; j < e; j++){
            System.out.print(arr1[j] + " ");
        }

        //----------------------------------------
        //Insert element in sorted array
        //Time complexity : 0(N)
        //Space: 0(1)
        int[] arr2 = new int[20];
        arr2[0] = 12;
        arr2[1] = 16;
        arr2[2] = 20;
        arr2[3] = 40;
        arr2[4] = 50;
        arr2[5] = 70;
        int arrlength = arr.length;
        int size = 6;
        int val = 26;

        //Before Insertion
        System.out.print("\nBefore Insertion: ");
        for(int k = 0; k < size; k++){
            System.out.print(arr2[k] + " ");
        }

        size = insertSorted(arr2, size, val, arrlength);

        //After Insertion
        System.out.print("\nAfter Insertion: ");
        for(int k=0; k<size; k++){
            System.out.print(arr2[k] + " ");
        }
    }
}
