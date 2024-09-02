package chapter4;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Composition {
  
  public static void main(String[] args) {
    Function<Integer, Function<Integer, Integer>> multiply = x -> y -> y * x;
    Function<Integer, Integer> multiplyBy2 = multiply.apply(2);
    Function<Integer, Integer> minusOne = x -> x - 1;
    Function<Integer, Integer> timesTwoMinusOne = minusOne.compose(multiplyBy2);
    System.out.println(timesTwoMinusOne.apply(10));
    
    Function<Integer, Integer> minusOneTimesTwo = minusOne.andThen(multiplyBy2);
    System.out.println(minusOneTimesTwo.apply(10));
    
    Function<String, String> toUpperCase = s -> s.toUpperCase();
    Function<String, String> reverse = s -> new StringBuilder(s).reverse().toString();
    Function<String, String> toUpperCaseAndReverse = reverse.compose(toUpperCase);
    System.out.println(toUpperCaseAndReverse.apply("java"));
  }
  
}
