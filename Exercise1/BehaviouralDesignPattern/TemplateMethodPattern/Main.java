import src.*;

public class Main{
    public static void main(String[] args) {
        WorkoutRoutine cardio = new CardioWorkout();
        System.out.println("Cardio Routine:");
        cardio.performRoutine();

        System.out.println();

        WorkoutRoutine strength = new StrengthWorkout();
        System.out.println("Strength Routine:");
        strength.performRoutine();
    }
}