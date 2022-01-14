package section_5_control_flow_statements;

public class EvenDigitSumExercise {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        while (number > 0) {
            int tempValue = number % 10;
            if (tempValue % 2 == 0) {
                sum += tempValue;
            }
            number = number / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(2457));
    }
}
