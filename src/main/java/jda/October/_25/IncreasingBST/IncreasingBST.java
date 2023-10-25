package jda.October._25.IncreasingBST;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


/**
 * 897. Increasing Order Search Tree
 */
public class IncreasingBST {
    List<Integer> list;

    public TreeNode increasingBST(TreeNode root) {
        list = new ArrayList<>();

        setValue(root);

        List<Integer> integerList = list.stream().sorted(Comparator.comparing(Integer::intValue)).toList();

        root = new TreeNode();
        root.val = integerList.get(0);
        TreeNode temp = root;
        for (int i = 1; i < integerList.size(); i++) {
            TreeNode treeNode = new TreeNode(integerList.get(i));
            temp.right = treeNode;
            temp=treeNode;

        }
        return root;

    }

    private void setValue(TreeNode root) {
        if (root == null)
            return;

        list.add(root.val);

        setValue(root.left);
        setValue(root.right);

    }
}


