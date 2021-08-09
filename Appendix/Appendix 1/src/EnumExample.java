public class EnumExample {
    private static void displayDay(Day day) {
        if(day == Day.SATURDAY) {
            System.out.println("It's Saturday! Weekend!!");
        } else if(day == Day.FRIDAY) {
            System.out.println("It's Friday! Weekend!!");
        } else {
            System.out.println("Weekday!");
        }

        switch (day) {
            case SATURDAY:
                System.out.println("It's Saturday! Weekend!!");
                break;
            case FRIDAY:
                System.out.println("It's Friday! Weekend!!");
                break;
            default:
                System.out.println("Weekday!");
                break;
        }
    }

    public static void main(String[] args) {
        Day[] days = Day.values();

        for(Day day : days) {
            System.out.println(day);
        }

        for (Day day : days) {
            displayDay(day);
        }
    }
}
