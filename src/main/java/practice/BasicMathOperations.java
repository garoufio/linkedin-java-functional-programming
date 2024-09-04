package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BasicMathOperations {
  
  // Create constants representing the four available math functions
  public static final String ADD = "ADD";
  public static final String SUBTRACT = "SUBTRACT";
  public static final String MULTIPLY = "MULTIPLY";
  public static final String DIVIDE = "DIVIDE";
  
  //-------------------------------------------------------------------------------------------------------------------
  
  // Do mathematical calculations using lambda expressions
  public static Map<String, Float> calculate(float value1, float value2) {
    
    // basic math operations
    BiFunction<Float, Float, Float> add = (a, b) -> a + b;
    BiFunction<Float, Float, Float> subtract = (a, b) -> a - b;
    BiFunction<Float, Float, Float> multiply = (a, b) -> a * b;
    // Perform safe division
    BiFunction<Float, Float, Float> divide = (a, b) -> a / b;
    Function<BiFunction<Float, Float, Float>, BiFunction<Float, Float, Float>> secondArgCheck = (func) ->
        (a, b) -> {
          if (b == 0f) {
            System.out.println("Division by 0");
            return 0f;
          }
          else {
            return func.apply(a, b);
          }
        };
    BiFunction<Float, Float, Float> divideSafe = secondArgCheck.apply(divide);
    
    // Map object for holding the results using streams
    String[] operations = { ADD, SUBTRACT, MULTIPLY, DIVIDE };
    return Arrays.stream(operations)
        .collect(Collectors.groupingBy(e -> e.toUpperCase()))
        .entrySet()
        .stream()
        .collect(Collectors.toMap(
            entry -> entry.getKey(),
            entry -> {
              return switch (entry.getKey()) {
                case ADD -> add.apply(value1, value2);
                case SUBTRACT -> subtract.apply(value1, value2);
                case MULTIPLY -> multiply.apply(value1, value2);
                case DIVIDE -> divideSafe.apply(value1, value2);
                default -> throw new IllegalStateException("Unexpected value: " + entry.getKey());
              };
            }
        ));

    // Map object for holding the results using Map methods
//    Map<String, Float> results = new HashMap<>();
//    results.put(ADD, add.apply(value1, value2));
//    results.put(SUBTRACT, subtract.apply(value1, value2));
//    results.put(MULTIPLY, multiply.apply(value1, value2));
//    results.put(DIVIDE, divideSafe.apply(value1, value2));
    
    // Populate the map here with the results of the 4 math operations
//    return results;
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public static void main(String[] args) {
    float value1 = 10f;
    float value2 = 20f;
    
    Map<String, Float> results = calculate(value1, value2);
    System.out.println(results);
  }
  
}
