package src;
public abstract class Robot{
    protected ControlInterface control;

    protected Robot(ControlInterface control) {
        this.control = control;
    }

    public abstract void performTask(String task);
}