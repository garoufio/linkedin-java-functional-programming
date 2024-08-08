package chapter2;

import java.util.function.Function;

public class LambdaExpressions {
  
  public static void main(String[] args) {
    Function<String, Integer> fnGetStringLength = String::length;
    System.out.println(fnGetStringLength.apply("abc"));
    
    Function<Integer, Integer> fnAbsoluteValue = Math::abs;
    System.out.println(fnAbsoluteValue.apply(-4));
  }
  
}
