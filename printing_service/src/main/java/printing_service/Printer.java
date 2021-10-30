package printing_service;

/**
 * Class to represent a printer in the printing service.
 */
public class Printer {

    int id;
    int capacity;

    /**
     * Class constructor specifying the printer id and its capacity.
     * Note: the printer capacity corresponds to the number of pages it can print.
     */
    public Printer(int id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }
}
