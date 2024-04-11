import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static double sum_of_powers(double b, int n) {
        if (b <= 1 || n == 0) {
            return Math.pow(b, n);
        } else {
            return sum_of_powers(b, n - 1) + Math.pow(b, n);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        double b = sc.nextDouble();
        int n = sc.nextInt();
        System.out.println(sum_of_powers(b, n));
    }
}
