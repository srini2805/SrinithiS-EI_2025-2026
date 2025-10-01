package src;
public class VoiceAssistantControl implements ControlInterface {
    public void sendCommand(String command) {
        System.out.println("Voice Assistant executes: " + command);
    }
}