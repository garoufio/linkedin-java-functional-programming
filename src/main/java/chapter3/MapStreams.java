package chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapStreams {
  
  public static Function<Integer, Integer> multiplier(Integer x) {
    return (Integer y) -> x * y;
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public static void main(String[] args) {
    Integer[] intArray = new Integer[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    List<Integer> intList = new ArrayList<>(Arrays.asList(intArray));
    
    Function<Integer, Integer> multiplyBy2 = multiplier(2);
    List<Integer> intListDoubled = intList
        .stream()
        .map(multiplyBy2)
        .collect(Collectors.toList());
    System.out.println(intListDoubled);
    
    Function<Integer, Integer> multiplyBy3 = multiplier(3);
    List<Integer> intListTrippled = intList
        .stream()
        .map(multiplyBy3)
        .collect(Collectors.toList());
    System.out.println(intListTrippled);
  }
  
}
