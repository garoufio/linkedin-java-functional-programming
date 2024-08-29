package chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterStreams {
  
  public static Predicate<String> filterMinLength(int length) {
    return s -> s.length() > length;
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public static Predicate<String> filterMaxLength(int length) {
    return s -> s.length() < length;
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
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
    
    String[] words = { "functional", "programming", "is", "cool" };
    List<String> wordsList = new ArrayList<>(Arrays.asList(words));
    Predicate<String> isWordLengthGreaterThanFive = filterMinLength(5);
    List<String> wordsWithLengthGreaterThanFiveList = wordsList
        .stream()
        .filter(isWordLengthGreaterThanFive)
        .collect(Collectors.toList());
    System.out.println(wordsWithLengthGreaterThanFiveList);
    
    Predicate<String> isWordLengthLessThanFive = filterMaxLength(5);
    List<String> wordsWithLengthLessThanFiveList = wordsList
        .stream()
        .filter(isWordLengthLessThanFive)
        .collect(Collectors.toList());
    System.out.println(wordsWithLengthLessThanFiveList);
    
    Function<Integer, Predicate<String>> isLongerThan = (len) -> {
      return str -> str.length() > len;
    };
    Predicate<String> isLongerThanThree = isLongerThan.apply(3);
    List<String> wordsWithLongerThanThreeList = wordsList
        .stream()
        .filter(isLongerThanThree)
        .collect(Collectors.toList());
    System.out.println(wordsWithLongerThanThreeList);
  }
  
}
