//백준 10828번
import java.util.*;

private class Node{
  int data;
  Node prev;

  Node(int data){
    this.data = data;
    this.prev = null;
   }
}

public class Stack{
  private Node top;

  public void push(int data){
     new newNode = newNode(data);
     newNode.prev = top;
     top = newNode;
  }

  public int pop(){
    System.out.println(top.data);
    top.prev = top;
  }

  public int boolean empty(){
    if(top.prev == null){
      System.out.println(1);
    }else{
      System.out.println(0);
    }
  }
 
  public void size(){
    int size = 0;
    for(top; top.prev != null; top ->top.prev){
      size += 1;
    }
    System.out.println(size);
  }
  
  public void top(){
    System.out.println(top.data);
  }
}

public class B10828{
  public static void main(String args[]) throws IOException{
    bufferedReader br = new BufferedReader(new InputStreamReader(System.in){
      int N = Integer.valueOf(br.readLine());
      stack myStack = new Stack();

      for(int i = 0; i < N; i++){
        String[] input = br.readLine().split(" ");
        String oder = input[0];

        if(oder.equals("push"){
          int num = input[1];
          myStack.push(num);
        }
        else if(oder.equals("pop") myStack.pop();
        else if(oder.equals("size") myStack.size();
        else if(oder.equals("empty") myStack.empty();
        else if)oder.equals("top") myStack.top();
      }

      static boolean empty(){
        return top == null;
      }
    }
  }
}

