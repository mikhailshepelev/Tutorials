package section_5_control_flow_statements;

public class LargestPrimeExercise {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) return -1;

        int largestPrime = -1;
        for (int i = number; i >= 2; i--) {

            if (number % i == 0) {
                boolean isPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    largestPrime = i;
                    break;
                }
            }
        }

        return largestPrime;
    }
}
