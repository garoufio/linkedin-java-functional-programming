package chapter4;

public class Recursion {
  
  public static void countDown(int x) {
    if (x < 0) {
      System.out.println("Done!");
      return;
    }
    
    System.out.println(x);
    countDown(x - 1);
  }
  
  //-----------------------------------------------------------------------------------------------
  
  public static void countUp(int x, int end) {
    if (x > end) {
      System.out.println("Done");
      return;
    }
    
    System.out.println(x);
    countUp(x + 1, end);
  }
  
  //-----------------------------------------------------------------------------------------------
  
  public static void main(String[] args) {
    System.out.println("Counting down from 10 to 0:");
    countDown(10);
    
    System.out.println("Counting up from 0 to 20:");
    countUp(0, 20);
  }
  
}
