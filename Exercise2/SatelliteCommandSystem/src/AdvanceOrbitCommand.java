package src;

public class AdvanceOrbitCommand implements Command {
    private final Satellite satellite;
    private final int days;
    public AdvanceOrbitCommand(Satellite satellite, int days) { this.satellite = satellite; this.days = days; }
    public void execute() { satellite.advanceOrbit(days); }
}
