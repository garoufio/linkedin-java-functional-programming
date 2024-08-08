package chapter2;

import java.util.function.BiFunction;
import java.util.function.Function;

public class HigherOrderFunctions {
  
  public static void main(String[] args) {
    BiFunction<Double, Double, Double> divide = (x, y) -> x / y;
    
    Function<BiFunction<Double, Double, Double>, BiFunction<Double, Double, Double>> secondArgCheck =
        (func) -> (x, y) -> {
          if (y == 0) {
            System.out.println("Cannot divide by zero");
            return 0d;
          }
          return func.apply(x, y);
        };
    
    BiFunction<Double, Double, Double> divideSafe = secondArgCheck.apply(divide);
    System.out.println(divideSafe.apply(45d, 5d));
    System.out.println(divideSafe.apply(10d, 0d));
    
    TriFunction<Double, Double, Double, Double> volume = (x, y, z) -> x * y * z;
    Function<TriFunction<Double, Double, Double, Double>, TriFunction<Double, Double, Double, Double>> argsCheck =
        (fun) -> (x, y, z) -> {
          if (x < 0 || y < 0 || z < 0) {
            System.out.println("Side cannot be less than zero");
            return 0d;
          }
          return fun.apply(x, y, z);
        };
    TriFunction<Double, Double, Double, Double> volumeSafe = argsCheck.apply(volume);
    System.out.println(volumeSafe.apply(3d, 4d, 2d));
    System.out.println(volumeSafe.apply(3d, 4d, -2d));
  }
  
}
