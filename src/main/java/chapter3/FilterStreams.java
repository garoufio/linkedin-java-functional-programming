package chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterStreams {
  
  public static void main(String[] args) {
    Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    List<Integer> intList = new ArrayList<>(Arrays.asList(intArray));
    
    Predicate<Integer> isIntGreaterThanFive = x -> x > 5;
    List<Integer> intGreaterThanFiveList = intList
        .stream()
        .filter(isIntGreaterThanFive)
        .collect(Collectors.toList());
    System.out.println(intGreaterThanFiveList);
    
    Predicate<Integer> isIntEven = x -> x % 2 == 0;
    List<Integer> intEvenList = intList
        .stream()
        .filter(isIntEven)
        .collect(Collectors.toList());
    System.out.println(intEvenList);
  }
  
}
