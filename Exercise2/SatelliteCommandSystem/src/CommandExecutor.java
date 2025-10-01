package src;
public class CommandExecutor {
    public void run(Command cmd) {
        try {
            cmd.execute();
            System.out.println(); 
        } catch (Exception e) {
            LoggerService.getInstance().error("Error executing command: " + e.getMessage());
        }
    }
}
