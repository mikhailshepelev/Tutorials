package section_5_control_flow_statements;

public class PrintFactorsExercise {
    public static void printFactors(int number) {
        if (number < 1) System.out.println("Invalid Value");

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) System.out.println(i);
        }
    }
}
