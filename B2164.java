//백준2164 카드
import java.util.*;

class Node{
  int data;
  Node next;
  Node prev;

  Node(int data){
    this.data = data;
    this.next = null;
    this.prev = null;
  }
}

class CircleQ{
  public Node top;
  public Node rear;
    
  public boolean empty(){
    return top == null;
  }

  public void pop(){
    if(empty()) return;
      
    top.prev.next = top.next;
    top.next.prev = top.prev;
    rear = top.prev;
    top = top.prev.prev;

    if(top == rear){
      System.out.println(top.data);
      top = null;
      rear = null;
      return;
    }
   }

  public void push(int data){
    Node newNode = new Node(data);
    if(empty()){
      top = newNode;
      rear = newNode;
      newNode.next = newNode;
      newNode.prev = newNode;
      }
    else{
      newNode.next = rear;
      rear.prev = newNode;
      newNode.prev = top;
      top.next = newNode;
      rear = newNode;
    }
  }
}

public class B2164{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    CircleQ circle = new CircleQ();
    
    for(int i = 1; i <= N; i++){
      circle.push(i);
    }

    while(!circle.empty()){
      circle.pop();
    }
    sc.close();
  }
}

