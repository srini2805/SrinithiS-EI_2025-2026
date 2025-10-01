import src.*;
import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Satellite sat = new Satellite();
        OrbitManager orbitManager = new OrbitManager();
        CommandExecutor executor = new CommandExecutor();

        int totalDays = 0;

        LoggerService.getInstance().log("Starting Satellite Mission...");

        while (sat.isActive() && sat.getOrbit() <= 7) {
            int orbit = sat.getOrbit();
            orbitManager.resetDay();
            int daysSpent = 0;

            LoggerService.getInstance().log("Orbit " + orbit + " begins.");

            while (sat.isActive()) {
                orbitManager.recordRotation();

                Direction dir = null;
                while (dir == null) {
                    System.out.print("Enter direction (N/E/S/W): ");
                    String input = scanner.nextLine();
                    dir = Direction.fromString(input);
                    if (dir == null) System.out.println("Invalid direction. Try again.");
                }
                executor.run(new RotateCommand(sat, dir));

               
                Boolean panelStatus = null;
                while (panelStatus == null) {
                    System.out.print("Activate solar panels? (y/n): ");
                    String input = scanner.nextLine().trim().toLowerCase();
                    if (input.equals("y")) panelStatus = true;
                    else if (input.equals("n")) panelStatus = false;
                    else System.out.println("Invalid input. Enter y or n.");
                }
                executor.run(new SetPanelsCommand(sat, panelStatus));
                executor.run(new CollectDataCommand(sat));

        
                if (OrbitRules.canAdvance(orbit, sat.getDataCollected(), sat.getCurrentDirection())) {
                    daysSpent++;
                    totalDays += daysSpent;
                    executor.run(new AdvanceOrbitCommand(sat, daysSpent));
                    System.out.println(); 
                    System.out.println();
                    break;
                }

                if (orbitManager.isDayOver()) {
                    daysSpent++;
                    totalDays++;
                    LoggerService.getInstance().log("Day " + daysSpent + " ended in orbit " + orbit);
                    System.out.println();
                    orbitManager.resetDay();
                }
            }
        }

        sat.printMissionSummary();
    }
}
