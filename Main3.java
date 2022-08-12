import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> stack = new Stack<Integer>();

        int n = sc.nextInt();
        int[] n_list = new int[n];
        for (int i = 0; i < n; i++) {
            n_list[i] = sc.nextInt();
        }

        Arrays.sort(n_list);

        int m = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            if (result(n_list, sc.nextInt()) >= 0) {
                sb.append(1).append('\n');
            } else {
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static int result(int[] arr, int key) {
        int low = 0;
        int height = arr.length - 1;

        while (low <= height) {
            int mid = (low - height) / 2;

            if (key < arr[mid]) {
                height = mid - 1;
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
