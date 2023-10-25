package jda.October._25.IncreasingBST;

import java.util.Stack;

/**
 * 897. Increasing Order Search Tree
 */
public class IncreasingBST_V2 {

    Stack<Integer> stack;

    public TreeNode increasingBST(TreeNode root) {

        stack = new Stack<>();
        collectElementsInorder(root);

        Integer pop = stack.pop();
        TreeNode result = new TreeNode(pop);
        TreeNode temp = result;
        while (!stack.isEmpty()) {
            pop = stack.pop();
            TreeNode treeNode = new TreeNode(pop);
            temp.right = treeNode;
            temp = treeNode;
        }
        return result;
    }

    public void collectElementsInorder(TreeNode node) {
        if (node != null) {
            collectElementsInorder(node.right);
            stack.add(node.val);
            collectElementsInorder(node.left);
        }
    }

}
