package leetcode;

public class CommonSubsequence1143 {
    public static void main(String[] args) {
        String text1 = "ezupkr", text2 = "ubmrapg";
        int result =0;
        for(int i=0;i<text1.length();i++){
            for(int j=0;j<text2.length();j++){
                if(text1.charAt(i) == text2.charAt(j)){
                    result++;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
