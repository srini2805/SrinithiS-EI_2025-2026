package src;
public class NonVegMeal implements Meal {
    @Override
    public void prepare() {
        System.out.println("Preparing a delicious non-vegetarian meal.");
    }
}
