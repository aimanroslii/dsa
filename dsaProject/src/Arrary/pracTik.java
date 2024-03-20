package Arrary;

import java.util.Arrays;
import java.util.List;

public class pracTik {

    public static boolean isPairSum(List<Integer> arr,Integer key){

        int i = 0;
        int j = arr.size() - 1;

        while(i < j){
            if(arr.get(i) + arr.get(j) == key){
                return true;
            } else if (arr.get(i) + arr.get(j) < key){
                i++;
            } else {
                j--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        List<Integer> lookUp = Arrays.asList(1,3,5,6,7,23);

        Integer key = 88;

        //need to be sorted
        lookUp.sort(null);

        System.out.println(isPairSum(lookUp,key));

    }
}
