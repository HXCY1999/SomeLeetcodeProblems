package leetcode;

import org.junit.Test;

public class FindPath {
    public static void main(String[] args) {
        int[][] obstacleGrid = new int[][]{{0,0,0},{0,1,0},{0,0,0}};

        for(int i = 0; i < obstacleGrid.length; i++){
            if(obstacleGrid[i][0] == 1) break;
            obstacleGrid[i][0] = 1;
        }

        for(int i = 1; i < obstacleGrid[0].length; i++){
            if(obstacleGrid[0][i] == 1) break;
            obstacleGrid[0][i] = 1;
        }

        for(int i = 1; i < obstacleGrid.length; i++){
            for(int j = 1; j < obstacleGrid[0].length;j++){
                if(obstacleGrid[i][j] == 1) {
                    obstacleGrid[i][j] = 0;
                    continue;
                }
                obstacleGrid[i][j] = obstacleGrid[i-1][j] + obstacleGrid[i][j-1];
            }
        }

        System.out.println(obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1]);

    }

    @Test
    public void testMe(){
        int current = 1;
        char c = (char)(current + '0');
        System.out.println();
    }

}
