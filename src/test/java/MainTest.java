import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MainTest {

    private CalPos pos;

    @Before
    public void setUp() throws Exception {
        pos = new CalPos();
    }

    @Test
    public void should_calculate_total_prices_when_given_one_item() throws Exception {
        // given
        Item apple = new Item("apple", 10);

        // when
        double totalPrice = pos.calculate(apple);

        // then
        assertThat(totalPrice, is(10.0));
    }

    @Test
    public void should_calculate_total_prices_when_given_two_items() throws Exception {
        // given
        Item pear = new Item("pear", 3);
        List<Item> itemList = Arrays.asList(pear, pear);

        // when
        double totalPrice = pos.calculate(itemList);

        // then
        assertThat(totalPrice, is(6.0));
    }

    @Test
    public void should_calculate_total_prices_when_given_two_different_items() throws Exception {
        // given
        Item pear = new Item("pear", 3);
        Item apple = new Item("apple", 10);

        List<Item> itemList = Arrays.asList(pear, apple, apple);


        // when
        double totalPrice = pos.calculate(itemList);

        // then
        assertThat(totalPrice, is(23.0));
    }

    //
//     @Test
//    public void should_calculate_total_prices_when_given_one_pear_and_two_apple() throws Exception {
//        // given
//        Item apple = new Item("apple", 10);
//        Item pear = new Item("pear", 3);
//
//        // when
//        double totalPrice = pos.calculate(pear);
//
//        // then
//        assertThat(totalPrice, is(3.0));
//    }


}
