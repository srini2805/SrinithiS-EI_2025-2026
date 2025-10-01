package src;
public abstract class WorkoutRoutine {
   
    public final void performRoutine() {
        warmUp();
        mainExercise();
        coolDown();
    }

    private void warmUp() {
        System.out.println("Warming up: 5 minutes of stretching");
    }

    protected abstract void mainExercise();

    private void coolDown() {
        System.out.println("Cooling down: 5 minutes of slow walking");
    }
}