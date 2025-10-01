package src;
public class RotateCommand implements Command {
    private final Satellite satellite;
    private final Direction dir;
    public RotateCommand(Satellite satellite, Direction dir) { this.satellite = satellite; this.dir = dir; }
    public void execute() { satellite.rotate(dir); }
}
