package cn.liuw.leet.common;

import cn.liuw.leet.object.ListNode;
import cn.liuw.leet.object.TreeNode;

/**
 * @author liuw
 * @date 2020/10/20
 */
public class Init {

    /**
     * 根据传入数组初始化链表
     *
     * @param array
     * @return
     */
    public static ListNode initListNode(int[] array) {
        ListNode head = new ListNode();
        ListNode cursor = new ListNode();
        head.value = array[0];
        cursor = head;
        for (int i = 1; i < array.length; i++) {
            ListNode node = new ListNode();
            node.value = array[i];
            cursor.next = node;
            cursor = node;
        }
        return head;
    }

    /**
     * 根据传入数组初始化二叉树
     *
     * @param array
     * @return
     */
    public static TreeNode initTreeNode(int[] array, int index, TreeNode root) {
        
        if (index == array.length - 1 || index >= array.length) {
            return null;
        }

        root.value = array[index];
        index++;
        initTreeNode(array, index, root.left);
        initTreeNode(array, index, root.right);
        return root;
    }
}
