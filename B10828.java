//백준 10828번
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

    public void init(){
      
    }

    public void push(int data){
      Node newNode = new Node(data);
      newNode.prev = top;
      top = newNode;
    }

    public void pop(){
      if(empty()){
        System.out.println(-1);
      }
      else{
        System.out.println(top.data);
        top = top.prev;
     }
   }

    public boolean empty(){
      if(top == null) return true;
      else return false;
    }
 
    public void size(){
      int size = 0;
      for(Node curr = top; curr != null; curr = curr.prev){
        size ++;
      }
      System.out.println(size);
   }
  
    public void top(){
      if(empty()){
        System.out.println(-1);
     }
      else System.out.println(top.data);
    }
}



public class B10828{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.valueOf(br.readLine());
    Stack myStack = new Stack();
    myStack.init();
    for(int i = 0; i < N; i++){
      String[] input = br.readLine().split(" ");
      String oder = input[0];

      if(oder.equals("push")){
        int num = Integer.parseInt(input[1]);
        myStack.push(num);
      }
      else if(oder.equals("pop")) myStack.pop();
      else if(oder.equals("size")) myStack.size();
      else if(oder.equals("empty")){
        if(myStack.empty()) System.out.println(1);
        else System.out.println(0);
      }
      else if(oder.equals("top")) myStack.top();
    }
  }
}

