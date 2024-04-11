import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static int sum_n(int n) {
        if (n <= 1) {
            return n;
        } else {
            return sum_n(n - 1) + n;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println(sum_n(n));

    }
}
