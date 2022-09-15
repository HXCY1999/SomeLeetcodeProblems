package leetcode;

public class ReverseK25 {
    public static void main(String[] args) {
        int k=2;
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));

        head = reverseNodeByK(head,k);
        System.out.println(head);

    }
    public static ListNode reverseNodeByK(ListNode head,int k){
        if (head.next == null || head ==null){
            return head;
        }
        ListNode curr = head;
        int count = 0;
        while (curr != null && count !=k) {
            curr = curr.next;
            count++;
        }
        if (count == k){
            curr = reverseNodeByK(curr, k);
            while (count-- > 0){
                ListNode next = head.next;
                head.next = curr;
                curr = head;
                head = next;
            }
            head = curr;
        }
        return head;
    }

}
