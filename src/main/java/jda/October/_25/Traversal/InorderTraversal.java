package jda.October._25.Traversal;

import java.util.ArrayList;
import java.util.List;


/**
 * 94. Binary Tree Inorder Traversal
 */
public class InorderTraversal {

    List<Integer> result;

    public List<Integer> inorderTraversal(TreeNode root) {

        result = new ArrayList<>();
        collect(root);
        return result;
    }

    private void collect(TreeNode root) {
        if (root == null) return;

        collect(root.left);
        result.add(root.val);
        collect(root.right);

    }

}
