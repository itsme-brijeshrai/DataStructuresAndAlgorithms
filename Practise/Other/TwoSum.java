package Practise.Other;

import java.util.Arrays;

public class TwoSum{
    // Given an array of integers nums and an integer target, return indices of the two numbers such that
    // they add up to the target. You may assume that each input would have exactly one solution,
    // and you may not use the same element twice.
    public static void main(String[] args) {
        int[] array = {2,3,4,5,6,7,9};
        int target = 11;
        System.out.println(Arrays.toString(FindIndices(array,target)));
    }

    public static int[] FindIndices(int[] array, int target){
        int[] indices = new int[2];
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]+array[j] == target){
                    indices[0]=i;
                    indices[1]=j;
                    break;
                }
            }
        }
        return indices;
    }
}