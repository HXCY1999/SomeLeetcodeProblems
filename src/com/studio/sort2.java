package com.studio;

import java.util.HashMap;

public class sort2 {
    public static void main(String[] args) {
        int[] nums1 =new int[]{1,2,3,0,0,0};
        int[] nums2 =new int[]{2,5,6};
        int i=0;int j=0;int k=0;
        int[] res = new int[nums1.length];
        while(i<nums1.length - nums2.length || j< nums2.length){
            if (i<nums1.length - nums2.length && j< nums2.length) {
                if (nums1[i] < nums2[j]) {
                    res[k] = nums1[i];
                    i++;
                    k++;
                } else {
                    res[k] = nums2[j];
                    j++;
                    k++;
                }
            }else if(i< nums1.length - nums2.length){
                res[k] = nums1[i];
                i++;
                k++;
            }else if(j<nums2.length){
                res[k] = nums2[j];
                j++;
                k++;
            }

        }
        HashMap<Integer, Integer> map = new HashMap<>();
        nums1 = res;
            for (int n:
             nums1) {
            System.out.print(n);
        }

        // while(i<nums1.length){
        //     res[k] = nums1[i];
        //         i++;k++;
        // }
    }
}
