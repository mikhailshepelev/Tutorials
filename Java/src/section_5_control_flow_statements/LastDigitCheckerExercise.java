package section_5_control_flow_statements;

public class LastDigitCheckerExercise {
    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }

    public static boolean hasSameLastDigit(int first, int second, int third) {
        if (!isValid(first) || !isValid(second) || !isValid(third)) return false;

        int firstRightMost = first % 10;
        int secondRightMost = second % 10;
        int thirdRightMost = third % 10;

        return firstRightMost == secondRightMost || firstRightMost == thirdRightMost || secondRightMost == thirdRightMost;
    }
}
