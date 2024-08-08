package chapter2;

import java.util.function.BiFunction;

public class FunctionsAsArguments {
  
  protected static class MyMath {
    public static Integer add(Integer x, Integer y) {
      return x + y;
    }
    
    //-------------------------------------------------------------------------
    
    public static Integer subtract(Integer x, Integer y) {
      return x - y;
    }
    
    //-------------------------------------------------------------------------
    
    public static Integer multiply(Integer x, Integer y) {
      return x * y;
    }
    
    //-------------------------------------------------------------------------
    
    public static Integer divide(Integer x, Integer y) {
      return y != 0 ? x / y : 0;
    }
    
    //-------------------------------------------------------------------------
    
    public static Integer mathFunction(BiFunction<Integer, Integer, Integer> fn, Integer x, Integer y) {
      return fn.apply(x, y);
    }
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public static void main(String[] args) {
    int x = 5;
    int y = 7;
    System.out.printf("%d + %d = %d\n", x, y, MyMath.mathFunction(MyMath::add, x, y));
    System.out.printf("%d - %d = %d\n", x, y, MyMath.mathFunction(MyMath::subtract, x, y));
    System.out.printf("%d * %d = %d\n", x, y, MyMath.mathFunction(MyMath::multiply, x, y));
    System.out.printf("%d / %d = %d\n", x, y, MyMath.mathFunction(MyMath::divide, x, y));
    System.out.printf("2 * (%d + %d) = %d\n", x, y, MyMath.mathFunction((a, b) -> 2 * (a + b) , x, y));
  }
  
}
