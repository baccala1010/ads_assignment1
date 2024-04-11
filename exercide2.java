import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static float arr_sum(float [] arr, int i) {
        if (i == 0) {
            return arr[i];
        } else {
            return arr_sum(arr, i - 1) + arr[i];
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        float[] arr = new float[]{1, 2, 3, 4, 5 ,6 , 7, 8, 9, 10};
        int i = sc.nextInt();
        System.out.println(arr_sum(arr, i));

    }
}
