package cn.liuw.leet.object;

/**
 * Definition for singly-linked list.
 *
 * @author liuw
 * @date 2020/10/13
 */
public class ListNode {

    public int value;

    public ListNode next;

    public ListNode() {
    }

    public ListNode(int value) {
        this.value = value;
    }

    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }
}
