import java.util.*;

public class RiskThreshold {

    static int floor(int[] arr, int key) {
        int res = -1;
        for (int x : arr) {
            if (x <= key) res = x;
        }
        return res;
    }

    static int ceil(int[] arr, int key) {
        for (int x : arr) {
            if (x >= key) return x;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 25, 50, 100};

        int key = 30;

        System.out.println("Floor: " + floor(arr, key));
        System.out.println("Ceil: " + ceil(arr, key));
    }
}
