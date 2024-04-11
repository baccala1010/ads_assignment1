import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void reverseStringOutput(int n) {
        if (n == 0) {
            return;
        }
        char[] str = sc.next().toCharArray();
        reverseStringOutput(n - 1);
        System.out.println(str);
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");
        int n = sc.nextInt();
        reverseStringOutput(n);
    }
}
