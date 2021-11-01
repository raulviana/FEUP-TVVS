package printing_service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;


public class Mockit {

    Printer printer1;
    Printer printer2;
    Document document1;
    Document document2;

    private final PrintManager manager = new PrintManager();
    private List<Printer> printers;
    private List<Document> documents;

    @BeforeEach
    public void setup() {
        printer1 = Mockito.mock(Printer.class);
        printer2 = Mockito.mock(Printer.class);
        document1 = Mockito.mock(Document.class);
        document2 = Mockito.mock(Document.class);

        when(printer1.getCapacity()).thenReturn(10);
        when(printer2.getCapacity()).thenReturn(10);
        when(document1.getNumPages()).thenReturn(20);
        when(document2.getNumPages()).thenReturn(20);
        printers = Arrays.asList(printer1, printer2);
        documents = Arrays.asList(document1, document2);
    }

    @Test
    public void testTotalPrintingCapacity() {

        assertEquals(20, manager.calculateTotalPrintingCapacity(printers));
        Mockito.verify(printer1, Mockito.times(1)).getCapacity();
        Mockito.verify(printer2, Mockito.times(1)).getCapacity();
    }

    @Test
    public void testSatisfiedPrintingCapacity() {
        assertEquals(50, manager.satisfiedPrintingPercentage(documents, printers));
        Mockito.verify(document1, Mockito.times(1)).getNumPages();
        Mockito.verify(document2, Mockito.times(1)).getNumPages();
        Mockito.verify(printer1, Mockito.times(1)).getCapacity();
        Mockito.verify(printer2, Mockito.times(1)).getCapacity();
    }

}

