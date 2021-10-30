package printing_service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class TestCoverage {

    @Test
    public void testSortDocuments() {

        Document doc1 = new Document(1, 3, 4);
        Document doc2 = new Document(2, 1, 3);
        Document doc3 = new Document(3, 2, 7);
        Document doc4 = new Document(4, 1, 2);

        List<Document> docs = Arrays.asList(doc1, doc2, doc3, doc4);
        List<Document> expected = Arrays.asList(doc2, doc4, doc3, doc1);

        PrintManager pm = new PrintManager();
        pm.sortDocumentsByPriority(docs);

        Assertions.assertEquals(expected, docs);
    }

    @Test
    public void testTotalPrintingCapacity() {

        Printer printer1 = new Printer(1, 3);
        Printer printer2 = new Printer(2, 1);
        Printer printer3 = new Printer(3, 2);
        Printer printer4 = new Printer(4, 1);

        List<Printer> printers = Arrays.asList(printer1, printer2, printer3, printer4);

        PrintManager pm = new PrintManager();
        int totalPrintingCapacity = pm.calculateTotalPrintingCapacity(printers);

        Assertions.assertEquals(7, totalPrintingCapacity);
    }

    @Test
    public void testToStringMethods() {
        Document doc = new Document(1, 3, 4);
        Printer printer = new Printer(1, 3);

        Assertions.assertEquals("Document {id=1, priority=3, num_pages=4}", doc.toString());
        Assertions.assertEquals("Printer {id=1, capacity=3}", printer.toString());
    }
}
