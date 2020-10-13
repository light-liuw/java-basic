package cn.liuw.leet.common;

/**
 * @author liuw
 * @date 2020/10/13
 */
public class Test {

    public static void main(String[] args) {

        int[] a = {2, 1, 4, 3};

        ListNode ln1 = new ListNode();
        ListNode ln2 = new ListNode();
        ListNode ln3 = new ListNode();
        ListNode ln4 = new ListNode();
        
        ln1.setVal(2);
        ln1.setNext(ln2);
        
        ln2.setVal(1);
        ln2.setNext(ln3);
        
        ln3.setVal(4);
        ln3.setNext(ln4);
        
        ln4.setVal(3);
        
        ListNode node = ln1;
        
        while (node != null) {
            System.out.println(node.getVal());
            node = node.getNext();
        }

        System.out.println("=========================");
        
        ListNode b = swapPairs(ln1);

        ListNode nodeb = b;
        while (nodeb != null) {
            System.out.println(nodeb.getVal());
            nodeb = nodeb.getNext();
        }
    }

    public static ListNode swapPairs(ListNode head) {

        if (head == null || head.getNext() == null) {
            return head;
        }

        ListNode next = head.getNext();

        head.setNext(swapPairs(next.getNext()));

        next.setNext(head);

        return next;
    }
}
