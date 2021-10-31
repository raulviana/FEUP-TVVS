package printing_service;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class Mockit {

        private PrintManager manager = new PrintManager();

        private List<Printer> printers = new ArrayList<>();

        @Mock Printer printer1 = new Printer(1, 1);
        @Mock Printer printer2 = new Printer(2, 1);
        @Mock PrintManager manager2 = new PrintManager();

        @Test
        public void testTotalPrintingCapacity() {
            printers.add(printer1);
            printers.add(printer2);
            Mockito.when(printer1.getCapacity()).thenReturn(5);
            Mockito.when(printer2.getCapacity()).thenReturn(10);
            assertEquals(15, manager.calculateTotalPrintingCapacity(printers));
        }

    }

