package leetcode;

public class ReverLinkedList206 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4))));
//        ListNode reverse = new ListNode();
//        ListNode next;
//
//        while (head != null ){
//            next = head.next;
//            head.next = reverse.next;
//            reverse.next = head;
//                head =next;
//        }
//        System.out.println(reverse);
        ListNode curr = head;
        ListNode pre = null;
        while (curr != null){
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        System.out.print(pre);
    }

}