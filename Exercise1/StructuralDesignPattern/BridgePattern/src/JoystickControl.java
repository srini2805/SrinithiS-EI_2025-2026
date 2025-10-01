package src;
public class JoystickControl implements ControlInterface {
    public void sendCommand(String command) {
        System.out.println("Joystick triggers: " + command);
    }
}
