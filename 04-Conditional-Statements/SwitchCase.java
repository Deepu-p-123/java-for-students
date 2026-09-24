/*
 * SwitchCase.java
 * Demonstrates the switch statement, including fall-through and the
 * modern Java 14+ switch expression style.
 */
public class SwitchCase {
    public static void main(String[] args) {
        int day = 3;
        String dayName;

        // Traditional switch statement
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
            case 7:
                dayName = "Weekend";
                break;
            default:
                dayName = "Invalid day";
        }
        System.out.println("Day (traditional switch): " + dayName);

        // Modern switch expression (Java 14+)
        String result = switch (day) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> "Invalid day";
        };
        System.out.println("Day type (switch expression): " + result);
    }
}
