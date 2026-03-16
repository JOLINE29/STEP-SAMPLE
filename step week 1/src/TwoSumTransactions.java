import java.util.*;

class TwoSumTransactions {

    public static void findTwoSum(int[] amounts, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < amounts.length; i++) {

            int complement = target - amounts[i];

            if (map.containsKey(complement)) {

                System.out.println("Pair Found: " + complement + " + " + amounts[i] +
                        " = " + target);
                return;
            }

            map.put(amounts[i], i);
        }

        System.out.println("No pair found");
    }

    public static void main(String[] args) {

        int transactions[] = {500, 300, 200};

        int target = 500;

        findTwoSum(transactions, target);
    }
}