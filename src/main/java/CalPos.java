import java.util.List;

public class CalPos {

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
}
