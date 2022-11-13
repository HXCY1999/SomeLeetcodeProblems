package leetcode;

public class RemoveDuplicates83 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1,new ListNode(1,new ListNode(1,new ListNode(2,
                new ListNode(2,new ListNode(3))))));

        ListNode curr = head;
        while (curr != null){
            ListNode next = curr.next;
            if (next == null){
                break;
            }
            if (curr.val == next.val){
                curr.next = next.next;
            }else {
                curr = next;
            }
        }
        System.out.println(head);
    }
}
