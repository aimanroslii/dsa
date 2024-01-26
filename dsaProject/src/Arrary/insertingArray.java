package Arrary;

public class insertingArray {

    //Create operation on insert key at End
    static int insertSorted(int arr[], int n, int key,
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

        n = insertSorted(arr, n, key, capacity);

        //After insert key
        System.out.print("\nAfter Insertion: ");
        for (i=0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        //-------------------------------------

//        int arr1[] = new int[15];
//        arr1[0] = 2;

    }
}
