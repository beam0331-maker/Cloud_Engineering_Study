import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cmd = Integer.parseInt(st.nextToken());
            switch (cmd){
                case 1 :
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case 3:
                    if(!deque.isEmpty()){
                        sb.append(deque.pollFirst()).append("\n");
                    }else {
                        sb.append(-1).append("\n");
                    }
                    break;
                case 4:
                    if(!deque.isEmpty()){
                        sb.append(deque.pollLast()).append("\n");
                    }else {
                        sb.append(-1).append("\n");
                    }
                    break;
                case 5:
                    sb.append(deque.size()).append("\n");
                    break;
                case 6 :
                    if(deque.isEmpty())
                        sb.append(1).append("\n");
                    else
                        sb.append(0).append("\n");
                    break;
                case 7:
                    if(!deque.isEmpty()){
                        sb.append(deque.peekFirst()).append("\n");
                    }else {
                        sb.append(-1).append("\n");
                    }
                    break;
                case 8:
                    if(!deque.isEmpty()){
                        sb.append(deque.peekLast()).append("\n");
                    }else {
                        sb.append(-1).append("\n");
                    }
                    break;
            }

        }

        System.out.println(sb);

    }

}