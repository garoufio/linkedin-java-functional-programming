package chapter2;

import java.util.function.Function;

public class FunctionInterface {
  
  protected static class MyMath {
  
    public static Integer triple(Integer x) {
      return x * 3;
    }
    
    //-----------------------------------------------------------------------------------------------------------------
    
    public static String convertToString(Integer x) {
      return x.toString();
    }
  
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public static void main(String[] args) {
    Function<Integer, Integer> myTriple = MyMath::triple;
    int result = myTriple.apply(5);
    System.out.println("Functional: " + result);
    result = MyMath.triple(5);
    System.out.println("Class: " + result);
    
    Function<Integer, String> fnToString = MyMath::convertToString;
    String str = fnToString.apply(25);
    System.out.println("Functional: " + str);
    System.out.println("Class: " + MyMath.convertToString(25));
  }
  
}
