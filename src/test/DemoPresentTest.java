

import main.java.accessor.DemoPresentation;
import main.java.model.Presentation;
import main.java.model.Slide;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DemoPresentationTest {
    @Test
    void testLoadFile() {
        DemoPresentation demoPresentation = new DemoPresentation();
        Presentation presentation = new Presentation();
        demoPresentation.loadFile(presentation, "");

        assertEquals("Habibi", presentation.getTitle());
        assertEquals(5, presentation.getSize());

        Slide slide = presentation.getSlide(0);
        assertEquals("JabberPoint", slide.getTitle());

        slide = presentation.getSlide(1);
        assertEquals("Demonstration of levels and styles", slide.getTitle());

        slide = presentation.getSlide(4);
        assertEquals("The fifth slide", slide.getTitle());
    }

    @Test
    void testSaveFile() {
        DemoPresentation demoPresentation = new DemoPresentation();
        Presentation presentation = new Presentation();

        assertThrows(IllegalStateException.class, () -> demoPresentation.saveFile(presentation, ""), "Save As->Demo! should throw an IllegalStateException");
    }
}
