package printing_service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class TestCoverage {

    Document doc1 = new Document(1, 3, 4);
    Document doc2 = new Document(2, 1, 3);
    Document doc3 = new Document(3, 2, 7);
    Document doc4 = new Document(4, 4, 2);
    int totalPagesToBePrinted = 16;
    List<Document> docs = Arrays.asList(doc1, doc2, doc3, doc4);

    Printer printer1 = new Printer(1, 3);
    Printer printer2 = new Printer(2, 1);
    Printer printer3 = new Printer(3, 2);
    Printer printer4 = new Printer(4, 1);

    int totalPrintingCapacity = 7;
    List<Printer> printers = Arrays.asList(printer1, printer2, printer3, printer4);


    // Uncomment the following block for exercise 1

    /*@Test
    public void testSatisfiedPrintingPercentage() {

        PrintManager pm = new PrintManager();
        int actual = pm.satisfiedPrintingPercentage(docs, printers);
        int expected = totalPrintingCapacity * 100 / totalPagesToBePrinted;

        Assertions.assertEquals(expected, actual);
    }*/


    // TODO: Hide the following block for exercise 1

    /*@Test
    public void testSatisfiedPrintingPercentage_exceedingPrintingCapacity() {

        PrintManager pm = new PrintManager();
        int actual = pm.satisfiedPrintingPercentage(
                docs,
                Stream.concat(
                        printers.stream(),
                        Stream.of(new Printer(5, 100)))
                        .collect(Collectors.toList()));

        Assertions.assertEquals(100, actual);
    }*/


    // TODO: Hide the following block for exercise 2

    /*@Test
    public void testSatisfiedPrintingPercentage_zeroPrintingCapacity() {

        PrintManager pm = new PrintManager();
        int actual = pm.satisfiedPrintingPercentage(docs, Collections.emptyList());

        Assertions.assertEquals(0, actual);
    }

    @Test
    public void testSatisfiedPrintingPercentage_zeroDocuments() {

        PrintManager pm = new PrintManager();
        int actual = pm.satisfiedPrintingPercentage(Collections.emptyList(), printers);

        Assertions.assertEquals(0, actual);
    }*/

    // Uncomment the following block for exercise 3

    /*@Test
    public void testMissingDocuments() {

        PrintManager pm = new PrintManager();
        List<Integer> actual = pm.missingDocuments(docs, printers);
        List<Integer> expected = Arrays.asList(3, 1, 4);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMissingDocuments_withPartialPrint() {

        PrintManager pm = new PrintManager();
        List<Integer> actual = pm.missingDocuments(docs, Stream.concat(
                printers.stream(),
                Stream.of(new Printer(5, 1)))
                .collect(Collectors.toList()));
        List<Integer> expected = Arrays.asList(3, 1, 4);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMissingDocuments_zeroPrintingCapacity() {

        PrintManager pm = new PrintManager();
        List<Integer> actual = pm.missingDocuments(docs, Collections.emptyList());
        List<Integer> expected = Arrays.asList(2, 3, 1, 4);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMissingDocuments_zeroDocuments() {

        PrintManager pm = new PrintManager();
        List<Integer> actual = pm.missingDocuments(Collections.emptyList(), printers);

        Assertions.assertEquals(Collections.emptyList(), actual);
    }*/


    // Uncomment the following block for exercise 4
    /*
    @Test
    public void testUnusedPrinters() {

        PrintManager pm = new PrintManager();
        List<Integer> actual = pm.missingDocuments(docs, Stream.concat(
                printers.stream(),
                Stream.of(new Printer(5, 12), new Printer(5, 100)))
                .collect(Collectors.toList()));
        List<Printer> expected = Arrays.asList(new Printer(5, 100));

        Assertions.assertEquals(expected, actual);
    }
    */

    // TODO: Following block is the solution for exercise 3

    /*@Test
    public void testUnusedPrinters() {

        Printer unusedPrinter = new Printer(5, 100);
        PrintManager pm = new PrintManager();
        List<Printer> actual = pm.unusedPrinters(docs, Stream.concat(
                printers.stream(),
                Stream.of(new Printer(5, 12), unusedPrinter))
                .collect(Collectors.toList()));
        List<Printer> expected = Arrays.asList(unusedPrinter);

        Assertions.assertEquals(expected, actual);
    }*/

}
