package printing_service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Utility class to manage the printing service.
 */
public class PrintManager {

    /**
     * Sorts the documents waiting to be printed by their priority.
     */
    void sortDocumentsByPriority (List<Document> documents) {
        Collections.sort(documents);
    }

    /**
     * Calculates the total printing capacity, that is, the number of pages that can be printed attending to the
     * printers available and their capacity.
     *
     * @return The total number of pages that can be printed.
     */
    int calculateTotalPrintingCapacity (List<Printer> printers) {

        int total = 0;

        for (Printer p: printers
             ) {
            total += p.capacity;
        }

        return total;
    }

    /**
     * Calculates the percentage of documents that will be printed according to the printers availability.
     *
     * @return The percentage of documents that will be printed.
     */
    int satisfiedPrintingPercentage(List<Document> documents, List<Printer> printers) {

        int numPagesToPrint = documents.stream().mapToInt(doc -> doc.num_pages).sum();
        int capacity = printers.stream().mapToInt(printer -> printer.capacity).sum();

        return capacity * 100 / numPagesToPrint;
    }

    // TODO: Make this method empty for workshop
    /**
     * Obtain a list with the ids of the documents that the printing service will not be able to print, according
     * to the printers available.
     *
     * @return A list containing the ids of the documents that will not be printed by the printing service.
     */
    List<Integer> missingDocuments(List<Document> documents, List<Printer> printers) {

        List<Integer> result = new ArrayList<>();
        int capacity = printers.stream().mapToInt(printer -> printer.capacity).sum();

        this.sortDocumentsByPriority(documents);

        for(Document doc : documents) {
            capacity -= doc.num_pages;

            if(capacity < 0) result.add(doc.id);
        }

        return result;
    }

    /**
     * Obtain a list with the ids of the printers that will not be used to satisfy the printing service.
     *
     * @return A list containing the ids of the printers that will not be used by the printing service.
     */
    List<Printer> unusedPrinters(List<Document> documents, List<Printer> printers) {

        List<Printer> result = new ArrayList<>();
        int numPagesToPrint = documents.stream().mapToInt(doc -> doc.num_pages).sum();

        this.sortDocumentsByPriority(documents);

        for(Printer printer : printers) {
            numPagesToPrint -= printer.capacity;

            if(numPagesToPrint < 0 && Math.abs(numPagesToPrint) >= printer.capacity) result.add(printer);
        }

        return result;
    }

}
