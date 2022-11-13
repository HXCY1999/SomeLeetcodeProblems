package com.studio;

public class sort {
    public static void main(String[] args) {
        int[] a =new int[]{1,2,3};
        int[] b =new int[]{1,2,3};
        int i=0;int j =0;int k=0;
        int[] c = new int[a.length+b.length];
        while (i<a.length && j<b.length){
            if (a[i] < b[j]){
                c[k] = a[i];
                i++;k++;
            }
            else {
                c[k] = b[j];
                j++;k++;
            }

        }
        while (i<a.length){
            c[k] = a[i];
            i++;k++;
        }
        while (j<b.length){
            c[k] = b[j];
            i++;k++;
        }

        for (int l = 0; l <c.length ; l++) {
            System.out.print(c[l]);
        }
    }
}
