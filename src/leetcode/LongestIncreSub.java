package leetcode;

public class LongestIncreSub {
    public static void main(String[] args) {
        int[] nums = new int[]{10,9,2,5,3,7,101,18};
        int maxcount = 0;
        int premax = 0;
        int count = 0;
        for(int i=2;i<nums.length;i++){
            premax = nums[i];
            count =1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j] > premax){
                    premax=nums[j];
                    count++;
                    System.out.print(premax+"\t");
                }
                System.out.println();
            }
            maxcount=Math.max(maxcount,count);
        }
        System.out.println(maxcount);
    }
}
