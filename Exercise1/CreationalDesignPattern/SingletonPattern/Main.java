public class Main {
    public static void main(String[] args) {
        // Both references point to the same PrinterManager
        PrinterManager printer1 = PrinterManager.getInstance();
        PrinterManager printer2 = PrinterManager.getInstance();

        printer1.printDocument("Resume.pdf");
        printer2.printDocument("Report.docx");

        if (printer1 == printer2) {
            System.out.println("Both clients use the same PrinterManager instance!");
        }
    }
}
