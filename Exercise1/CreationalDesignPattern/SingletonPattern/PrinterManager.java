
public class PrinterManager {
    
    private static final PrinterManager instance = new PrinterManager();
	
    private PrinterManager() {}

    
    public static PrinterManager getInstance() {
        return instance;
    }

    public void printDocument(String documentName) {
        System.out.println("Printing: " + documentName);
    }
}

