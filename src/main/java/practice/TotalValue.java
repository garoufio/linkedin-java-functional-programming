package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TotalValue {
  
  static float getCartTotal(List<Item> items) {
    Map<Integer, Float> map = items
        .stream()
        .collect(Collectors.groupingBy(Item::getId))
        .entrySet()
        .stream()
        .collect(Collectors.toMap(
            k -> k.getKey(),
            v -> v.getValue()
                .stream()
                .map(i -> i.getPrice() * i.getQuantity())
                .reduce(0f, Float::sum)
        ));
    //System.out.println(map);
    
    return (map.entrySet().stream().reduce(0f, (acc, x) -> acc + x.getValue(), (acc1, acc2) -> acc2));
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public static void main(String[] args) {
    List<Item> items = new ArrayList<>();
    items.add(new Item(1, "shirt", 100, 2));
    items.add(new Item(2, "shoes", 3800, 1));
    items.add(new Item(3, "pants", 1500, 3));
    items.add(new Item(4, "hat", 70, 5));
    items.add(new Item(5, "jacket", 1250, 1));
    float result = getCartTotal(items);
    System.out.println(result);
  }
  
}
