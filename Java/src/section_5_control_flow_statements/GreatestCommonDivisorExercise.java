package section_5_control_flow_statements;

public class GreatestCommonDivisorExercise {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) return -1;

        int greatestCommonDivisor = 1;
        int divisor = 1;
        int minNumber = Math.min(first, second);

        while (divisor <= minNumber) {
            if (first % divisor == 0 && second % divisor == 0) {
                greatestCommonDivisor = divisor;
            }
            divisor ++;
        }

        return greatestCommonDivisor;
    }
}
