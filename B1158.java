//백준 1158 요세푸스

import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class Circle {
    Node top = null;
    Node rear = null;

    public boolean empty() {
        return top == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (empty()) {
            top = newNode;
            rear = newNode;
            newNode.next = newNode;
            newNode.prev = newNode;
        } else {
            newNode.next = rear;
            newNode.prev = top;
            top.next = newNode;
            rear.prev = newNode;
            top = newNode;
        }
    }

    public int pop(int k) {
        if (empty()) return -1;
        for (int i = 0; i < k; i++) {
            top = top.next;
        }
        int data = top.data;
        top.next.prev = top.prev;
        top.prev.next = top.next;
        top = top.prev;
        return data;
    }
}

public class B1158 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Circle circle = new Circle();

        for (int i = 1; i <= n; i++) {
            circle.push(i);
        }

        System.out.print("<");
        for (int i = 0; i < n; i++) {
          int data = circle.pop(k);
          System.out.print(data);
          if(i != n-1){
            System.out.print(", ");
          }
        }
        System.out.print(">");
    }
}

