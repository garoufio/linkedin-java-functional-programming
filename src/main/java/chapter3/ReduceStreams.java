package chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceStreams {
  
  public static void main(String[] args) {
    Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    List<Integer> intArrayList = new ArrayList<>(Arrays.asList(intArray));
    
    BinaryOperator<Integer> getSum = (acc, x) -> acc + x;
    Integer sum = intArrayList
        .stream()
        .reduce(0, getSum);
    System.out.println("Sum = " + sum);
  }
  
}
