package cn.liuw.leet.common;

/**
 * @author liuw
 * @date 2020/10/13
 */
public class ListExchange {

    public ListNode swapPairs(ListNode head) {
        
        if (head == null || head.getNext() == null) {
            return head;
        }
        
        ListNode next = head.getNext();
        
        head.setNext(swapPairs(next.getNext()));
        
        next.setNext(head);
        
        return next;
    }
}
