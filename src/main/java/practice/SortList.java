package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {
  
  // Return the largest number in the 'numbers' array.
  static List<Item> sortList(List<Item> items) {
    
    // Sort the result list using a lambda expression.
    List<Item> sortedItems = new ArrayList<>(items);
    sortedItems.sort((item1, item2) -> {
      return item1.getPrice() > item2.getPrice() ? 1 :
          item1.getPrice() < item2.getPrice() ? -1 : 0;
    });
    
    return sortedItems;
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public static void main(String[] args) {
    List<Item> items = new ArrayList<>();
    items.add(new Item(1, "shirt", 100));
    items.add(new Item(2, "shoes", 3800));
    items.add(new Item(3, "pants", 1500));
    items.add(new Item(4, "hat", 70));
    items.add(new Item(5, "jacket", 1250));
    List<Item> result = sortList(items);
    
    System.out.println(result);
  }
  
}
