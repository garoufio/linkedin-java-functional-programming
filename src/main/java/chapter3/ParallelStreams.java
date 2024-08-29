package chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreams {
  
  public static void main(String[] args) {
    String[] words = { "functional", "programming", "has", "more", "fun", "than", "ever" };
    List<String> wordsList = new ArrayList<String>(Arrays.asList(words));
    
    List<String> processedWordsList = wordsList
        .parallelStream()
        .map(word -> {
          System.out.println("Uppercasing " + word);
          return word.toUpperCase();
        })
        .map(word -> {
          System.out.println("Adding exclamation mark to " + word);
          return word + "!";
        })
        .collect(Collectors.toList());
    System.out.println(processedWordsList);
  }
  
}
