enum WeekDays {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

public class Days {
    public static void main(String[] args) {

        WeekDays weekDay = WeekDays.MONDAY;
        // WeekDays weekDay = WeekDays.THURSDAY;
        // WeekDays weekDay = WeekDays.WEDNESDAY;
        // WeekDays weekDay = WeekDays.THURSDAY;
        // WeekDays weekDay = WeekDays.FRIDAY;
        // WeekDays weekDay = WeekDays.SATURDAY;
        // WeekDays weekDay = WeekDays.SUNDAY;

        switch (weekDay) { // Use the variable weekDay here (Object Referance)
            case MONDAY:
                System.out.println("Monday");
                break;
            case TUESDAY:
                System.out.println("Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Wednesday");
                break;
            case THURSDAY:
                System.out.println("Thursday");
                break;
            case FRIDAY:
                System.out.println("Friday");
                break;
            case SATURDAY:
                System.out.println("Saturday");
                break;
            case SUNDAY:
                System.out.println("Sunday");
                break;
            default:
                break;
        }
    }
}
