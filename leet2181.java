public class Leet2181 {
    public ListNode mergeNodes(ListNode head) {
        ListNode zero = head;
        ListNode p = head.next;
        while(p!= null){
            if(p.val != 0)
            {
                zero.val += p.val;
            } else {
                if(p.next == null)
                    zero.next = null;
                else
                    zero.next = p;

                zero = p;
            }
            p = p.next;
        }
        return head;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}ListNode(int val) { this.val = val; }ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
