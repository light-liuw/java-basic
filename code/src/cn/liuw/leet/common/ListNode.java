package cn.liuw.leet.common;

/**
 * Definition for singly-linked list.
 * 
 * @author liuw
 * @date 2020/10/13
 */
public class ListNode {

    /**
     * 值
     */
    int val;

    /**
     * 下一节点
     */
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
