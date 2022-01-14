package section_5_control_flow_statements;

public class FlourPackProblemExercise {

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 6));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        while (goal >= 5 && bigCount > 0) {
            goal -= 5;
            bigCount--;
        }
        while (goal > 0 && smallCount > 0) {
            goal--;
            smallCount--;
        }

        return goal == 0;
    }
}
