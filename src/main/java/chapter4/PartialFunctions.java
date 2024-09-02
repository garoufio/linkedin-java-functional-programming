package chapter4;

import java.util.function.BiFunction;
import java.util.function.Function;

public class PartialFunctions {
  
  public static void main(String[] args) {
    TriFunction<Integer, Integer, Integer, Integer> add = (a, b, c) -> a + b + c;
    
    // partial function with one constant
    Function<Integer, BiFunction<Integer, Integer, Integer>> partialAdd = x -> (y, z) -> add.apply(x, y, z);
    BiFunction<Integer, Integer, Integer> add5 = partialAdd.apply(5);
    
    System.out.println(add5.apply(6, 7));
    
    // partial function with two constants
    BiFunction<Integer, Integer, Function<Integer, Integer>> partialAdd2 = (x, y) -> (z) -> add.apply(x, y, z);
    Function<Integer, Integer> add5and6 = partialAdd2.apply(5, 6);
    System.out.println(add5and6.apply(7));
  }
  
}
