package leetcode;

public class AddStrings415 {
    public static void main(String[] args) {
        String num1 = "11";
        String num2 = "124";
        char c = num1.charAt(0);
        int a = (int)c;
        System.out.println("a="+(c-'0'));

        StringBuilder res = new StringBuilder();
        int i = num1.length()-1;
        int j = num2.length()-1;
        int sum = 0;
        int carry = 0;
        while(i>=0 || j>=0){
            int n1 = (i<0)? 0 : num1.charAt(i) - '0';
            int n2 = (j<0)? 0 : num2.charAt(j) - '0';
            sum = carry + n1+n2;
            res = res.append(sum%10);
            carry = sum/10;
            i--;j--;
        }


        StringBuilder reverse = res.reverse();
        System.out.println(res.reverse());



        String line = "5";
        int lineInt = Integer.parseInt(line);
        int result = lineInt*lineInt;
        System.out.println(result);

        System.out.println("*******");
        System.out.println(3%1);
    }
}
