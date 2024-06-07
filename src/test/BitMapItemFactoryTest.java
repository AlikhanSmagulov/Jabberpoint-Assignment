import static org.junit.jupiter.api.Assertions.*;

import main.java.model.factory.BitmapItemFactory;
import main.java.model.items.BitmapItem;
import main.java.model.items.SlideItem;
import org.junit.jupiter.api.Test;

public class BitMapItemFactoryTest {
    @Test
    void testCreateSlideItem() {
        BitmapItemFactory factory = new BitmapItemFactory();
        SlideItem item = factory.createSlideItem(4, "random.png");

        assertInstanceOf(BitmapItem.class, item);

        BitmapItem bitmapItem = (BitmapItem) item;

        assertEquals(4, bitmapItem.getLevel());
    }
}
