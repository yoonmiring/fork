import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Main4 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Stack<Integer> stack = new Stack<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(br.readLine());
            if (number == 0) {
                stack.pop();
            } else {
                stack.push(number);
            }
        }

        int sum = 0;
        for (int i : stack) {
            sum += i;
        }
        System.out.println(sum);

    }
}
