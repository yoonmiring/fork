import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class aa2164 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        LinkedList<Integer> list = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            list.offer(i);
        }
        while (list.size() > 1) {
            list.poll();
            list.offer(list.poll());
        }
        System.out.println(list.poll());
    }
}
