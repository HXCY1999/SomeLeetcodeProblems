package leetcode;

public class Median4 {
    public static void main(String[] args) {
        int[] A = {1, 2};
        int[] B = {3,4};
        int[] AB = new int[A.length+B.length];
        AB = mergedArray(A,B,AB);
        int length = AB.length;

        if (AB.length % 2 == 0){//oven 偶数
            System.out.println((AB[length/2]+AB[length/2-1])/2);


        }if (AB.length % 2 ==1){//odd
            System.out.println(AB[length/2]);
        }
    }

    private static int[] mergedArray(int[] A, int[] B, int[] AB) {
        int i = 0,j = 0,k=0;
        //这边注释这么写会报错，B遍历完之后J还会+1，这么写会超出范围
//        while (i < A.length || j < B.length){
        while (i < A.length && j < B.length){
            if (A[i] <= B[j]){
                AB[k] = A[i];
                k++; i++;
            }
            else {
                AB[k] = B[j];
                k++;j++;
            }
        }
        while (i<A.length){//A还没遍历完，B遍历完了
            AB[k]=A[i];
            k++;i++;
        }
        while (j< B.length){//B还没遍历完，A遍历完了
            AB[k]=B[j];
            k++;j++;
        }
        return AB;
    }
}
