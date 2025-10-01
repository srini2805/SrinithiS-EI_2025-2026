package src;
import java.util.HashMap;
import java.util.Map;

public class Satellite {
    private int orbit = 1;
    private int dataCollected = 0;
    private int totalData = 0;
    private boolean active = true;
    private Direction currentDirection = Direction.NORTH;
    private boolean panelsActive = false;
    private int consecutiveInactive = 0;

    public int totalActive = 0;
    public int totalInactive = 0;
    public int northCount = 0, southCount = 0, eastCount = 0, westCount = 0;

    private final Map<Integer, Integer> orbitDataMap = new HashMap<>();

    public int getOrbit() { return orbit; }
    public boolean isActive() { return active; }
    public int getTotalData() { return totalData; }
    public Direction getCurrentDirection() { return currentDirection; }
    public int getDataCollected() { return dataCollected; }
    public boolean isPanelsActive() { return panelsActive; }

    public void rotate(Direction dir) {
        currentDirection = dir;
        switch (dir) {
            case NORTH -> northCount++;
            case SOUTH -> southCount++;
            case EAST -> eastCount++;
            case WEST -> westCount++;
        }
        LoggerService.getInstance().log("Orientation: " + dir + " in orbit " + orbit);
    }

    public void setPanels(boolean status) {
        panelsActive = status;
        LoggerService.getInstance().log("Solar panels: " + (status ? "Active" : "Inactive"));
        if (status) {
            totalActive++;
            consecutiveInactive = 0;
        } else {
            totalInactive++;
            dataCollected = 0;
            consecutiveInactive++;
            LoggerService.getInstance().log("Panels inactive: Data reset to 0 for this orbit");
        }
    }

    public void collectDataWithTransientCheck() {
        if (panelsActive) {
            dataCollected += 10;
            consecutiveInactive = 0;
            LoggerService.getInstance().log("Data Collected: " + dataCollected);
        } else {
            LoggerService.getInstance().error("Panels inactive. Data not collected.");
            if (consecutiveInactive >= 3) {
                LoggerService.getInstance().error("Error! Panels inactive 3 times.");
                try {
                    System.out.println("Waiting 5 seconds due to transient error...");
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                consecutiveInactive = 0;
            }
        }
    }

    public void advanceOrbit(int daysSpent) {
        totalData += dataCollected;
        orbitDataMap.put(orbit, dataCollected);

        LoggerService.getInstance().logOrbitSummary(orbit, daysSpent, dataCollected);

        orbit++;
        dataCollected = 0;
        panelsActive = false;

        if (orbit <= 7) {
            LoggerService.getInstance().logOrbitSeparator(orbit);
        }
    }

    public void destroy(String reason) {
        active = false;
        LoggerService.getInstance().error("SATELLITE DESTROYED: " + reason);
    }

    public void printMissionSummary() {
        System.out.println("================== MISSION COMPLETE ==================");
        System.out.println("Reached Mars Successfully");
        System.out.println("Total Data Collected: " + totalData + " units");
        System.out.println("Total Active States: " + totalActive);
        System.out.println("Total Inactive States: " + totalInactive);
        System.out.println("North Rotations: " + northCount);
        System.out.println("South Rotations: " + southCount);
        System.out.println("East Rotations: " + eastCount);
        System.out.println("West Rotations: " + westCount);
        System.out.println("\n--- Data Collected per Orbit ---");
        for (int i = 1; i <= 7; i++) {
            System.out.println("Orbit " + i + ": " + orbitDataMap.getOrDefault(i, 0) + " units");
        }
        System.out.println("======================================================");
    }
}
