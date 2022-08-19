import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class aa12605 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int C = Integer.parseInt(br.readLine());
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int i = 1;
        while (C-- > 0) {
            String text = br.readLine();
            // String[] temp = text.split(" ");
            // for (int j = 0; j < temp.length; j++) {
            // stack.push(temp[j]);
            // }
            StringTokenizer st = new StringTokenizer(text, " ");

            while (st.hasMoreTokens()) {
                stack.push(st.nextToken());
            }
            String[] str = new String[stack.size()];
            sb.append("Case #" + i + ": ");
            for (int j = 0; j < str.length; j++) {
                sb.append(stack.pop()).append(" ");
            }
            sb.append('\n');
            i++;
        }
        System.out.println(sb);
    }
}
