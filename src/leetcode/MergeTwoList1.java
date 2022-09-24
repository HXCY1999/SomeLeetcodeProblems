package leetcode;

public class MergeTwoList1 {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1,new ListNode(2,new ListNode(4)));
        ListNode list2 = new ListNode(1,new ListNode(2,new ListNode(3)));
        ListNode mergeList = new ListNode(0);
        ListNode curr = mergeList;

        while (list1 != null || list2 != null ){

            //both list1 and list2 should not be null then we can compare their value
            // if list2 be null we should also can execute
            if ((list1 != null && list2 !=null && list1.val < list2.val) || list2 == null) {
                    curr.next = list1;
                    list1 = list1.next;
                }
            else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        System.out.println(mergeList.next);
    }
}
