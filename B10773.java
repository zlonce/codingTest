//백준 10773번 제로
import java.util.*;
import java.io.*;

class Node{
  int data;
  Node prev;

  Node(int data){
    this.data = data;
    this.prev = null;
   }
}

class Stack{
    private Node top;

    public void push(int data){
      Node newNode = new Node(data);
      
      if(top == null){
        top = newNode;
        return;
      }

      newNode.prev = top;
      top = newNode;
    }

    public int pop(){
      if(empty()){
        return -1;
      }
      else{
        int data = top.data;
        top = top.prev;
        return data;
     }
   }

    public boolean empty(){
      if(top == null) return true;
      else return false;
    }
    
    public void getSum(){
      int sum = 0;
      while(!empty()){
        int num = pop();
        sum += num;
      }
      System.out.println(sum);
      return;
    }
}


public class B10773{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.valueOf(br.readLine());
    Stack myStack = new Stack();

    for(int i = 0; i < N; i++){
      int num = Integer.valueOf(br.readLine());
      if(num == 0) myStack.pop();
      else myStack.push(num);
    }
    myStack.getSum();
  }
}

