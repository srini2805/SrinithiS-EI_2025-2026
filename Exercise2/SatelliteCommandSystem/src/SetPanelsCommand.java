package src;
public class SetPanelsCommand implements Command {
    private final Satellite satellite;
    private final boolean status;
    public SetPanelsCommand(Satellite satellite, boolean status) { this.satellite = satellite; this.status = status; }
    public void execute() { satellite.setPanels(status); }
}
