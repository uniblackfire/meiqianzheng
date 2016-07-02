import java.util.List;
import java.util.Map;

public class PosCalculator {

    public double calculate(Item item) {
        return item.getPrice();
    }

    public double calculate(List<Item> itemList) {
        double result = 0.0;
        for (Item item : itemList) {
            result += item.getPrice();
        }
        return result;
    }

    public double calculate(ShoppingCart shoppingCart) {
        Map<Item, Integer> map = shoppingCart.getItemsWithAmount();
        double result = 0.0;
        for (Item item : map.keySet()) {
            result += item.getPrice() * map.get(item);
        }

        if (result >= 100.0) {
            int exceedsTimes = (int) result / 100;
            result -= exceedsTimes * 10.0f;
        }
        return result;
    }
}
