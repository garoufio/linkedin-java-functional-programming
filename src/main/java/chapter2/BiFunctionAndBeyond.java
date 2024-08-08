package chapter2;

import java.util.function.BiFunction;

public class BiFunctionAndBeyond {
  
  public static void main(String[] args) {
    BiFunction<Integer, Integer, Integer> fnAdd = (a, b) -> a + b;
    System.out.println(fnAdd.apply(12, -2));
    
    TriFunction<Integer, Integer, Integer, Integer> fnAverage = (a, b, c) -> (a + b + c) / 3;
    System.out.println(fnAverage.apply(3, 6, 12));
    
    NoArgFunction<String> fnPrintHello = () -> "Hello World";
    System.out.println(fnPrintHello.apply());
  }
  
}
