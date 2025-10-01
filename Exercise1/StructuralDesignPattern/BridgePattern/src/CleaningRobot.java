package src;
public class CleaningRobot extends Robot {
    public CleaningRobot(ControlInterface control) {
        super(control);
    }

    @Override
    public void performTask(String task) {
        control.sendCommand("Cleaning: " + task);
    }
}
