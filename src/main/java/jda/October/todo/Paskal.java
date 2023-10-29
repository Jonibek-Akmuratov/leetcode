package jda.October.todo;

import java.util.ArrayList;
import java.util.List;

public class Paskal {
    public static void main(String[] args) {
        System.out.println(getRow(3));
    }
    public static List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0)
            return List.of(1);
        if (rowIndex == 1)
            return List.of(1, 1);

        return makeArray(List.of(1, 1), rowIndex);
    }

    private static List<Integer> makeArray(List<Integer> pArr, int rowIndex) {
        List<Integer> nArr = new ArrayList<>(pArr.size() + 1);
        nArr.add(0, 1);
        nArr.add(pArr.size(), 1);

        for (int i = 1; i < pArr.size(); i++)
            nArr.add(i, pArr.get(i - 1) + pArr.get(i));

        if (nArr.size() == rowIndex)
            return nArr;

        return makeArray(nArr, rowIndex);

    }
}
