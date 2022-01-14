package section_5_control_flow_statements;

public class NumberOfDaysInMonthWExercise {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (year%4 != 0) {
            return false;
        } else if (year%100 != 0) {
            return true;
        } else {
            return year % 400 == 0;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        switch (month) {
            case 2 :
                if (isLeapYear(year)) return 29;
                else return 28;
            case 4 : case 6 : case 9 : case 11 :
                return 30;
            default:
                return 31;
        }
    }
}
