import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();
        List<Integer> queueList = new ArrayList<>();

        int nowTicketNum = 1;
        for (int i = 0; i < n; i++) {
            int queueTicketNum = Integer.parseInt(st.nextToken());
            if (queueTicketNum == nowTicketNum) {
                queueList.add(queueTicketNum);
                nowTicketNum++;
            } else {
                stack.push(queueTicketNum);
            }

            while (!stack.isEmpty()){
                if(stack.peek()==nowTicketNum){
                    queueList.add(stack.pop());
                    nowTicketNum++;
                }
                else break;

            }

        }

        while (!stack.isEmpty()) {
            queueList.add(stack.pop());
        }

        System.out.println(isCheck(queueList));

    }

    static String isCheck(List<Integer> list) {
        int n = list.size();
        for (int i = 1; i <= n; i++) {
            if(i != list.get(i-1))
                return "Sad";
        }
        return "Nice";
    }

}