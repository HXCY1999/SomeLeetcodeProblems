package leetcode;

import java.util.Stack;

public class HouseRobber198 {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,1};

        int[] totalMoeny = new int[nums.length];
        totalMoeny[2] = totalMoeny[0] + totalMoeny[2];
        int max = Math.max(totalMoeny[2],totalMoeny[1]);
        for(int i = 3; i < nums.length; i++){
            totalMoeny[i] = Math.max(totalMoeny[i-2] + totalMoeny[i], totalMoeny[i-3] + totalMoeny[i]);
            max = Math.max(max,totalMoeny[i]);

        }
        System.out.println(max);

        Stack<Object> objects = new Stack<>();
    }
}
