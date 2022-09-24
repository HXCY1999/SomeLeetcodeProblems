package leetcode;

public class IntersLinkedLists160 {
    public static void main(String[] args) {
        ListNode headA = new ListNode(2, new ListNode(2, new ListNode(2, new ListNode(0, new ListNode(4)))));
        ListNode headB = new ListNode(2, new ListNode(2, new ListNode(2, new ListNode(0))));
        ListNode p1 = headA;
        ListNode p2 = headB;
        while (p1 != p2){
            if (p1 == null){
                p1 = headA;
            }else {
                p1 = p1.next;
            }
            if (p2 == null){
                p2 = headB;
            }else {
                p2 = p2.next;
            }
        }
        System.out.println(p1);

    }
}
