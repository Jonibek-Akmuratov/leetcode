package jda.October._24.LargestValues;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/**
 * 515. Find Largest Value in Each Tree Row
 */
public class LargestValues {
    static HashMap<Integer, List<Integer>> rowValues;

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        List<Integer> values = largestValues(treeNode);
        System.out.println(values);
    }


    public static List<Integer> largestValues(TreeNode root) {
        rowValues = new HashMap<>();
        int val = root.val;

        rowValues.put(0, List.of(val));

        setHashMapValues(root, 1);

        List<Integer> result = new ArrayList<>();

        for (List<Integer> value : rowValues.values()) {
            Integer max = value.stream().max(Comparator.naturalOrder()).orElse(0);
            result.add(max);
        }
        return result;
    }

    public static void setHashMapValues(TreeNode root, int rowCount) {

        int newRowCount = rowCount + 1;
        if (root.left != null) {
            List<Integer> integerList = rowValues.getOrDefault(rowCount, new ArrayList<>());
            integerList.add(root.left.val);
            rowValues.put(rowCount, integerList);
            setHashMapValues(root.left, newRowCount);
        }

        if (root.right != null) {
            List<Integer> integerList = rowValues.getOrDefault(rowCount, new ArrayList<>());
            integerList.add(root.right.val);
            rowValues.put(rowCount, integerList);
            setHashMapValues(root.right, newRowCount);
        }
    }

}

