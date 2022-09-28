package Logica;

import java.util.HashSet;
import java.util.Set;

public class SomaDoisIndicesIgualAZero {

    static Set<Integer> set = new HashSet<>();

    public static Boolean hasZeroSumSubarray(int[] nums){

        set.add(0);
        int sum=0;

        for(int value: nums){
            sum += value;

            if(set.contains(sum)){
                return true;
            }
            set.add(sum);
        }


        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 3,-3 };

        if(hasZeroSumSubarray(nums)){
            System.out.println("Subarray exists");
        }else{
            System.out.println("Subarray does not exist");
        }
    }
}
