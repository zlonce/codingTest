//백준 10845번
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class B10845{
  static int[] q = new int[10000];
  static int first = 0;
  static int rear = 0;

  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.valueOf(br.readLine());
    for(int i = 0; i < N; i++){
      String[] input = br.readLine().split(" "); 
      String oder = input[0];
     
      if(oder.equals("push")){
        int num = Integer.parseInt(input[1]);
        push(num);
      }
      else if(oder.equals("pop")) pop();
      else if(oder.equals("size")) size();
      else if(oder.equals("empty")) isEmpty();
      else if(oder.equals("front")) front();
      else if(oder.equals("back")) back();
    }
  }

  static boolean isFull(){
    return rear == q.length;
  

  static boolean isEmpty(){
    if(rear - first == 0){
      System.out.println(1);
      return true;
    }
    else{
      System.out.println(0);
      return false;
    }
  }

  static void push(int num){
    q[rear++] = num;
  }

  static void pop(){
    if(rear - first == 0){
      System.out.println(-1);
    }
    else {
      System.out.println(q[first++]);
    }
  }
  
  static void size(){
    System.out.println(rear - first);
  }

  static void front(){
    if(rear-first == 0) 
      System.out.println(-1);
    else 
      System.out.println(q[first]);
  }

  static void back(){
    if(rear-first == 0)
      System.out.println(-1);
    else 
      System.out.println(q[rear-1]);
  }

}





















