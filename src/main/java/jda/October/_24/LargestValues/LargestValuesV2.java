package jda.October._24.LargestValues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 515. Find Largest Value in Each Tree Row
 */
public class LargestValuesV2 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        List<Integer> values = largestValues(treeNode);
        System.out.println(values);
    }
    public static List<Integer> largestValues(TreeNode root) {

        if (root == null)
            return new ArrayList<>();

        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            int curr_level_size = queue.size();
            int max_val = Integer.MIN_VALUE;

            for (int i = 0; i < curr_level_size; i++) {
                TreeNode node = queue.poll();
                max_val = Math.max(max_val, node.val);

                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }

            result.add(max_val);
        }

        return result;
    }
}
