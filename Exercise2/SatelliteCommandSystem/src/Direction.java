package src;
public enum Direction {
    NORTH, EAST, SOUTH, WEST;

    public static Direction fromString(String input) {
        return switch (input.toUpperCase()) {
            case "N" -> NORTH;
            case "E" -> EAST;
            case "S" -> SOUTH;
            case "W" -> WEST;
            default -> null;
        };
    }
}
