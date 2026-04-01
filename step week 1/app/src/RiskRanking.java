import java.util.*;

class Client {
    String name;
    int riskScore;
    double balance;

    Client(String name, int riskScore, double balance) {
        this.name = name;
        this.riskScore = riskScore;
        this.balance = balance;
    }

    public String toString() {
        return name + ":" + riskScore;
    }
}

public class RiskRanking {

    // Bubble Sort (Ascending risk)
    static void bubbleSort(Client[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].riskScore > arr[j + 1].riskScore) {
                    Client temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Insertion Sort (Descending risk)
    static void insertionSort(Client[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Client key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].riskScore < key.riskScore) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Client[] clients = {
            new Client("A", 20, 1000),
            new Client("B", 50, 2000),
            new Client("C", 80, 1500)
        };

        bubbleSort(clients);
        System.out.println("Ascending:");
        for (Client c : clients) System.out.println(c);

        insertionSort(clients);
        System.out.println("\nDescending:");
        for (Client c : clients) System.out.println(c);

        System.out.println("\nTop Risks:");
        for (int i = 0; i < Math.min(10, clients.length); i++) {
            System.out.println(clients[i]);
        }
    }
}