package chapter2;

import java.util.function.Function;

public class Closure {
  
  public static void main(String[] args) {
    NoArgFunction<NoArgFunction<String>> fnGreeter = () -> {
      String name = "Iron Man";
      return () -> "Hello " + name;
    };
    
    NoArgFunction<String> fnHello = fnGreeter.apply();
    System.out.println(fnHello.apply());
    
    Function<String, NoArgFunction<String>> fnSecondGreeter = (msg) -> {
      String greeting = "Hola";
      return () -> greeting + msg;
    };
    NoArgFunction<String> fnSecondHello = fnSecondGreeter.apply(" Amigos");
    System.out.println(fnSecondHello.apply());
  }
  
}
