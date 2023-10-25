package jda.October.todo;


/**
 779. K-th Symbol in Grammar
 */
public class KthGrammar {
    public static void main(String[] args) {
        System.out.println(kthGrammar(5, 5));
    }

    public static int kthGrammar(int n, int k) {
        if (n == 1)
            return 0;

        int parent = kthGrammar(n - 1, (k + 1) / 2);

        if (k % 2 == 0) {
            return parent == 1 ? 0 : 1;
        } else {
            return parent;
        }
    }

}
