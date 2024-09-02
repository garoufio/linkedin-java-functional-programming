package chapter4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ChallengeComposition {
  
  // Return the largest number in the 'numbers' array
  static int getIndexOfLargest(int[] numbers) {
    return IntStream
        .range(0, numbers.length)
        .reduce((i, n) -> numbers[i] >= numbers[n] ? i : n)
        .orElse(-1);
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  static int countLetters(String s) {
    return s.length();
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  static String getByIndex(String[] strings, int index) {
    return strings[index];
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  static String getLongestWord(String[] strings) {
    int[] lettersCount = Arrays
        .stream(strings)
        .mapToInt(str -> countLetters(str))
        .toArray();
    
    return getByIndex(strings, getIndexOfLargest(lettersCount));
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public static void main(String[] args) {
    int[] numbers = { 7, 17, 13, 19, 5 };
    String[] words = {
        "apple", "banana", "cherry",
        "date", "fig", "grape",
        "kiwi", "lemon", "mango"
    };
    String s = "Hello composition";
    int index = 3;
    
    int indexOfLargestNumber = getIndexOfLargest(numbers);
    int numLetters = countLetters(s);
    
    System.out.println(getLongestWord(words));
  }
  
}
