package chapter2;

public class Closure {
  
  public static void main(String[] args) {
    NoArgFunction<NoArgFunction<String>> fnGreeter = () -> {
      String name = "Iron Man";
      return () -> "Hello " + name;
    };
    
    NoArgFunction<String> fnHello = fnGreeter.apply();
    System.out.println(fnHello.apply());
  }
  
}
