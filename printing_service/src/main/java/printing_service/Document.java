package printing_service;

/**
 * Class to represent a document to print in the printing service.
 */
public class Document {

    int id;
    int priority;
    int num_pages;

    /**
     * Class constructor specifying the document id, priority in the list and number of pages.
     */
    public Document(int id, int priority, int pages) {
        this.id = id;
        this.priority = priority;
        this.num_pages = pages;
    }

}
