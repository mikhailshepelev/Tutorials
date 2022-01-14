package section_4_expressions_statements_methods_codeblocks;

public class LeapYearCalculator {
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
}
