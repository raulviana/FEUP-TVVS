package printing_service;

/**
 * Class to represent a document to print in the printing service.
 */
public class Document implements Comparable<Document>{

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

    @Override public int compareTo(Document doc) {
        return Integer.compare(this.priority, doc.priority);
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", priority=" + priority +
                ", num_pages=" + num_pages +
                '}';
    }
}
