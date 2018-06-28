import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void itemsWithDifferentNamesArentEaual() {
        assertNotEquals(new Item2("item1", 123.12), new Item2("item2", 123.12));
    }

    @Test
    public void ispricequals(){

        Item ik = new Item("ba", 2.123);
        Item ik2 = new Item("qwa",2.123);
        Assert.assertNotEquals(ik, ik2);
    }


}