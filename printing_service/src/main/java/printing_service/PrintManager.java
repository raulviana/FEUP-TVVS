package printing_service;

import java.util.ArrayList;
import java.util.List;

/**
 * Utility class to manage the printing service.
 */
public class PrintManager {

    /**
     * Calculates the percentage of documents that will be printed according to the printers available.
     *
     * @return The percentage of documents that will be printed.
     */
    int satisfiedPrintingPercentage(List<Document> documents, List<Printer> printers) {

        int counter = 0;

        return counter;
    }

    /**
     * Obtain a list with the ids of the documents that the printing service will not be able to print, according
     * to the printers available.
     *
     * @return A list containing the ids of the documents that will not be printed by the printing service.
     */
    List<Integer> missingDocuments(List<Document> documents, List<Printer> printers) {

        List<Integer> result = new ArrayList<>();

        return result;
    }

    /**
     * Obtain a list with the ids of the printers that will not be used to satisfy the printing service.
     *
     * @return A list containing the ids of the printers that will not be used by the printing service.
     */
    List<Printer> unusedPrinters(List<Document> documents, List<Printer> printers) {

        List<Printer> result = new ArrayList<>();

        return result;
    }

}
