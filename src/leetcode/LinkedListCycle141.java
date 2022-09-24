package leetcode;

import java.util.HashSet;

public class LinkedListCycle141 {
    public static void main(String[] args) {
        ListNode head = new ListNode(3, new ListNode(2, new ListNode(2, new ListNode(0, new ListNode(4)))));
        /**method 1
         * just like two people run in the playground.
         * when faster one can chase the slow one,
         * this must be a circle
         * */
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null){//pay attention to this
            fast = fast.next.next;
            slow =slow.next;
            if (fast == slow){

            }
        }

        /**method 2
         *put the iterated node in the hashset, if we fund it again
         *it is the circle node
         */

//        HashSet<Object> set = new HashSet<>();
//        while (curr != null){
//            if (set.contains(curr.val)){
//                System.out.println("false");
//            }
//            set.add(curr.val);
//            curr = curr.next;
//        }

/**method.3
 * The number of the nodes in the list is in the range [0, 10e4]
 * so if we Iterate 100001 times, let head point to the tail's next
 * if head equals null the list must not be circle
 * this method is fun
 */
//        public boolean hasCycle(ListNode head) {
//            int i = 0;
//            for(i = 0;i<10001;i++){
//                if(head == null){
//                    return false;
//                }
//                head = head.next;
//            }
//            return true;
//        }
    }
}
