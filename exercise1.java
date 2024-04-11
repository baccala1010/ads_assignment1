import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    public static int sum_of_squares(int num) {
        if (num <= 1) {
            return num;
        } else {
            return num * num + sum_of_squares(num - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println(sum_of_squares(num));
    }
}
