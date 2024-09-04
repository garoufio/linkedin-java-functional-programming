package practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilteredData {
  
  public static List<Item> getFilteredData(List<Item> items, float maxPrice) {
    return items
        .stream()
        .filter(item -> item.getQuantity() * item.getPrice() <= maxPrice)
        .sorted(Comparator.comparing(Item::getPrice))
        .collect(Collectors.toList());
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public static void main(String[] args) {
    List<Item> items = new ArrayList<>();
    items.add(new Item(1, "shirt", 100, 2));
    items.add(new Item(2, "shoes", 3800, 1));
    items.add(new Item(3, "pants", 1500, 3));
    items.add(new Item(4, "hat", 70, 5));
    items.add(new Item(5, "jacket", 1250, 1));
    
    // Max price to filter for
    float maxPrice = 400f;
    
    List<Item> result = getFilteredData(items, maxPrice);
    System.out.println(result);
  }
  
}
