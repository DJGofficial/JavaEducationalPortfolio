import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    static int[][] accounts = {{1, 7, 3}, {3, 4, 1}};

    public static void main(String[] args) {
        maximumWealth(accounts);
    }

    static public int maximumWealth(int[][] accounts) {
        int max = 0;
        int balance = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                System.out.println("J= " + j);
                balance += accounts[i][j];
            }
            if (balance > max)
                max = balance;
            balance = 0;
            System.out.println("Max " + max);

        }


        return max;
    }
}
