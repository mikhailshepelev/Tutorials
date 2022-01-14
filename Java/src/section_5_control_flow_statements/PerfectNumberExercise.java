package section_5_control_flow_statements;

public class PerfectNumberExercise {
    public static boolean isPerfectNumber(int number) {
        if (number < 1) return false;

        int sumOfProperPositiveDivisors = 0;

        for (int i = 1; i < number; i++) {
            if (number%i == 0) {
                sumOfProperPositiveDivisors += i;
            }
        }

        return sumOfProperPositiveDivisors == number;
    }
}
