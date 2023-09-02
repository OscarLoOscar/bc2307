import java.time.LocalDate;

public class DemoSwitch {
    // static final (constant) (0-2)
    // instance variable(1X)
    // static variable (1-2)
    // constructors
    // public instance methods //main logic
    // static methods //tools
    // private method
    public static void main(String[] args) throws Exception {
        // seitch expression
        Weekday weekday = Weekday.MON;
        LocalDate.now();
        // Approch 1
        int result = switch (weekday) {
            case MON -> 1;
            case TUE -> 2;
            case WED -> 3;
            case THU -> 4;
            case FRI -> 5;
        };

        int result2 = switch (weekday) {
            case MON, TUE -> 1;
            // case TUE -> 2;
            case WED -> 3;
            case THU -> 4;
            case FRI -> 5;
        };
        // Approach 2
        int result3 = switch (weekday) {
            case MON:
                System.out.println("Monday");
                yield 1; // means return f
            case TUE:
                System.out.println("Tuesday");
                yield 2; // means return f

            case WED:
                System.out.println("Wednesday");
                yield 3; // means return f

            case THU:
                System.out.println("Thursday");
                yield 4; // means return f

            case FRI:
                System.out.println("Friday");
                yield 5; // means return f
        };
        System.out.println(result3);
    }

    public static int getDayNumber(Weekday weekday) {
        switch (weekday) {
            case MON:
                return 1;
            case TUE:
                return 2;
            case WED:
                return 3;
            case THU:
                return 4;
            case FRI:
                return 5;
            default:
                return 0;
        }
    }

    public static char grade(int score) {
        char grade = ' ';
        switch (score) {
            case 90:
                grade = 'A';
                break;
            case 80:
                grade = 'B';
                break;
            default:
                grade = 'F';
        }
        return 'C';
    }
}
