import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        ArrayDeque<Integer> deque = new ArrayDeque<>(n);
        for (int i = 0; i < n; i++) {
            deque.add(i + 1);
        }
        StringJoiner sj = new StringJoiner(", ", "<", ">");
        while (!deque.isEmpty()) {
            for (int i = 1; i < k ; i++) {
                deque.add(deque.poll());
            }
            sj.add(deque.poll().toString());
        }

        System.out.println(sj);
    }

}