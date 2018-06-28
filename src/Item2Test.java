import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class Item2Test {

    @Test
    public void twoItemsWIthTheSamePriceAndNameShouldBeEqual() {
        assertEquals(new Item2("item", 123.12), new Item2("item", 123.12));
    }

    @Test
    public void itemsWithDifferentNamesArentEaual() {
        assertNotEquals(new Item2("item1", 123.12), new Item2("item2", 123.12));
    }

    @Test
    public void itemsWithDifferentPriceArentEaual() throws Exception {
        assertNotEquals(new Item2("item", 123.21), new Item2("item", 123.12));
    }

    @Test
    public void itemsWithTheSameNameShouldHaveTheSameHashCode() {
        assertEquals(new Item2("item", 123).hashCode(), new Item2("item", 321).hashCode());
    }

    @Test
    public void itemsWithDifferentNameShouldHaveDifferentHashCode() {
        assertNotEquals(new Item2("item1", 123).hashCode(), new Item2("item2", 321).hashCode());
    }

    @Test
    public void itemsWithDifferentPriceAndTheSameNameShouldBeOrdered() {
        assertEquals(-1, new Item2("item1", 0.1).compareTo(new Item2("item1", 0.2)));
    }
}