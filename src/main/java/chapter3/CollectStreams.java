package chapter3;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class CollectStreams {
  
  public static void main(String[] args) {
    String[] words = { "hello", "hello", "world", "functional", "programming", "is", "cool" };
    List<String> wordsList = new ArrayList<String>(Arrays.asList(words));
    
    // toList
    List<String> wordsWith5CharactersAndMore = wordsList
        .stream()
        .filter((word) -> word.length() >= 5)
        .collect(Collectors.toList());
    System.out.println(wordsWith5CharactersAndMore);
    
    // joining
    System.out.println(
        wordsWith5CharactersAndMore
            .stream()
            .collect(Collectors.joining(" & "))
    );
    
    // toSet
    Set<String> wordsSet = wordsList
        .stream()
        .filter((word) -> word.length() == 5)
        .collect(Collectors.toSet());
    System.out.println(wordsSet);
    
    // counting
    System.out.println(
        wordsSet
            .stream()
            .collect(Collectors.counting())
    );
    
    // groupingBy
    Map<Integer, List<String>> wordsMap =
        wordsList
            .stream()
            .collect(Collectors.groupingBy(word -> word.length()));
    System.out.println(wordsMap);
    
    // partitioningBy
    System.out.println(
        wordsList
            .stream()
            .collect(Collectors.partitioningBy(word -> word.length() >= 5))
    );
    
  }
  
}
