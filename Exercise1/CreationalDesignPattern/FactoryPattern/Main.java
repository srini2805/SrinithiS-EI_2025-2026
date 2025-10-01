
import src.*;
public class Main{
    public static void main(String[] args) {
        Meal vegMeal = MealFactory.createMeal("VEG");
        vegMeal.prepare();

        Meal nonVegMeal = MealFactory.createMeal("NONVEG");
        nonVegMeal.prepare();
    }
}


