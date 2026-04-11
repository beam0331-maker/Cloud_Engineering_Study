import java.io.*;
import java.util.*;
class Node{
	int movePos;
	int index;
	Node(int movePos, int index){
		this.movePos = movePos;
		this.index = index;
	}
}
public class Main {
    public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringJoiner sj = new StringJoiner(" ");
		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());

		ArrayDeque<Node> deque = new ArrayDeque<>(n);


		for(int i = 0 ; i <n ; i++){
			deque.add(new Node(Integer.parseInt(st.nextToken()),i));
		}

		for(int i = 1 ; i <= n ; i++){
			Node node = deque.poll();
			int pos = node.movePos;
			sj.add(String.valueOf(node.index+1));
			if(deque.isEmpty()) break;

			if(pos > 0){
				for(int j = 0; j < Math.abs(pos) -1 ; j++){
					deque.addLast(deque.pollFirst());
				}
			}else if(pos < 0){
				for(int j = 0 ; j < Math.abs(pos) ; j++){
					deque.addFirst(deque.pollLast());
				}
			}
		}

		System.out.println(sj);


	}

}