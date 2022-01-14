package section_5_control_flow_statements;

public class FirstAndLastDigitSumExercise {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        String numberAsString = Integer.toString(number);

        if (numberAsString.length() < 2) {
            return number + number;
        } else {
            String firstDigit = numberAsString.substring(0, 1);
            String lastDigit = numberAsString.substring(numberAsString.length()-1);

            return Integer.parseInt(firstDigit) + Integer.parseInt(lastDigit);
        }
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(4567));
    }
}
