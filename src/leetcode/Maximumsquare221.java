package leetcode;

public class Maximumsquare221 {
    public static void main(String[] args) {
        char[][] matrix = new char[][]{{'1','0','1','1','0'},{'1','0','1','1','0'}};
        int ans = 0;int current = 0;

        for(int i = 0; i < matrix.length;i++){
            if(matrix[i][0] == '1') ans = 1;
        }

        for(int i = 0; i < matrix[0].length; i++){
            if(matrix[0][i] == '1') ans = 1;
        }

        for(int i = 1; i < matrix.length; i++){
            for(int j = 1;j < matrix[0].length;j++){
                if(matrix[i][j] != '0'){
                    int left = matrix[i][j-1] - '0';
                    int up = matrix[i-1][j] - '0';
                    int upLeft = matrix[i-1][j-1] - '0';

                    current = Math.min(left,Math.min(up,upLeft)) + 1;
                    ans = Math.max(ans,current);
                    matrix[i][j] =(char)(current+'0');
                }
            }
        }
        System.out.println(ans);
    }
}
