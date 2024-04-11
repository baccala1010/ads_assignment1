import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    private static void generateSequence(int[] arr, int index, int k) {
        if (index == arr.length) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <= k; i++) {
            arr[index] = i;
            generateSequence(arr, index + 1, k);
        }
    }



    public static void main(String[] args) {
        System.out.println("Hello world!");
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        generateSequence(arr, 0, k);
    }
}
