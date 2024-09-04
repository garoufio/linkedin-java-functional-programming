package practice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TransformValues {
  
  public static String transformValues(int[] numbers) {
    return Arrays
        .stream(numbers)
        .mapToObj(String::valueOf)
        .collect(Collectors.joining(","));
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public static void main(String[] args) {
    // Create a data set.
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    // Call the answer code.
    String result = transformValues(numbers);
    System.out.println(result);
  }
  
}
