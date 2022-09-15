package leetcode;

import javax.xml.soap.Node;

public class AddTwoNumbers2 {
    public static void main(String[] args) {
//        ListNode l1 = new ListNode(9,new ListNode(9,new ListNode(9)));
//        ListNode l2 = new ListNode(9,new ListNode(9,new ListNode(9)));
//        ListNode dummy = new ListNode();
//        ListNode temp = dummy;
//
//        int c = 0;
//        while(l1 != null || l2 != null || c == 1){
//            int sum = 0;
//            if(l1 != null){
//                sum = sum + l1.val;
//                l1 = l1.next;
//            }
//            if(l2 != null){
//                sum = sum + l2.val;
//                l2 = l2.next;
//            }
//            sum = sum + c;
//            c = sum/10;
//            ListNode node = new ListNode(sum % 10);
//            temp.next = node;
//            temp = temp.next;
//        }
////        return dummy.next;
//        System.out.println(dummy);

        ListNode l1 = new ListNode(9,new ListNode(9,new ListNode(9)));
        ListNode l2 = new ListNode(9,new ListNode(9,new ListNode(9)));

        ListNode dummy = new ListNode();
        ListNode curr = dummy;
/*反着相加，反着进位，所以可以直接加然后下一位进位
用一个carry当作进位标志，进位时加上carry
当一个空就只加另外一个
当两个都空但是还是需要进一位时，就直接new一个节点把进位放进去
 * */
        /**
         * dummy 是用来表示节点的，
         * dummy赋值给current，因为需要靠current来遍历，
         * current作为指针一直变的，所以就不能用来输出了
         * 所以需要一个dummy输出，
         * */
        int carry = 0;
        while (l1 != null || l2!=null ){
            int sum = 0;
            if (l1 != null){
                sum = sum + l1.val;
                l1 = l1.next;
            }
            if (l2 !=null ){
                sum = sum +l2.val;
                l2 = l2.next;
            }

            sum = sum + carry;
            carry = sum/10;

            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }
        if (carry > 0){
            curr.next = new ListNode(carry);
        }
        System.out.println(dummy.next);


    }
}
   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

       @Override
       public String toString() {
           return "ListNode{" +
                   "val=" + val +
                   ", next=" + next +
                   '}';
       }
   }
