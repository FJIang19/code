package cn.lastwhisper.leetcode.stackqueue.二叉树的后序遍历_145_困难;

import cn.lastwhisper.leetcode.stackqueue.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution1 {
    /**
     * 题目地址：https://leetcode-cn.com/problems/binary-tree-postorder-traversal/
     * -------------------------------------------------------------------
     * 时间复杂度：https://www.cnblogs.com/wu8685/archive/2010/12/21/1912347.html
     * 空间复杂度：
     */
    List<Integer> list = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            list.add(root.val);
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);

        root.right = node1;
        node1.left = node2;

        new Solution1().postorderTraversal(root).forEach(node -> {
            System.out.print(node + ",");
        });
    }
}