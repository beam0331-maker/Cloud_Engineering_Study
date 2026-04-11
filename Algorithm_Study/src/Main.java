import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringTokenizer nums = new StringTokenizer(br.readLine());


// 0일때 큐, 1일때 스택
// 0 -> flase, 1-> true
// 0 일때 튀어나온 숫자는 1일때 통과하고 0일때 다시 입력된다.
// 입력을 스택 튀어나오는건 큐...?
// deque의 사이즈가 변하면 안된다. 반드시 0의 갯수만큼 유지 시켜야 된다.

		ArrayDeque<Integer> qeueStack = new ArrayDeque<Integer>();

		while(st.hasMoreTokens()){
			int num = Integer.parseInt(nums.nextToken());
			String check = st.nextToken();
			if(check.equals("0")){
				qeueStack.addLast(num);
			}
		}

		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()){
			int token = Integer.parseInt(st.nextToken());
			qeueStack.addFirst(token);
			sb.append(qeueStack.pollLast()).append(" ");
		}

		System.out.println(sb);

	}

}