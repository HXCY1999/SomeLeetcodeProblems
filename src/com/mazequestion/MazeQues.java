package com.mazequestion;

public class MazeQues {
    public static void main(String[] args) {
        int[][] map = new int[8][7];
        //set bound of the maze
        for (int i=0;i<7;i++){
            //set the first line and seventh line
            map[0][i] = 1;
            map[7][i] = 1;
        }
        //set left and right bound of maze
        for (int j=0;j<8;j++){
            map[j][0] = 1;
            map[j][6] = 1;
        }
        map[3][1]=1;map[3][2]=1;
        //print the maze
        System.out.println("the figure of maze:");
        for (int i =0;i<8;i++){
            for (int j = 0; j <7 ; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();

        }
        //递归来寻路
    }
    //找到【6】【5】就完成了
    //2-该点可以走，3-该点走过，不通
    public static  boolean seyWay(int[][] map,int i,int j){
        if (map[6][5] == 2){ //通路已经找到
            return true;
        }else {
            if (map[i][j] ==0){

            }
        }

    return false;

    }
}
