package chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class ChallengeFilterOfNumbers {
  
  // Change these boolean values to control whether you see
  // the expected result and/or hints.
  static boolean showExpectedResult = false;
  static boolean showHints = false;
  
  // Return the largest number in the 'numbers' array
  static List<String> filterAndTransform(List<Integer> numbers) {
    List<String> strNumbersList = numbers
        .stream()
        .filter(number -> number >= 0 && number < 9 && number % 3 == 0)
        .map(number -> {
          if (number == 0) return "zero";
          else if (number == 3) return "three";
          else if (number == 6) return "six";
          else if (number == 9) return "nine";
          else return "unknown";
        })
        .collect(Collectors.toList());
    
    return strNumbersList.isEmpty() ? null : strNumbersList;
  }
  
}