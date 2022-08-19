import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class aa17608 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        for (int i = 0; i < a; i++) {
            stack.push(Integer.parseInt(br.readLine()));
        }
        int count = 0;
        int max = stack.pop();
        for (int i = 0; i < a - 1; i++) {
            int b = stack.pop();
            if (max < b) {
                count++;
                max = b;
            }
        }
        System.out.println(max);
        System.out.println(count + 1);
    }
}
