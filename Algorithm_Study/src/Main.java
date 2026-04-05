import java.io.*;
import java.util.*;

class Node {

    private int data;
    private int size;
    private Node next;
    private Node pre;

    public Node(){};

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

    private Node getPre() {
        return pre;
    }

    private void setPre(Node node){
        this.pre = node;
    }

    public void push(int data) {
        this.size++;
        Node head = this;
        Node node = new Node(data);
        if (head.getNext() == null) {
            head.setNext(node);
            head.setPre(node);
        } else {
            Node lastNode = head.getPre();
            lastNode.setNext(node);
            lastNode.setPre(null);
            head.setPre(node);
        }

    }

    public int pop() {
        int n = this.next.getData();
        this.next = this.next.getNext();
        this.size--;
        return n;
    }

    public int size() {
        return this.size;
    }

    public boolean empty() {
        return getNext() == null;

    }

    public int front() {
        return this.next.getData();
    }

    public int back() {
        return this.pre.getData();
    }

}


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Node head = new Node();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String comd = st.nextToken();

            switch (comd) {
                case "push":
                    head.push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    if (!head.empty()) {
                        sb.append(head.pop()).append("\n");

                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
                case "size":
                    sb.append(head.size()).append("\n");
                    break;
                case "empty":
                    if (!head.empty()) {
                        sb.append(0).append("\n");
                    } else {
                        sb.append(1).append("\n");
                    }
                    break;
                case "front":
                    if (!head.empty()) {
                        sb.append(head.front()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
                case "back":
                    if (!head.empty())
                        sb.append(head.back()).append("\n");
                    else
                        sb.append(-1).append("\n");
                    break;


            }


        }

        System.out.println(sb);

    }

}