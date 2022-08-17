import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class aa18258 {
    public static int[] queue;
    public static int size = 0;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        queue = new int[N];

        while (N > 0) {

            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    bw.write(pop() + "\n");
                    break;
                case "size":
                    bw.write(size() + "\n");
                    break;
                case "empty":
                    bw.write(empty() + "\n");
                    break;
                case "front":
                    bw.write(front() + "\n");
                    break;
                case "back":
                    bw.write(back() + "\n");
                    break;
            }
            N--;

        }
        bw.flush();
        bw.close();
    }

    public static void push(int a) {
        queue[size] = a;
        size++;
    }

    public static int pop() {
        if (size == 0) {
            return -1;
        } else {
            int res = queue[0];
            for (int i = 0; i < size; i++) {
                queue[i] = queue[i + 1];
            }
            size--;
            return res;
        }
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        if (size == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int front() {
        if (size == 0) {
            return -1;
        } else {
            return queue[0];
        }
    }

    public static int back() {
        if (size == 0) {
            return -1;
        } else {
            return queue[size - 1];
        }
    }
}
