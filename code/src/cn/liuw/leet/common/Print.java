package cn.liuw.leet.common;

import cn.liuw.leet.object.ListNode;

/**
 * @author liuw
 * @date 2020/10/20
 */
public class Print {

    /**
     * 根据传入的节点遍历链表
     * 
     * @param node
     */
    public static void printListNode(ListNode node) {
        while (node != null) {
            System.out.println("节点值：" + node.value);
            node = node.next;
        }
    }
}
 