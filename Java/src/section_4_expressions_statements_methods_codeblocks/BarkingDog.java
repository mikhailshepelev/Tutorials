package section_4_expressions_statements_methods_codeblocks;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean isDogBarking, int hourOfDay) {
        if (!isDogBarking || hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else return hourOfDay < 8 || hourOfDay > 22;
    }
}
