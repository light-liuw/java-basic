package cn.liuw.leet.solution10;

import cn.liuw.leet.common.Init;
import cn.liuw.leet.object.ListNode;
import cn.liuw.leet.common.Print;

import java.util.ArrayList;
import java.util.List;

/**
 * 143. 重排链表
 * <p>
 * 给定一个单链表 L：L0→L1→…→Ln-1→Ln ，
 * 将其重新排列后变为： L0→Ln→L1→Ln-1→L2→Ln-2→…
 * <p>
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 * <p>
 * 示例 1:
 * 给定链表 1->2->3->4, 重新排列为 1->4->2->3.
 * <p>
 * 示例 2:
 * 示例 2:
 * 给定链表 1->2->3->4->5, 重新排列为 1->5->2->4->3.
 *
 * @author liuw
 * @date 2020/10/20
 */
public class Test1020 {
    
    // 解决思路先转换成线性链表，然后根据下标规律重组链表

    public static void main(String[] args) {

        int[] array = {1, 2, 3};
        ListNode head = Init.initListNode(array);
        ListNode node = head;
        List<ListNode> listNodes = new ArrayList<>();

        while (node != null) {
            listNodes.add(node);
            node = node.next;
        }

        ListNode cursor = head;
        int resultNext = listNodes.size() -1;
        if(listNodes.size() > 2) {
            for (int i = 0; i < (listNodes.size() / 2); i++) {
                ListNode tempNode = cursor.next;
                cursor.next = listNodes.get(resultNext);
                cursor.next.next = tempNode;
                cursor = cursor.next.next;
                resultNext--;
            }
            cursor.next = null;   
        }
        Print.printListNode(head);
    }
}
