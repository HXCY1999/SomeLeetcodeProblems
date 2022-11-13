package leetcode;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s =
                "cbbd";

        int oddSubLength = 0;
        int ovenSubLength = 0;
        int start =0;int end = 0;
        int maxLength = 0;
        for(int i=0;i<s.length();i++){
            ovenSubLength = extendByCenter(s,i,i);
            oddSubLength = extendByCenter(s,i,i+1);
            if(ovenSubLength > maxLength){//奇数偶数这边写反了
                start = i- ovenSubLength/2;
                end = i + ovenSubLength/2;
                maxLength = ovenSubLength;
            }
            if(oddSubLength > maxLength){
                start = i- oddSubLength/2;
                end = i -1 + oddSubLength/2;
                maxLength = oddSubLength;
            }
        }
        s.substring(start,end+1);
    }
    private static int extendByCenter(String s, int low, int high){
        int subLength =0;
        while(low>=0 && high<s.length() &&
                s.charAt(low) == s.charAt(high)){
            subLength = high - low + 1;
            low--;
            high++;
        }
        return subLength;
    }
    }

