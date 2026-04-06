import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] q = new int[2 * n];
        for (int i = 0; i < n; i++) {
            q[i] = i + 1;
        }
        int head = 0;
        int tail = n;

        // 문제에서 마지막 1장이 남을때 까지 이므로 tail - head은 1이 남을때 까지 진행된다.
        // tail이 한번 증가할때 head는 두번 증가하므로 진행과정중에 1칸까지 따라잡힌다.
        while ((tail - head) > 1) {
            head++;
            q[tail++] = q[head++];
        }

        System.out.println(q[head]);
    }

}