package src;
public class DeliveryRobot extends Robot {
    public DeliveryRobot(ControlInterface control) {
        super(control);
    }


    public void performTask(String task) {
        control.sendCommand("Delivering: " + task);
    }
}