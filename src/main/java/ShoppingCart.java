import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {
    private List<Item> itemsList;
    public ShoppingCart(Item... items) {
        itemsList = Arrays.asList(items);


    }

    public Map<String,Integer> getItemsWithAmount() {
        Map<String, Integer> map = new HashMap<>();
        for (Item item : itemsList) {
            if (map.containsKey(item.getName())) {
                map.put(item.getName(),map.get(item.getName()) + 1);
            } else {
                map.put(item.getName(),1);
            }
        }
        return map;
    }
}
