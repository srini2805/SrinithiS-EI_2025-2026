
import src.*;
public class Main{
    public static void main(String[] args) {
        Robot cleaner = new CleaningRobot(new VoiceAssistantControl());
        cleaner.performTask("Start Carpet Cleaning");
        
        Robot deliverer = new DeliveryRobot(new JoystickControl());
        deliverer.performTask("Deliver Parcel to Unit 305");
    }
}


