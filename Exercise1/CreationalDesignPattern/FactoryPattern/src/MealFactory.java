package src;
public class MealFactory {
    public static Meal createMeal(String type) {
        if ("VEG".equalsIgnoreCase(type)) {
            return new VegMeal();
        } else if ("NONVEG".equalsIgnoreCase(type)) {
            return new NonVegMeal();
        } else {
            throw new IllegalArgumentException("Unknown meal type: " + type);
        }
    }
}