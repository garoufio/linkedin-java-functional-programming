package chapter2;

import java.util.function.Function;

public class ReturningFunctions {
  
  protected static class MyMath {
    public static Integer timesTwo(Integer x) {
      return x * 2;
    }
    
    //-------------------------------------------------------------------------
    
    public static Integer timesThree(Integer x) {
      return x * 3;
    }
    
    //-------------------------------------------------------------------------
    
    public static Integer timesFour(Integer x) {
      return x * 4;
    }
    
    //-------------------------------------------------------------------------
    
    public static Function<Integer, Integer> createMultiplier(Integer x) {
      return (Integer y) -> y * x;
    }
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public static void main(String[] args) {
    System.out.println("Using OOP:");
    System.out.println(MyMath.timesTwo(4));
    System.out.println(MyMath.timesThree(4));
    System.out.println(MyMath.timesFour(4));
    
    System.out.println("Using functional programming:");
    Function<Integer, Integer> fnMultiplyBy2 = MyMath.createMultiplier(2);
    System.out.println(fnMultiplyBy2.apply(4));
    Function<Integer, Integer> fnMultiplyBy3 = MyMath.createMultiplier(3);
    System.out.println(fnMultiplyBy3.apply(4));
    Function<Integer, Integer> fnMultiplyBy4 = MyMath.createMultiplier(4);
    System.out.println(fnMultiplyBy4.apply(4));
  }
  
}
