package src;
public class OrbitRules {
    public static boolean canAdvance(int orbit, int data, Direction dir) {
        if (dir != Direction.NORTH) return false;
        return switch (orbit) {
            case 1 -> data % 30 == 0 && data >= 30;
            case 2 -> data % 50 == 0 && data >= 50;
            case 3 -> data % 70 == 0 && data >= 70;
            case 4 -> data % 90 == 0 && data >= 90;
            case 5 -> data % 70 == 0 && data >= 70;
            case 6 -> data % 50 == 0 && data >= 50;
            case 7 -> data % 30 == 0 && data >= 30;
            default -> false;
        };
    }
}
