import static org.junit.jupiter.api.Assertions.*;

import main.java.accessor.DemoPresentation;
import main.java.accessor.XMLAccessor;
import main.java.model.Presentation;
import org.junit.jupiter.api.Test;

public class XMLAccessorTest {
    @Test
    void testSaveFile() {
        DemoPresentation demoPresentation = new DemoPresentation();
        Presentation presentation = new Presentation();
        demoPresentation.loadFile(presentation, "");

        XMLAccessor accessor = new XMLAccessor();
        assertThrows(() -> accessor.saveFile(presentation, "test.xml"));
    }
}
