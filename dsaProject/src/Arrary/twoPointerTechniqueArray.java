//Two pointer technique on searching pair
//Should be sort first the array to use this technique
//Time complexity: O(N log(N)) as worst case need to be sorted
//Auxiliary Space: O(1)
package Arrary;

import java.util.Arrays;
import java.util.List;

//time complexity : nlogn better than n2
public class twoPointerTechniqueArray {

    public static int isPairSum(List<Integer> A, int N, int x){
        //represents first pointer
        int i=0;
        //represents second pointer
        int j = N-1;

        while(i < j){
            //If we find a pair
            if(A.get(i) + A.get(j) == x){
                return 1;
            }

            //If sum of elements at current
            //pointers is less, we move towards
            //higher values by doing i++
            else  if (A.get(i) + A.get(j) < x){
                i++;
            }

            //If sum of elements at current
            //pointers is more, we move towards
            //lower values by doing j--
            else j--;
        }
        return 0;
    }
    public static void main(String[] args) {
        //Array declaration
        List<Integer> arr = Arrays.asList(2,3,5,8,9,10,11);

        //value to search
        int val = 17;

        //size of the array
        int arrSize = arr.size();

        //array should be sorted before using the
        //two-pointer technique
        arr.sort(null);

        //Function call
        System.out.println(isPairSum(arr, arrSize, val) != 0);

    }
}
