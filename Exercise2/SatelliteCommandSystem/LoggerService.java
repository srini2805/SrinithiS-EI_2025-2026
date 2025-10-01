package src;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerService {
    private static LoggerService instance;
    private final Logger logger = Logger.getLogger("SatelliteMission");

    private LoggerService() {}

    public static synchronized LoggerService getInstance() {
        if (instance == null) instance = new LoggerService();
        return instance;
    }

    public void log(String msg) { logger.log(Level.INFO, msg); }
    public void error(String msg) { logger.log(Level.SEVERE, msg); }

    public void logOrbitSummary(int orbit, int days, int data) {
        System.out.println("================ ORBIT " + orbit + " SUMMARY ================");
        System.out.println("Days Spent: " + days);
        System.out.println("Data Collected: " + data + " units");
        System.out.println("=============================================================");
    }

    public void logOrbitSeparator(int nextOrbit) {
        System.out.println("\n================ ENTERING ORBIT " + nextOrbit + " ==================\n");
    }
}
