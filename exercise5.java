import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void inputArr(int[] arr, int i) {
        if (i < arr.length) {
            arr[i] = sc.nextInt();
            inputArr(arr, i + 1);
        }
    }

    public static void outputArr(int[] arr, int i) {
        if (i < arr.length) {
            System.out.println(arr[i]);
            outputArr(arr, i + 1);
        }
    }

    public static void reverseOutput(int[] arr, int i) {
        if (i >= 0) {
            System.out.println(arr[i]);
            reverseOutput(arr, i - 1);
        }
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("What is the size of an array?:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        inputArr(arr, 0);
        System.out.println("\n");
        outputArr(arr, 0);
        System.out.println("\n");
        int i = arr.length;
        reverseOutput(arr, i - 1);
    }
}



==========================================================================




import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void reverseSequence(int n) {
        if (n > 0) {
            System.out.println(n);
            reverseSequence(n - 1);
        }
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");
        int n = sc.nextInt();
        reverseSequence(n);
    }
}
