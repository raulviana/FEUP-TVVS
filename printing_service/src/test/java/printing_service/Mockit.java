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


@RunWith(MockitoJUnitRunner.class)
public class Mockit {

    Printer printer1;
    Printer printer2;

    private final PrintManager manager = new PrintManager();

    private List<Printer> printers;

    @BeforeEach
    public void setup() {
        printer1 = Mockito.mock(Printer.class);
        printer2 = Mockito.mock(Printer.class);

        when(printer1.getCapacity()).thenReturn(5);
        when(printer2.getCapacity()).thenReturn(10);
        printers = Arrays.asList(printer1, printer2);
    }

    @Test
    public void testTotalPrintingCapacity() {

        assertEquals(15, manager.calculateTotalPrintingCapacity(printers));
        Mockito.verify(printer1, Mockito.times(1)).getCapacity();
        Mockito.verify(printer2, Mockito.times(1)).getCapacity();
    }

}

