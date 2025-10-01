package src;
public class OrbitManager {
    private int rotationCount = 0;
    private final int maxRotationsPerDay = 2;

    public void recordRotation() { rotationCount++; }
    public boolean isDayOver() { return rotationCount >= maxRotationsPerDay; }
    public void resetDay() { rotationCount = 0; }
}
