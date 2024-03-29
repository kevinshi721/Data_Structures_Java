/**
 * @author kevinshi721
 * @date 8/5/19 8:45 PM
 */
public class Solution {

    public ListNode removeElements(ListNode head, int val) {

        while (head != null && head.val == val) {
            ListNode delNode = head;
            head = head.next;
            delNode.next = null;
        }

        if (head == null)
            return head;

        ListNode prev = head;
        while (prev.next != null) {
            if (prev.next.val == val) {
                ListNode delNode = prev.next;
                prev.next = delNode.next;
                delNode.next = null;
            } else {
                prev = prev.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 3, 5, 6};
        ListNode head = new ListNode(nums);
        System.out.println(head);

        ListNode res = (new Solution()).removeElements(head, 3);
        System.out.println(res);
    }
}
