package section_5_control_flow_statements;

import java.util.Scanner;

public class InputCalculatorExercise {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage() {

        final Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int amountOfNumbers = 0;

        while (true) {
            try {
                int input = scanner.nextInt();
                sum += input;
                amountOfNumbers++;
            } catch (Exception e) {
                break;
            }
        }

        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum/(double) amountOfNumbers));
    }
}
