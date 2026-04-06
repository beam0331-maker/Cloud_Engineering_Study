import java.io.*;
import java.util.*;

class Node{
    private int data;
    private Node next;
    private Node pre;

    Node(){}
    Node(int data){
        this.data = data;
    }

    public int getData () {
        return data;
    }

    public Node getNext () {
        return next;
    }

    public void setNext (Node node){
        next = node;
    }

    public Node getPre () {
        return pre;
    }

    public void setPre (Node pre){
        this.pre = pre;
    }

}

class NodeMgr{

    private Node head;
    private Node tail;

    public NodeMgr() {
        this.head = new Node();
        this.tail = new Node();
        head.setNext(tail);
        tail.setPre(head);
    }


    public void cardSet ( int n){
        for (int i = 1; i <= n; i++) {
            Node node = new Node(i);
            Node lastNode = tail.getPre();
            lastNode.setNext(node);
            node.setNext(tail);
            tail.setPre(node);
        }
    }

    public int suffle () {
        int result = 0;

        while (head.getNext() != tail.getPre()) {
            Node dropNode = head.getNext();
            Node goBackNode = dropNode.getNext();
            head.setNext(goBackNode);
            if (goBackNode.getNext() == tail) break;
            else {
                Node lastNode = tail.getPre();
                head.setNext(goBackNode.getNext());
                lastNode.setNext(goBackNode);
                goBackNode.setNext(tail);
                tail.setPre(goBackNode);
            }
        }
        result = head.getNext().getData();
        return result;
    }

}


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NodeMgr mgr = new NodeMgr();
        mgr.cardSet(n);
        System.out.println(mgr.suffle());
    }

}