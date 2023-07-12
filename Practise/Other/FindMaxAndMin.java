package Practise.Other;

import java.util.Arrays;

public class FindMaxAndMin{
    // Given an array of integers, find the maximum and minimum elements in the array
    public static void main(String[] args) {
        int[] arrayList = {2,3,4,1,5,6,2};
        int n = arrayList.length;
        System.out.println(Arrays.toString(FindMaxMin(n,arrayList)));
    }

    public static int[] FindMaxMin(int n, int[] arrayList){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] minNmax = new int[2];
        int index = 0;
        for(int i=0;i<n;i++){
            if(arrayList[i]>max){
                max = arrayList[i];
            }
            if(arrayList[i]<min){
                min = arrayList[i];
            }
        }
        minNmax[index]+=max;
        index++;
        minNmax[index]+=min;
        return minNmax;
    }
}