package com.sparsearray;

public class SparseArray {
    public static void main(String[] args) {
//        crease 2D array
        //0-no 1-black 2-blue
        int chessArray[][] = new int[11][11];
        chessArray[1][2]=1;
        chessArray[2][3]=2;
        chessArray[2][6]=666;
        System.out.println("initial 2D array~");
        for(int row[] :chessArray){
            for (int data : row ) {
                System.out.print(data);
            }
            System.out.println();
        }
        /*transfer 2D-Array TO sparse array*/
        //1.Iterating through arrays get non-zero number
        int sum=0;
        for (int row[] : chessArray){
            for (int data : row){
                if (data != 0){
                    sum++;
                }
            }
        }
        System.out.println("sum="+sum);
        //2。create sparse array
        //sparse array 列是固定的：3
        //三列依次记录了：row，column，data
        int sparseArray[][] = new int[sum+1][3];
        //3.Assign value to sparse array
        //the first row
        sparseArray[0][0] = 11;
        sparseArray[0][1] = 11;
        sparseArray[0][2] = sum;
        //11行11列sum个有效数据
        //count record 第几个非0数据
        int count = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArray[i][j] != 0){
                    count++;
                    sparseArray[count][0] = i;
                    sparseArray[count][1] = j;
                    sparseArray[count][2] = chessArray[i][j];
                }
            }
        }
        //output sparse arrray
        System.out.println("****sparse array result:");
        for (int i = 0; i <sparseArray.length ; i++) {
            System.out.print(sparseArray[i][0]+"\t");
            System.out.print(sparseArray[i][1]+"\t");
            System.out.print(sparseArray[i][2]+"\t\n");
        }
        /*recover sparse array to initial 2D-array*/
        int row = sparseArray[0][0];
        int column = sparseArray[0][1];
        int chessArray2[][] = new int[row][column];

        for (int i = 1; i < sparseArray.length; i++) {
            int chess2row = sparseArray[i][0];
            int chess2col = sparseArray[i][1];
            chessArray2[chess2row][chess2col] = sparseArray[i][2];
        }
        for (int[] row2: chessArray2) {
            for (int data: row2){
                System.out.print(data+"\t");
            }
            System.out.println();
        }






    }
}
