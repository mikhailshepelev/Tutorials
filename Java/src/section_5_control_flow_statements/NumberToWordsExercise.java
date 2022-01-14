package section_5_control_flow_statements;

import java.util.*;

public class NumberToWordsExercise {

    static Map<Character, String> map = new HashMap<>();

    static {
        map.put('0', "Zero");
        map.put('1', "One");
        map.put('2', "Two");
        map.put('3', "Three");
        map.put('4', "Four");
        map.put('5', "Five");
        map.put('6', "Six");
        map.put('7', "Seven");
        map.put('8', "Eight");
        map.put('9', "Nine");
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        String inputNumber = Integer.toString(number);

        for (int i = 0; i < inputNumber.length(); i++) {
            System.out.println(map.get(inputNumber.charAt(i)));
        }
    }

    public static int reverse(int number) {
        String inputNumber = Integer.toString(Math.abs(number));
        StringBuilder sb = new StringBuilder(inputNumber);
        sb.reverse();

        if (number < 0) {
            return Math.negateExact(Integer.parseInt(sb.toString()));
        }

        return Integer.parseInt(sb.toString());
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;

        return Integer.toString(number).length();
    }
}
