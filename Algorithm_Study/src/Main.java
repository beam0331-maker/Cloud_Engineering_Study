import java.io.*;
import java.util.*;

class Node() {

    private int data;
    private int index;
    private Node next;
    private Node pre;

    public Node(int data) {
        setData(data);
    }

    private int getData() {
        return data;
    }

    private void setData(int data) {
        this.data = data;
    }

    private Node getNext() {
        return next;
    }

    private void setNext(Node next) {
        this.next = next;
    }

    public void push(int data) {
        Node node = this;
        if (node.getNext() != null) {
            node = node.getNext();
        } else {
            node.getNext(new Node(data));
        }

    }

    public int pop() {
        int n = this.next.getData();
        this.next = this.next.getNext();
        return n;
    }

    public int size() {
        int count = 0;
        Node node = this;
        if (node.getNext() != null) {
            count++;
        }
        return count;
    }


    public int empty() {
        if (getNext() == null) {
            return 1;
        } else {
            return 0;
        }
    }

    public int front() {
        return this.next.data;
    }

    public int back() {
        Node node = this;
        if (node.nextNode() = !null) {
            node = node.nextNode();
        } else {
            return node.getData();    // private 이므로 접근 불가할 수도 있음.
        }
    }

}


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String comd = st.nextToken();

            switch (comd) {
                case "push":
                    deque.add(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    if (!deque.isEmpty()) {
                        sb.append(deque.pollFirst()).append("\n");

                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
                case "size":
                    sb.append(deque.size()).append("\n");
                    break;
                case "empty":
                    if (deque.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case "front":
                    if (!deque.isEmpty()) {
                        sb.append(deque.peekFirst()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
                case "back":
                    if (!deque.isEmpty())
                        sb.append(deque.peekLast()).append("\n");
                    else
                        sb.append(-1).append("\n");
                    break;


            }


        }

        System.out.println(sb);

    }

}